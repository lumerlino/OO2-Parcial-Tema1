package negocio;

import dao.PersonaDao;
import datos.Persona;

public class PersonaABM {
	private static PersonaABM instancia = null;
	
	protected PersonaABM () {}
	
	public static PersonaABM getInstance() {
		if(instancia==null) {
			instancia=new PersonaABM();
		}
		return instancia;
	}
	
	public Persona traer(int id) {
		return PersonaDao.getInstance().traer(id);
	}

}
