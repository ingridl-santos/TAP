package br.edu.ufam.icomp.laboratorio4;

public class Circulo extends formaGeometrica2D {

	Circulo(String descricao, int raio) {
		super(descricao);
		this.raio = raio;
	}
	
	int raio = 5;
		
	double getArea(){
		return 3.14*raio;
	}
	

}
