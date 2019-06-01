package br.edu.ufam.detran;

public class Maritimo extends Veiculo{
	Maritimo(Pessoa dono, String modelo, int ano, int capacidade) {
		super(dono, modelo, ano);
		// TODO Auto-generated constructor stub
		this.capacidade = capacidade;
	}

	private int capacidade;

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		if(capacidade > 0)
			this.capacidade = capacidade;
		else
			this.capacidade = 0;
	}


}
