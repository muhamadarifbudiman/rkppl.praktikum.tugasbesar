package ac.id.rkppl.model;

/**
 * @author ahmad alamsyah
 * @date 27 Mei 2013
 */

public class Admin extends User {
	
	private String idAdmin;
	private String namaAdmin;
	private String alamatAdmin;
	private String umurAdmin;
	
	public Admin(){
		username=idAdmin;
		password="12345";
		role=1;
	}
	
	
	public Admin(String idAdmin, String namaAdmin, String alamatAdmin,String umurAdmin) {
		super();
		this.idAdmin = idAdmin;
		this.namaAdmin = namaAdmin;
		this.alamatAdmin = alamatAdmin;
		this.umurAdmin = umurAdmin;
		
	}
	public String getIdAdmin() {
		return idAdmin;
	}
	public void setIdAdmin(String idAdmin) {
		this.idAdmin = idAdmin;
	}
	public String getNamaAdmin() {
		return namaAdmin;
	}
	public void setNamaAdmin(String namaAdmin) {
		this.namaAdmin = namaAdmin;
	}
	public String getAlamatAdmin() {
		return alamatAdmin;
	}
	public void setAlamatAdmin(String alamatAdmin) {
		this.alamatAdmin = alamatAdmin;
	}
	public String getUmurAdmin() {
		return umurAdmin;
	}
	public void setUmurAdmin(String umurAdmin) {
		this.umurAdmin = umurAdmin;
	}
	
	
	
	
	
	


}
