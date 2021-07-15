package model.enumeration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import model.entity.secretaria.Consulta;

public class Principal {

	public static void main(String[] args) {

		Consulta paciente1 = new Consulta();

		LocalDateTime agendamento = LocalDateTime.of(2021, 05, 06, 10, 30, 00);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		paciente1.setNomePaciente("José Soares");


		System.out.println("Nome Completo do Paciente: " + paciente1.getNomePaciente());
		System.out.println("Boleto: " + StatusBoleto.PAGO);
		System.out.println("O Paciente compareceu a consulta? " + Presenca.COMPARECEU);
		System.out.println("Agendamento: " + agendamento.format(formatter));
	
	}
}
