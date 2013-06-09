package ac.id.rkppl.controller;
/**
 * @author ahmad alamsyah
 * @date 27 Mei 2013
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Handler;

import org.junit.Before;
import org.junit.Test;

import ac.id.rkkpl.impl.AdminImpl;
import ac.id.rkkpl.impl.AtmImpl;
import ac.id.rkkpl.impl.NasabahImpl;
import ac.id.rkppl.model.Atm;
import ac.id.rkppl.model.Nasabah;
import ac.id.rkppl.model.User;
import ac.id.rkppl.view.MenuView;

public class Controller {
	public static User user;
	private String username;
	List<User> listUser =AdminImpl.getInstance().getListUser();
	
	
	List<User> listUserNasabah = NasabahImpl.getInstance().getListUsers();
	List<Nasabah> listNasabah = NasabahImpl.getInstance().getListNasabah();
	Nasabah nasabahLogin;
	public Controller() {
        
    }
    
    public static Controller getInstance() {
        return ControllerHolder.INSTANCE;
    }

    
    
    private static class ControllerHolder {

        private static final Controller INSTANCE = new Controller();
    }
    
    public static String inputString() {
		String alfa = "-";
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		while (alfa.equals("-")) {
			try {
				alfa = input.readLine();
			} catch (Exception e) {
			}
		}
		return alfa;
	}
    public static int inputInteger(){
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));

        int inputan = 0;
        try {
            inputan = Integer.parseInt(inp.readLine());
        } catch (Exception e) {
           
        }
        return inputan;
    }
    
   
    public void login(String username){	
    	try {
//    		for (int i = 0; i < listUserNasabah.size(); i++) {
//    			
//    			
//    			if (username.equals(listUserNasabah.get(i).getUsername())) {
//    				MenuView.getInstance().menuNasabah();
//    			} else{
//    				
//    				System.out.println("pin yang anda masukan salah");
//    				
//    				Main.logger.addHandler((Handler) listUserNasabah);
//    				
//    			}
//    		}
    	int i = 0;
    	int index =-1;
    		do {
    			if (listUserNasabah.get(i).getUsername().equals(username)) {
    				
    				index =i;
    			}
    			i++;
			} while (i<listUserNasabah.size());
    		
	if (index >=0) {
		nasabahLogin = new Nasabah();
		nasabahLogin.setIdNaasabah(listNasabah.get(index).getIdNaasabah());
		nasabahLogin.setNamaNasabah(listNasabah.get(index).getNamaNasabah());
		nasabahLogin.setAlamatNasabah(listNasabah.get(index).getAlamatNasabah());
		nasabahLogin.setNoRek(listNasabah.get(index).getNoRek());
		nasabahLogin.setPinNasabah(listNasabah.get(index).getPinNasabah());
		nasabahLogin.setSaldo(listNasabah.get(index).getSaldo());
		nasabahLogin.setUsername(listNasabah.get(index).getUsername());
		
		MenuView.getInstance().menuNasabah();
	} else{
	
		System.out.println("pin yang anda masukan salah");
		
		Main.logger.addHandler((Handler) listUserNasabah);
	
	
	}
		} catch (Exception e) {
			
		}
    				
		
    			
    }
    public void tampilLogin(){
    	System.out.println("=============================================================");
        System.out.println("||                     Silahkan Login                      ||");
        System.out.println("=============================================================");
        System.out.println("Pin");
        username = inputString();
        
        Controller.getInstance().login(username);
    }
    
    public void penarikanSaldo( Atm atm){
    	
    	System.out.println("=============================================================");
        System.out.println("||                     Penarikan Uang                      ||");
        System.out.println("=============================================================");
        System.out.println("Nominal");
        int saldoTarik = inputInteger();
        Nasabah nasabah = new Nasabah();
        
        
        
        for (int i = 0; i < listNasabah.size(); i++) {
			if (nasabahLogin.getUsername().equalsIgnoreCase(listNasabah.get(i).getUsername())) {
				//for (int j = 0; j < listNasabah.size(); i++) {	
					int hasil = listNasabah.get(i).getSaldo()-saldoTarik;
					 nasabah.setSaldo(hasil);
					 System.out.println("Saldo anda Sekarang :"+nasabah.getSaldo());
					 listNasabah.add(nasabah);
					 new MenuView().menuNasabah();
					 int hasil2= atm.getSaldoAtm()-hasil;
					 atm.setSaldoAtm(hasil2);
					 System.out.println("saldo di atm"+atm.getSaldoAtm());
					
					
				}
				
			}
		}
        
       
    
    public void transferUang(){
    	System.out.println("=============================================================");
        System.out.println("||                     Transfer Uang                       ||");
        System.out.println("=============================================================");
        System.out.println("Masukan No Rekening");
        String noRek = inputString();
        System.out.println("masukan saldo");
        int saldoTransfer = inputInteger();
        boolean statusTransfer=false;
        System.out.println("uang transfer"+saldoTransfer);
        for (int i = 0; i < listNasabah.size(); i++) {
        	
//        	System.out.println("asdasd"+listNasabah.get(i).getUsername());
//        	System.out.println(username);
//        	System.out.println("norek"+listNasabah.get(i).getNoRek().equals(noRek));
        	if(nasabahLogin.getUsername().equals(listNasabah.get(i).getUsername())){
        		System.out.println("saldo nasabah 1 sebelum di transfer"+listNasabah.get(i).getSaldo());
				listNasabah.get(i).setSaldo(listNasabah.get(i).getSaldo()-saldoTransfer);
				statusTransfer = true;
				System.out.println("saldo nasabah 1 setelah di transfer"+listNasabah.get(i).getSaldo());
			}
        	if (listNasabah.get(i).getNoRek().equals(noRek) && statusTransfer==true) {
        		System.out.println("saldo nasabah 2 sebelum di transfer"+listNasabah.get(i).getSaldo());
    			int saldo = listNasabah.get(i).getSaldo() + saldoTransfer;
    			listNasabah.get(i).setSaldo(saldo);
    			System.out.println("saldo nasabah 2 setelah di transfer"+listNasabah.get(i).getSaldo());
    			
    			}
			
				}
        
			
        
       
//       
//        if (nasabah.getNoRek().equals(noRek)) {
//        	if (nasabah.getSaldo() > saldoTransfer) {
//        		int saldo = nasabah.getSaldo()-saldoTransfer;
//        		nasabah.setSaldo(saldo);
//        		System.out.println("saldo anda sekarang adalah :"+nasabah.getSaldo());
//				int saldo1 = nasabah1.getSaldo() + saldoTransfer;
//				nasabah1.setSaldo(saldo1);
//				System.out.println("saldo nasabah 1="+nasabah1.getSaldo());
//			}else{
//				System.out.println("Saldo anda tidak mencukupi");
//			}
//			
//		}else{
//			System.out.println("No Rekening Tidak Terdaftar");
//		}
        
        
        
       
    }
//    public void lihatSaldo(){
//    	System.out.println("Saldo anda sekarang adalah");
//    	for (int i = 0; i < listNasabah.size(); i++) {
//    		sysout
//			
//		}
//    	
//    }
//    
    

}
