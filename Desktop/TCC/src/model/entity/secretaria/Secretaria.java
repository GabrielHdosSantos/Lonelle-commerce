package model.entity.secretaria;
public class Secretaria {
	
	private String nome;
	private String idade;

	public Secretaria(String nome, String idade ) {
	setNome(nome);
	setIdade(idade);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getIdade() {
		return idade;
	}
	
	public void setIdade(String idade) {
		this.idade = idade;
	}
	

}
