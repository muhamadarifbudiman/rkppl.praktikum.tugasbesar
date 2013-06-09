package ac.id.rkppl.controller;



import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import ac.id.rkkpl.impl.AdminImpl;
import ac.id.rkkpl.impl.NasabahImpl;
import ac.id.rkppl.model.Nasabah;


/**
 * @author ahmad alamsyah
 * @date 27 Mei 2013
 */

public class Main {
	public static final String APP_NAME = "log testing.";
	public static final Logger logger = Logger.getLogger("log");
	
	static {
		try {
		boolean append = true;
		String now = new SimpleDateFormat("yyyyMMdd").format(new Date());
		String filename = APP_NAME+".log";
		
		FileHandler fh = new FileHandler(filename, append);
		fh.setFormatter(new SimpleFormatter());
		logger.addHandler(fh);
		} catch (IOException e) {
		logger.log(Level.SEVERE, "{0}", e);
		}
		}
	
	
	
	public static void main(String[] args) {
		
		
		AdminImpl impladmin = new AdminImpl();
		Nasabah nasabah=new Nasabah();
		Nasabah nasabah1 = new Nasabah();
		
    	impladmin.saveAdmin();
	    NasabahImpl.getInstance().saveNasabah(nasabah,nasabah1);
		Controller.getInstance().tampilLogin();
		
		
	}

}
