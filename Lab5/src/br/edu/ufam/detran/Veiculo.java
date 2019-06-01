package br.edu.ufam.detran;

public class Veiculo {
	private Pessoa dono;
	private String modelo;
	private int ano;
	
	Veiculo(Pessoa dono, String modelo, int ano){
		this.dono = dono;
		this.modelo = modelo;
		this.ano = ano;
	}
	public Pessoa getDono() {
		return dono;
	}

	public void setDono(Pessoa dono) {
		this.dono = dono;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
