package managedBeans;


import javax.annotation.PostConstruct;
import javax.ejb.EJB;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import org.primefaces.model.chart.PieChartModel;

import Services.statService;


@ManagedBean
public class ChartView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PieChartModel pieModel1 = new PieChartModel();
	private PieChartModel pieModel2;
	@EJB
       statService competenceService;

	@PostConstruct
	public void init() {
		createPieModels();
	}


	public PieChartModel getPieModel1() {
		long res1 = competenceService.getNombredevJPQL();
		long res2 = competenceService.getNombrecompJPQL();
		long res3 = competenceService.getNombrefinJPQL();
		long res4 = competenceService.getNombredsJPQL();
		long res5 = competenceService.getPoureRequestJPQL();
		this.pieModel1.set("JavaEE", res1 * 100 / res5);
		this.pieModel1.set(".net", res2 * 100 / res5);
		this.pieModel1.set("sql", res3 * 100 / res5);
		this.pieModel1.set("ril", res4 * 100 / res5);

		this.pieModel1.setTitle("Les Specialite par Categorie En %");
		this.pieModel1.setLegendPosition("w");
		this.pieModel1.setShadow(false);
		return pieModel1;
	}

	public PieChartModel getPieModel2() {
		return pieModel2;
	}

	private void createPieModels() {
		createPieModel1();

	}

	private void createPieModel1() {

	
	}

	public void setPieModel1(PieChartModel pieModel1) {
		
		this.pieModel1 = pieModel1;
	}
	
	

}