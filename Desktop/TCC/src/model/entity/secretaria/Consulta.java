package model.entity.secretaria;
import java.time.LocalDateTime;

import model.enumeration.Presenca;
import model.enumeration.StatusBoleto;

public class Consulta {

	private String nomePaciente; // estender classe pessoa/ paciente
	private Presenca status;
	private StatusBoleto boleto;
	private LocalDateTime horario;
	
	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;// estender classe pessoa/ paciente
	}

		public Presenca getStatus() {
		return status;
	}

	public void setStatus(Presenca status) {
		this.status = status;
	}

	public StatusBoleto getBoleto() {
		return boleto;
	}

	public void setBoleto(StatusBoleto boleto) {
		this.boleto = boleto;
	}

}
