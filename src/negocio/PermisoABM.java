package negocio;

import dao.PermisoDao;
import datos.PermisoDiario;
import datos.PermisoPeriodo;

public class PermisoABM {
	private static PermisoABM instancia = null;
	
	protected PermisoABM () {}
	
	public static PermisoABM getInstance() {
		if(instancia==null) {
			instancia=new PermisoABM();
		}
		return instancia;
	}
	
	public PermisoDiario traerPermisoDiario(int id){
		return PermisoDao.getInstance().traerPermisoDiario(id);
	}
	
	public PermisoPeriodo traerPermisoPeriodo(int id) {
		return PermisoDao.getInstance().traerPermisoPeriodo(id);
	}

}
