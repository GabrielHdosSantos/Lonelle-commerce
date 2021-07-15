package model.entity.nutricionista;

public class Alimentos {

	private String carboidratos;
	private String verdurasLegumes;
	private String frutas;
	private String leiteDerivados;
	private String carnesOvos;
	private String leguminosasOleoginosas;
	private String oleosGorduras;
	private String acucaresDoces;
	
	public Alimentos(String carboidratos, String verdurasLegumes, String frutas, String leiteDerivados, String carnesOvos, String leguminosasOleoginosas, String oleosGorduras, String acucaresDoces) {
		
		setCarboidratos(carboidratos);
		setVerdurasLegumes(verdurasLegumes);
		setFrutas(frutas);
		setLeiteDerivados(leiteDerivados);
		setCarnesOvos(carnesOvos);
		setLeguminosasOleoginosas(leguminosasOleoginosas);
		setOleosGorguras(oleosGorduras);
		setAcucaresDoces(acucaresDoces);
	}

	public String getCarboidratos() {
		return carboidratos;
	}

	public void setCarboidratos(String carboidratos) {
		this.carboidratos = carboidratos;
	}

	public String getVerdurasLegumes() {
		return verdurasLegumes;
	}

	public void setVerdurasLegumes(String verdurasLegumes) {
		this.verdurasLegumes = verdurasLegumes;
	}

	public String getFrutas() {
		return frutas;
	}

	public void setFrutas(String frutas) {
		this.frutas = frutas;
	}

	public String getLeiteDerivados() {
		return leiteDerivados;
	}

	public void setLeiteDerivados(String leiteDerivado) {
		this.leiteDerivados = leiteDerivado;
	}

	public String getCarnesOvos() {
		return carnesOvos;
	}

	public void setCarnesOvos(String caresOvos) {
		this.carnesOvos = caresOvos;
	}

	public String getLeguminosasOleoginosas() {
		return leguminosasOleoginosas;
	}

	public void setLeguminosasOleoginosas(String leguminosasOleoginosas) {
		this.leguminosasOleoginosas = leguminosasOleoginosas;
	}

	public String getOleosGorduras() {
		return oleosGorduras;
	}

	public void setOleosGorguras(String oleosGorduras) {
		this.oleosGorduras = oleosGorduras;
	}

	public String getAcucaresDoces() {
		return acucaresDoces;
	}

	public void setAcucaresDoces(String acucaresDoces) {
		this.acucaresDoces = acucaresDoces;
	}
	
	

}
