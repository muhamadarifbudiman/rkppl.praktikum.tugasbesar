package ac.id.rkkpl.impl;

/**
 * @author ahmad alamsyah
 * 
 */

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;


import ac.id.rkppl.dao.NasabahDao;
import ac.id.rkppl.model.Nasabah;
import ac.id.rkppl.model.User;

public class NasabahImpl implements NasabahDao{

	public NasabahImpl(){
		
	}
    
    public static NasabahImpl getInstance() {
        return ControllerHolder.INSTANCE;
    }

    
    
    private static class ControllerHolder {

        private static final NasabahImpl INSTANCE = new NasabahImpl();
    }
	
	private List<Nasabah> listNasabah= new ArrayList<>();
	private List<User> listUsers= new ArrayList<>();
	
	
	public List<Nasabah> getListNasabah() {
		return listNasabah;
	}

	public void setListNasabah(List<Nasabah> listNasabah) {
		this.listNasabah = listNasabah;
	}
	
	@Before
	public List<User> getListUsers() {
		return listUsers;
	}

	public void setListUsers(List<User> listUsers) {
		this.listUsers = listUsers;
	}

	@Override
	public List<Nasabah> saveNasabah(Nasabah nasabah, Nasabah nasabah1) {
		nasabah = new Nasabah();
		nasabah.setIdNaasabah("103040153");
		nasabah.setNamaNasabah("Ahmad Alamasyah");
		nasabah.setAlamatNasabah("jl.cijerah");
		nasabah.setSaldo(100000);
		nasabah.setNoRek("0912312");
		nasabah.setPinNasabah("12345");
		nasabah.setUsername(nasabah.getPinNasabah());
		
				
		nasabah1 = new Nasabah();
		nasabah1.setIdNaasabah("103040152");
		nasabah1.setNamaNasabah("Dhika Nugraha");
		nasabah1.setAlamatNasabah("jl.cijerah");
		nasabah1.setSaldo(100000);
		nasabah1.setNoRek("0912311");
		nasabah1.setPinNasabah("123456");
		nasabah1.setUsername(nasabah1.getPinNasabah());
		
		
		
		listNasabah.add(nasabah);
		listUsers.add(nasabah);

		
		listNasabah.add(nasabah1);
		listUsers.add(nasabah1);
		
		
		
		
		
		
		return listNasabah;
	}
	
//	public static void main(String[] args) {
//		NasabahImpl impl = new NasabahImpl();
//		impl.saveNasabah();
//		for (int i = 0; i < impl.listNasabah.size(); i++) {
//			Nasabah nasabah =impl.listNasabah.get(i);
//			System.out.println("idnasabah="+nasabah.getIdNaasabah());
//			System.out.println("idnasabah="+nasabah.getNamaNasabah());
//			System.out.println("idnasabah="+nasabah.getAlamatNasabah());
//			System.out.println("idnasabah="+nasabah.getNoRek());
//			System.out.println("idnasabah="+nasabah.getPinNasabah());
//			System.out.println("idnasabah="+nasabah.getUsername());
//			System.out.println("idnasabah="+nasabah.getSaldo());
//			
//		}
//	}
	
	
		
	//}
	
	
	

}
