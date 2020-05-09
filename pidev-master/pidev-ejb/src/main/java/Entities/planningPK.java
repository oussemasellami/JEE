package Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
@Embeddable


public class planningPK  implements Serializable {
	
	private static final long serialVersionUID = 5377539445871317492L;

       private int trainings_id;
       private int formationEmp_id;
       
   	private Date dateDebut;
	
	//Choisir le TemporalType selon le besoin metier
	
	
	
	
	

	
	
	






	public planningPK(int trainings_id, int formationEmp_id) {
		super();
		this.trainings_id = trainings_id;
		this.formationEmp_id = formationEmp_id;
	}







	public Date getDateDebut() {
		return dateDebut;
	}







	public planningPK() {
		super();
	}







	public planningPK(int trainings_id, int formationEmp_id, Date dateDebut) {
		super();
		this.trainings_id = trainings_id;
		this.formationEmp_id = formationEmp_id;
		this.dateDebut = dateDebut;
	}







	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}







	public int getTrainings_id() {
		return trainings_id;
	}







	public void setTrainings_id(int trainings_id) {
		this.trainings_id = trainings_id;
	}







	public int getFormationEmp_id() {
		return formationEmp_id;
	}







	public void setFormationEmp_id(int formationEmp_id) {
		this.formationEmp_id = formationEmp_id;
	}
}














