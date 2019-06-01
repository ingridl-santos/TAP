package br.edu.ufam.detran;

public class Pessoa {
	private String nome;
	private int idade;
	private int cpf;
	
	Pessoa(String nome, int idade, int cpf){
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	
	public String getNome() {
		if(nome == null || nome.equals(" ")){
			return "Nome não informado!";
		} else {
		return nome;
		}
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
}
