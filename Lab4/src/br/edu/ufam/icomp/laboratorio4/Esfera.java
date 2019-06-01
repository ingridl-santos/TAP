package br.edu.ufam.icomp.laboratorio4;

public class Esfera extends formaGeometrica3D {

	Esfera(String descricao, int raio) {
		super(descricao);
		this.raio = raio;
	}
	
	int raio;	
	
	double getVolume(){
		return(4/3)*3.14*(raio*raio*raio);
	}

}	
