package br.edu.ufam.icomp.laboratorio4;

public class FormasGeometricasMain {

	public static void main(String[] args) {
		formaGeometrica[] fG = new formaGeometrica[8];
		fG[0] = new Circulo("Verde",6);
		fG[1] = new Retangulo("Azul",3,6);
		fG[2] = new Ortoedro("Amarelo",10,5,9);
		fG[3] = new Esfera("branco",10);
		fG[4] = new Retangulo("preto",4,9);
		fG[5] = new Ortoedro("roxo",3,6,9);
		fG[6] = new Circulo("lilás",2);
		fG[7] = new Esfera("cinza",5);
		
		for(int i = 0; i < fG.length; i++){
			System.out.println(fG[i].getDescricao());
			
			if(fG[i] instanceof formaGeometrica2D){
				formaGeometrica2D fg2 = (formaGeometrica2D)fG[i];
				System.out.println(fg2.getArea());
			}
			if(fG[i] instanceof formaGeometrica3D){
				formaGeometrica3D fg3 = (formaGeometrica3D)fG[i];
				System.out.println(fg3.getVolume());
			}
		}
	}
}
