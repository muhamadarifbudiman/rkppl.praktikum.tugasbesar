package ac.id.rkkpl.impl;

/**
 * @author ahmad alamsyah
 * @date 27 Mei 2013
 */

import ac.id.rkppl.dao.AtmDao;
import ac.id.rkppl.model.Atm;

public class AtmImpl implements AtmDao{

public AtmImpl() {
        
    }
    
    public static AtmImpl getInstance() {
        return ControllerHolder.INSTANCE;
    }

    
    
    private static class ControllerHolder {

        private static final AtmImpl INSTANCE = new AtmImpl();
    }
	@Override
	public void saveSaldo() {
		Atm atm = new Atm();
		atm.setSaldoAtm(500000);
		
		System.out.println("saldo"+atm.getSaldoAtm());
		
	}

}
