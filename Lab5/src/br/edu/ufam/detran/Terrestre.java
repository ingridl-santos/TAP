package br.edu.ufam.detran;

public class Terrestre extends Veiculo{
	private String marca;
	
	Terrestre(Pessoa dono, String modelo, int ano, String marca) {
		super(dono, modelo, ano);
		// TODO Auto-generated constructor stub
		this.marca = marca;
	}

	public String getMarca() {
		if(marca == null || marca.equals(""))
			return "Marca do veículo não informada!";
		else 
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}


	

}
