package br.edu.ufam.detran;

public class Moto extends Terrestre {
	private String tipoComb;

	Moto(Pessoa dono, String modelo, int ano, String marca, String tipoComb) {
		super(dono, modelo, ano, marca);
		// TODO Auto-generated constructor stub
		this.tipoComb = tipoComb;
	}

	public String getTipoComb() {
		if(tipoComb == null || tipoComb.equals(" "))
			return "Combustível não específicado!";
		else
			return tipoComb;
	}

	public void setTipoComb(String tipoComb) {
		this.tipoComb = tipoComb;
	}


}
