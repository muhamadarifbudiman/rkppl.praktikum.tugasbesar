package ac.id.rkppl.view;

/**
 * @author ahmad alamsyah
 * @date 27 Mei 2013
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.junit.After;
import org.junit.Before;

import ac.id.rkkpl.impl.AdminImpl;
import ac.id.rkppl.controller.Controller;
import ac.id.rkppl.model.Atm;
import ac.id.rkppl.model.Nasabah;




public class MenuView {
	private Atm atm;
	private Nasabah nasabah;
	private Nasabah nasabah1;
	public MenuView() {
        
    }
    
    public static MenuView getInstance() {
        return ControllerHolder.INSTANCE;
    }

    
    
    private static class ControllerHolder {

        private static final MenuView INSTANCE = new MenuView();
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

	public void menuAdmin(){
		System.out.println("==============================================================");
		System.out.println("=======================Menu Admin=============================");
		System.out.println("==============================================================");
		System.out.println("1.Regitrasi Nasabah");
		System.out.println("1.Hapus Nasabah");
	}
	
	public void tampilLogin(String username){
		System.out.println("=============================================================");
        System.out.println("||                     Silahkan Login                      ||");
        System.out.println("=============================================================");
        System.out.println("Pin");
        username = inputString();
	}
	
	
	public void menuNasabah(){
		BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
		
			
			try {
				System.out.println("=============================================================");
		        System.out.println("||                     Menu Nasabah   	                   ||");
		        System.out.println("=============================================================");
		        System.out.println("=============================================================");
		        System.out.println("||                    1.Penarikan Saldo                    ||");
		        System.out.println("||                    2.lihat Saldo                        ||");
		        System.out.println("||                    3.Kembali ke Menu                    ||");
		        System.out.println("=============================================================");
				System.out.println("");
				
				System.out.println("=============================================================");
		        System.out.println("||                     Pilih Menu                          ||");
		        System.out.println("=============================================================");
				System.out.println("");
				int pilihan;
				System.out.println("Pilihan :");
		        pilihan = inputInteger();
		        
		        switch (pilihan) {
				case 1:
					Controller.getInstance().penarikanSaldo(atm);
					break;
				case 2:
					Controller.getInstance().transferUang();
					break;
				case 3:
					new MenuView().menuNasabah();
				case 4:

				default:
					break;
				}
		        

				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		
		

	}
	
	

}
