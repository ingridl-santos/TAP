package br.edu.ufam.detran;

public class Aviao extends Aereo{
	private String tipoTransp;
	Aviao(Pessoa dono, String modelo, int ano, int alturaLim, String tipoTransp) {
		super(dono, modelo, ano, alturaLim);
		// TODO Auto-generated constructor stub
		this.tipoTransp = tipoTransp;
	}
	public String getTipoTransp() {
		if(tipoTransp == null || tipoTransp.equals(""))
			return "Tipo de Transporte não informado";
		else
			return tipoTransp;
	}
	public void setTipoTransp(String tipoTransp) {
		this.tipoTransp = tipoTransp;
	}
	

}
