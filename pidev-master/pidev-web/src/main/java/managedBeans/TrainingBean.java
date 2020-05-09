package managedBeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import Entities.Employee;
import Entities.FormationComment;
import Entities.Training;
import Services.GestionCommentaireFormationService;
import Services.TrainingService;
import Services.UserService;

@ManagedBean
@SessionScoped
public class TrainingBean implements Serializable {
	TrainingService tservice ;
	private Training formation = new Training();

	private String name; private String description; private int NumberMax	;
	private int duree; private Boolean status ;
	private String contenu;
	Training tr;
	FormationComment dc;
	
	@EJB
	private GestionCommentaireFormationService cs;
	@EJB
	private UserService us;
	private int TrainingIdToBeUpdated;
	private FormationComment selectedEv;
	


public int getTrainingIdToBeUpdated() {
		return TrainingIdToBeUpdated;
	}

	public void setTrainingIdToBeUpdated(int trainingIdToBeUpdated) {
		TrainingIdToBeUpdated = trainingIdToBeUpdated;
	}

@EJB
TrainingService tService ;
	public String getName() {
		return name;
	}
	

	public void setSelectedEv(FormationComment selectedEv) {
		this.selectedEv = selectedEv;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}



	public int getNumberMax() {
		return NumberMax;
	}

	public void setNumberMax(int numberMax) {
		NumberMax = numberMax;
	}

	

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public TrainingService gettService() {
		return tService;
	}

	public void settService(TrainingService tService) {
		this.tService = tService;
	}
	public void add() {
		tService.add(new Training(name, description, duree, status, NumberMax));
		}
	
	
		
		
	

		public String doLogin() {
			String navigateTo = "testt?faces-redirect=true";
		
			return navigateTo; }
		
		private List<Training> training;
		public List<Training> getTraining() {
		training = tService.findAll();
		return training;
		}

		public TrainingService getTservice() {
			return tservice;
		}

		public void setTservice(TrainingService tservice) {
			this.tservice = tservice;
		}

		public void setTraining(List<Training> training) {
			this.training = training;
		}
		public void removeEmploye(int trainingID)
		{
		tService.remove(trainingID);
		}
		public String AddComment(Training t)
		{FormationComment dc =new FormationComment();
		
		dc.setFormation(t);
		cs.ajouterFormationCommentaire(dc);
		int id_com =t.getId();
		return "comment.xhtml/?faces-redirect=true&comID="+ id_com;
		
		}
		public FormationComment getSelectedEv() {
			Map<String, String> params =FacesContext.getCurrentInstance().
	                getExternalContext().getRequestParameterMap();
			if(params.containsKey("comID")) {
				String id = params.get("comID");
				this.selectedEv = cs.findById(Integer.parseInt(id));
			}
			return selectedEv;
		}
		
		
		public String displayTraining(Training tr)
		{
			this.setTrainingIdToBeUpdated(tr.getId());
			this.setName(tr.getName());
			this.setDescription(tr.getDescription());
	
			this.setDuree(tr.getDuree());
			this.setNumberMax(tr.getNumberMax());
			
		
		this.setTrainingIdToBeUpdated(tr.getId());
		return "update?faces-redirect=true";
		}
		
		
		
		public String updateTraining()
		{ 
			System.out.println(TrainingIdToBeUpdated);
			tService.updateTraining(new Training(TrainingIdToBeUpdated,name, description, duree, status, NumberMax));
		return "testt?faces-redirect=true";
		}
		
		public String updateComment(FormationComment f)
		{ 
			f.setContenu(contenu);
			
		return "testt?faces-redirect=true";
		}
		public String redirection()
		{ 
			
		return "Add?faces-redirect=true";
		}

		public Training getTr() {
			return tr;
		}
		

		public Training getFormation() {
			return formation;
		}

		public void setFormation(Training formation) {
			this.formation = formation;
		}

		public FormationComment getDc() {
			return dc;
		}

		public void setDc(FormationComment dc) {
			this.dc = dc;
		}

		public GestionCommentaireFormationService getCs() {
			return cs;
		}

		public void setCs(GestionCommentaireFormationService cs) {
			this.cs = cs;
		}

		public UserService getUs() {
			return us;
		}

		public void setUs(UserService us) {
			this.us = us;
		}

		public void setTr(Training tr) {
			this.tr = tr;
		}


	
		public String Navigate() {
			tr = tService.getTrainingByName(name);
			
			
		
			return "plan?faces-redirect=true"; }
		
	 }


	
	

