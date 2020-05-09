package Interfaces;

import java.util.List;

import javax.ejb.Remote;

import Entities.Training;


@Remote
public interface IserviceRemote {
	
	public int add(Training trainin);
	public void remove(int id);
	public Training findById(int id);
	public List<Training> findAll();
	//public Training getEmployeByEmailAndPassword(String email, String password);
	public List<Training> getAllTrainings();
	public void updateTraining(Training trainin) ;
	public Training getTrainingByName(String Name);
}