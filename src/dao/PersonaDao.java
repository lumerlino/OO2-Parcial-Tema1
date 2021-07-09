package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Persona;

public class PersonaDao {
	private static Session session;
	private Transaction tx;
	private static PersonaDao instancia=null;
	
	protected PersonaDao() {}
	
	public static PersonaDao getInstance() {
		if(instancia==null) {
			instancia=new PersonaDao();
		}
		return instancia;
	}
	
	protected void iniciaOperacion() throws HibernateException { 
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}
	protected void manejaExcepcion(HibernateException he) throws HibernateException { 
		tx.rollback();
		throw new HibernateException("ERROR en la capa de acceso a datos", he);
	}
	
	public Persona traer(int id) throws HibernateException{
		Persona objeto = null;
		try {
			iniciaOperacion();
			String hql = "from Persona p where p.idPersona="+id;
			objeto = (Persona) session.createQuery(hql).uniqueResult();  
		}finally {
			session.close();
		}
		return objeto;

	}

}
