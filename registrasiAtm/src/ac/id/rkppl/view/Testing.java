package ac.id.rkppl.view;
/**
 * @author ahmad alamsyah
 * @date 27 Mei 2013
 */

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import ac.id.rkkpl.impl.NasabahImpl;
import ac.id.rkppl.controller.Controller;
import ac.id.rkppl.model.Nasabah;

public class Testing {
	
	
	@Test
	public void testLogin(){
		Nasabah nasabah = new Nasabah();
		nasabah.setPinNasabah("12345");
		Nasabah nasabah1= new Nasabah();
		nasabah1.setPinNasabah("123456");
		NasabahImpl.getInstance().saveNasabah(nasabah,nasabah1);
		Controller controller = new Controller();
		controller.login(nasabah.getPinNasabah());
		
		assertEquals(nasabah, controller);
		
	}

}
