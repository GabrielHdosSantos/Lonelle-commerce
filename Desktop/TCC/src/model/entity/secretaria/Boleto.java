package model.entity.secretaria;
import java.time.LocalDate;

import model.enumeration.StatusBoleto;

public class Boleto {

	// puxar classe paciente
	// estender classe pessoa/ paciente
	private StatusBoleto statusBoleto;
	private Secretaria secretaria; // qm gerou 
	private LocalDate dataGerado;
	private LocalDate vencimento;
	private Contato contato;
	private long codigoBarra;
	private static final int VALOR_CLINICA = 150;
	private static final int VALOR_ESPORTIVA = 175;
	
	public StatusBoleto getStatusBoleto() {
		return statusBoleto;
	}
	
	public void setStatusBoleto (StatusBoleto statusBoleto) {
		this.statusBoleto = statusBoleto;
	}
	
	public Secretaria getSecretaria() {
		return secretaria;
	}
	
	public void setSeretaria(Secretaria secretaria) {
		this.secretaria = secretaria;
	}
	
	public LocalDate getDataGerado() {
		return dataGerado;
	}
	
	public void setDataGerado (LocalDate dataGerado) {
		this.dataGerado = dataGerado;
	}
	
	public LocalDate getVencimento() {
		return vencimento;
	}
	
	public void setVencimento (LocalDate vencimento) {
		this.vencimento = vencimento;
	}
	
	public Contato getContato () {
		return contato;
	}
	
	public void setContato( Contato contato) {
		this.contato = contato;
	}
	
	public long getCodigoBarra() {
		return codigoBarra;
	}

}
	
	

