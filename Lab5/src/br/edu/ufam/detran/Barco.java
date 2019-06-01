package br.edu.ufam.detran;

public class Barco extends Maritimo{
	private String destino;
	
	Barco(Pessoa dono, String modelo, int ano, int capacidade, String destino) {
		super(dono, modelo, ano, capacidade);
		// TODO Auto-generated constructor stub
		this.destino = destino;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	
	

}
