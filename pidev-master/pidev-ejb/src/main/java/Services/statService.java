package Services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import Interfaces.InterfaceStat;
@Stateless
@LocalBean
public class statService implements InterfaceStat {
	@PersistenceContext
	EntityManager em ;
	@Override
	public long getNombredevJPQL() {
		
		  TypedQuery<Long> query = em.createQuery(
			   "SELECT COUNT(s) FROM Training s where s.name like'JavaEE'", Long.class);
			  long results =query.getSingleResult();
			  return results;
	}


	@Override
	public long getNombrefinJPQL() {
		 TypedQuery<Long> query = em.createQuery(
				   "SELECT COUNT(s) FROM Training s where s.name like'.net'", Long.class);
				  long results =query.getSingleResult();
				  return results;
	}


	@Override
	public long getNombrecompJPQL() {
		 TypedQuery<Long> query = em.createQuery(
				   "SELECT COUNT(s) FROM Training s where s.name like'sql'", Long.class);
				  long results =query.getSingleResult();
				  return results;
	}


	@Override
	public long getNombredsJPQL() {
		 TypedQuery<Long> query = em.createQuery(
				   "SELECT COUNT(s) FROM Training s where s.name like'ril'", Long.class);
				  long results =query.getSingleResult();
				  return results;
	}


	@Override
	public long getPoureRequestJPQL() {
		TypedQuery<Long> query = em.createQuery(
				   "SELECT COUNT(s) FROM Training s ", Long.class);
				  long results =query.getSingleResult();
				  return results;
	}
	}




