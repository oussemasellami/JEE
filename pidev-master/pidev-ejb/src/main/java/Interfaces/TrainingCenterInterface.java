package Interfaces;

import java.util.List;

import javax.ejb.Remote;

import Entities.TrainingCentre;

@Remote
public interface TrainingCenterInterface{
	
	public int add(TrainingCentre trainin);
	public void remove(int id);
	public TrainingCentre findById(int id);
	public List<TrainingCentre> findAll();
	//public Training getEmployeByEmailAndPassword(String email, String password);
	public List<TrainingCentre> getAllTrainings();
	public void updateTraining(TrainingCentre trainin) ;
}