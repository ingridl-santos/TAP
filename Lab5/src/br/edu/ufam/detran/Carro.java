package br.edu.ufam.detran;

public class Carro extends Terrestre {
	private String tipoDir;

	Carro(Pessoa dono, String modelo, int ano, String marca, String tipoDir) {
		super(dono, modelo, ano, marca);
		// TODO Auto-generated constructor stub
		this.setTipoDir(tipoDir);
	}

	public String getTipoDir() {
		if(tipoDir == null || tipoDir.equals(""))
			return "Tipo de direção não especificado";
		else 
		return tipoDir;
	}

	public void setTipoDir(String tipoDir) {
		this.tipoDir = tipoDir;
	}
	


}
