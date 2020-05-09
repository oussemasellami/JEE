package Services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import Entities.Training;
import Entities.TrainingCentre;
import Interfaces.TrainingCenterInterface;

@Stateless
@LocalBean
public class TrainingCenterService implements TrainingCenterInterface{
	@PersistenceContext
	EntityManager em;	
	@Override
	public int add(TrainingCentre trainin) {
		em.persist(trainin);
		return trainin.getId();
	}

	@Override
	public void remove(int id) {
		em.remove(em.find(TrainingCentre.class, id));
		
	}

	@Override
	public TrainingCentre findById(int id) {
		TrainingCentre training = em.find(TrainingCentre.class, id);
		return training;
	}

	@Override
	public List<TrainingCentre> findAll() {
		List<TrainingCentre> emp = em.createQuery("Select t from TrainingCentre t",
				TrainingCentre.class).getResultList();
				return emp;
	}

	@Override
	public List<TrainingCentre> getAllTrainings() {
		List<TrainingCentre> emp = em.createQuery("Select t from TrainingCentre t",
				TrainingCentre.class).getResultList();
				return emp;
	}

	@Override
	public void updateTraining(TrainingCentre trainin) {
		// TODO Auto-generated method stub
		
	}
	

}
