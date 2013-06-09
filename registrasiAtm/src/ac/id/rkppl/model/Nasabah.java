package ac.id.rkppl.model;
/**
 * @author ahmad alamsyah
 * @date 27 Mei 2013
 */

public class Nasabah extends User {
	private String idNaasabah;
	private String namaNasabah;
	private String alamatNasabah;
	private int saldo;
	private String noRek;
	private String pinNasabah;
	private Atm atm;
	
	
	public Nasabah() {
		super();
	}
	public Nasabah(String idNaasabah, String namaNasabah, String alamatNasabah,String noRek, String pinNasabah,int saldo) {
		super();
		this.idNaasabah = idNaasabah;
		this.namaNasabah = namaNasabah;
		this.alamatNasabah = alamatNasabah;
		this.noRek = noRek;
		this.saldo=saldo;
		this.pinNasabah = pinNasabah;
		username=pinNasabah;
		
	}
	/**
	*
	* @return saldo
	* 
	*/
	public int getSaldo() {
		return saldo;
	}
	/**
	*
	* @param saldo
	* 
	*/
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	/**
	*
	* @return nasabah
	* 
	*/
	public String getPinNasabah() {
		return pinNasabah;
		
	}
	/**
	*
	* @param pinNasabah
	* 
	*/
	public void setPinNasabah(String pinNasabah) {
		this.pinNasabah = pinNasabah;
	}
	/**
	*
	* @return idNasabah
	* 
	*/
	public String getIdNaasabah() {
		return idNaasabah;
	}
	/**
	*
	* @param idNaasabah
	* 
	*/
	public void setIdNaasabah(String idNaasabah) {
		this.idNaasabah = idNaasabah;
	}
	/**
	*
	* @return namaNasabah
	* 
	*/
	public String getNamaNasabah() {
		return namaNasabah;
	}
	/**
	*
	* @return namaNasabah
	* 
	*/
	public void setNamaNasabah(String namaNasabah) {
		this.namaNasabah = namaNasabah;
	}
	/**
	*
	* @return alamatNasabah
	* 
	*/
	public String getAlamatNasabah() {
		return alamatNasabah;
	}
	/**
	*
	* @param alamatNasabah
	* 
	*/
	public void setAlamatNasabah(String alamatNasabah) {
		this.alamatNasabah = alamatNasabah;
	}
	/**
	*
	* @return noRek
	* 
	*/
	public String getNoRek() {
		return noRek;
	}
	/**
	*
	* @param noRek
	* 
	*/
	public void setNoRek(String noRek) {
		this.noRek = noRek;
	}
	/**
	*
	* @return atm
	* 
	*/
	public Atm getAtm() {
		return atm;
	}
	/**
	*
	* @param atm
	* 
	*/
	public void setAtm(Atm atm) {
		this.atm = atm;
	}
	
	

}
