package dao;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.PermisoDiario;
import datos.PermisoPeriodo;

public class PermisoDao {
	private static Session session;
	private Transaction tx;
	private static PermisoDao instancia=null;
	
	protected PermisoDao() {}
	
	public static PermisoDao getInstance() {
		if(instancia==null) {
			instancia=new PermisoDao();
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
	
	public PermisoDiario traerPermisoDiario(int id) throws HibernateException{
		PermisoDiario objeto = null;
		try {
			iniciaOperacion();
			String hql = "from PermisoDiario pd where pd.idPermiso="+id;
			objeto = (PermisoDiario) session.createQuery(hql).uniqueResult();
			Hibernate.initialize(objeto.getPedido());
			Hibernate.initialize(objeto.getDesdeHasta());
		}finally {
			session.close();
		}
		return objeto;
	}
	
	public PermisoPeriodo traerPermisoPeriodo(int id) throws HibernateException{
		PermisoPeriodo objeto = null;
		try {
			iniciaOperacion();
			String hql = "from PermisoPeriodo pp where pp.idPermiso="+id;
			objeto = (PermisoPeriodo) session.createQuery(hql).uniqueResult();
			Hibernate.initialize(objeto.getPedido());
			Hibernate.initialize(objeto.getDesdeHasta());
			Hibernate.initialize(objeto.getRodado());
		}finally {
			session.close();
		}
		return objeto;
	}

}
