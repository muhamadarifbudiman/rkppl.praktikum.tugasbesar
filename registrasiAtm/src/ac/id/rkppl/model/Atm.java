package ac.id.rkppl.model;
/**
 * @author ahmad alamsyah
 * @date 27 Mei 2013
 */

public class Atm {
	private int saldoAtm;
	
	
	
	public Atm(){
		
	}
	public Atm(int saldoAtm, Nasabah nasabah) {
		super();
		this.saldoAtm = saldoAtm;
		
	}
	/**
	*
	* @return saldoAtm
	* 
	*/

	public int getSaldoAtm() {
		return saldoAtm;
	}
	/**
	*
	* @param saldoAtm
	* 
	*/

	public void setSaldoAtm(int saldoAtm) {
		this.saldoAtm = saldoAtm;
	}
	
	
	
	

}
