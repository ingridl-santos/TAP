package br.edu.ufam.icomp.laboratorio4;

public abstract class formaGeometrica3D extends formaGeometrica {

	formaGeometrica3D(String descricao) {
		super(descricao);
	}
	
	abstract double getVolume();
}
