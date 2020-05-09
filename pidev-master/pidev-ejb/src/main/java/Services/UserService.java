package Services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import Entities.Employee;
import Interfaces.InterfaceUser;
@Stateless
@LocalBean
public class UserService implements InterfaceUser{
	@PersistenceContext
	EntityManager em ;
	@Override
	
		public List<Employee> getAllUsers() {
			List<Employee> users = em.createQuery("Select u from Employee u ", Employee.class).getResultList();
			System.out.println(users);
			return users;
			
	}

	@Override
	public Employee getUserId(int idU) {
		Employee u = em.find(Employee.class, idU);
		return u;
	}

}
