package Interfaces;

import java.util.Date;
import java.util.List;

import javax.ejb.Remote;

import Entities.Employee;
import Entities.Training;
import Entities.plan;
@Remote

public interface IplanService {
	public void AffecterEmployeAFormation(int idEmp , int idFom , plan p);
	public void PlanifierFormation(List<Employee> users , List<Training> formations);
	public void InsertPlan(plan Plan);
	public void UpdatePlan(plan Plan);
	public void DeletePlan(int idPlan);
	public void SelectPlan(int idPlan);
	List<plan> getAllPlaning();
	public plan getPlaningId(int idP);
}


