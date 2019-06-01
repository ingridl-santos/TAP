package br.edu.ufam.icomp.laboratorio4;

public class Ortoedro extends formaGeometrica3D {

	Ortoedro(String descricao, int largura, int altura, int profundidade) {
		super(descricao);
		this.altura = altura;
		this.largura = largura;
		this.profundidade = profundidade;
	}
	
	int altura;
	int largura;
	int profundidade;
	
	double getVolume(){
		return altura*largura*profundidade;
		
	}
}
