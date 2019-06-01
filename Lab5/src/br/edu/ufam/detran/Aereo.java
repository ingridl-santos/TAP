package br.edu.ufam.detran;

public class Aereo extends Veiculo{
	private int alturaLim ;

	Aereo(Pessoa dono, String modelo, int ano, int alturaLim) {
		super(dono, modelo, ano);
		// TODO Auto-generated constructor stub
		this.alturaLim = alturaLim;
	}

	
	public int getAlturaLim() {
		return alturaLim;
	}

	public void setAlturaLim(int alturaLim) {
		if(alturaLim > 0)
			this.alturaLim = alturaLim;
		else
			this.alturaLim = 0;
	}

	

}
