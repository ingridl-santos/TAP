package br.edu.ufam.icomp.laboratorio4;

public class Retangulo extends formaGeometrica2D {

	Retangulo(String descricao, int base, int altura) {
		super(descricao);
		this.base = base;
		this.altura = altura;
	}
	 
	int base;
	int altura;
	
	double getArea(){
		return base*altura;
	}
}
