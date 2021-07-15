package model.entity.nutricionista;

import model.enumeration.AreaAtuacao;

public class Nutricionista {

	private String nome;
	private byte idade;
	private String formacao;
	private String descricao;
	private AreaAtuacao areaAtuacao;
	
	public Nutricionista () {
		
	}

	public Nutricionista(String nome, byte idade, String contato, String faculdade, String descricao, AreaAtuacao areaAtuacao) {
		setNome(nome);
		setIdade(idade);
		setFormacao(faculdade);
		setDescricao(descricao);
		setAreaAtuacao(AreaAtuacao.CLINICA);
	}

	public String getNome() {

		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public byte getIdade() {
		return idade;
	}

	public void setIdade(byte idade) {
		this.idade = idade;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	} // o nutriciosnista irá falar brevemente sobre o trabalho dele.
	
	public AreaAtuacao getAreaAtuacao() {
		return areaAtuacao;
	}

	public void setAreaAtuacao(AreaAtuacao areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}
}
