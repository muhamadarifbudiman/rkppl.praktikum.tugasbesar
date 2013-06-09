package ac.id.rkkpl.impl;

/**
 * @author ahmad alamsyah
 * @date 27 Mei 2013
 */
import java.awt.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ac.id.rkppl.controller.Controller;

import ac.id.rkppl.dao.AdminDao;
import ac.id.rkppl.model.Admin;
import ac.id.rkppl.model.User;

public class AdminImpl implements AdminDao {
	
	
	
	public AdminImpl() {
        
    }
    
    public static AdminImpl getInstance() {
        return ControllerHolder.INSTANCE;
    }

    
    
    private static class ControllerHolder {

        private static final AdminImpl INSTANCE = new AdminImpl();
    }
	private List<Admin> listAdmins = new ArrayList<>();
	private List<User> listUser = new ArrayList<>();
	
	public List<Admin> getListAdmins() {
		return listAdmins;
	}

	public void setListAdmins(List<Admin> listAdmins) {
		this.listAdmins = listAdmins;
	}

	public List<User> getListUser() {
		return listUser;
	}

	public void setListUser(List<User> listUser) {
		this.listUser = listUser;
	}

	@Override
	public List<Admin> saveAdmin() {
		Admin admin = new Admin();
		admin.setIdAdmin("103040153");
		admin.setNamaAdmin("Ahmad Alamsyah");
		admin.setAlamatAdmin("jl.Cijerah");
		admin.setUmurAdmin("10");
		admin.setUsername(admin.getIdAdmin());
		
		
		
		listAdmins.add(admin);
		listUser.add(admin);
		
		return listAdmins;
	}
	
	public void getAdmin(){
		
		AdminImpl adminimpl = new AdminImpl();
		for (int i = 0; i < listAdmins.size(); i++) {
			Admin admin = listAdmins.get(i);
			
			System.out.println("id admin"+admin.getIdAdmin());
			System.out.println("nama"+admin.getNamaAdmin());
			System.out.println("alamat"+admin.getAlamatAdmin());
			System.out.println("umur"+admin.getUmurAdmin());
			System.out.println("username"+admin.getUsername());
			System.out.println("password"+admin.getPassword());
			System.out.println("role"+admin.getRole());
		}
	}
	
	public static void main(String[] args) {
		AdminImpl admin = new AdminImpl();
		admin.saveAdmin();
		for (int i = 0; i < admin.listUser.size(); i++) {
			User user = admin.listUser.get(i);
			
			System.out.println("username"+user.getUsername());
			System.out.println("password"+user.getPassword());
			
		}
		
	}
	
	
	
	
	
	

}
