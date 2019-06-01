package br.edu.ufam.detran;

import java.lang.System;

public class SistemaDetran {
	
	public static void main(String args[]){
		Pessoa pessoa1 = new Pessoa("Ingrid", 18, 02452120);
		Pessoa pessoa2 = new Pessoa("Ivens", 46, 569184072);
		
		Carro car = new Carro(pessoa2, "Estrada", 2013, "Fiat", "Hidraulica");
		Moto moto = new Moto(pessoa1, "Cross", 2015,"Yamaha", "Gasolina");
		Aviao aviao = new Aviao(pessoa1,"airbus",2010,100000,"Comercial");
		Barco barco = new Barco(pessoa2,"motor",2014,60,"Parintins");
		
		System.out.println("Dono:"+pessoa1.getNome()+"\nIdade:"+pessoa1.getIdade()+"\nCPF:"+pessoa1.getCpf());
		System.out.println("Veiculo:"+car.getMarca()+"\nAno:"+car.getAno()+"\nModelo:"+car.getModelo()+"\nTipo Direção:"+car.getTipoDir());
		System.out.println();
		/**Dono:Ingrid
		   Idade:18
		   CPF:676944
		   Veiculo:Fiat
		   Ano:2013
		   Modelo:Estrada
		   Tipo Direção:Hidraulica
		 * 
		 */
		
		
		System.out.println("Dono:"+pessoa2.getNome()+"\nIdade:"+pessoa2.getIdade()+"\nCPF:"+pessoa2.getCpf());
		System.out.println("Veiculo:"+moto.getMarca()+"\nAno:"+moto.getAno()+"\nModelo:"+moto.getModelo()+"\nCombustivél:"+moto.getTipoComb());
		System.out.println();
	/**	Dono:Ivens
		Idade:46
		CPF:569184072
		Veiculo:Yamaha
		Ano:2015
		Modelo:Cross
		Combustivél:Gasolina
		*/
		
		
		System.out.println("Dono:"+pessoa1.getNome()+"\nIdade:"+pessoa1.getIdade()+"\nCPF:"+pessoa1.getCpf());
		System.out.println("Veiculo:"+aviao.getModelo()+"\nAno:"+aviao.getAno()+"\nAltura Limite:"+aviao.getAlturaLim()+"\nTipo de Transporte:"+aviao.getTipoTransp());
		System.out.println();
		
		/**Dono:Ingrid
			Idade:18
			CPF:676944
			Veiculo:airbus
			Ano:2010
			Altura Limite:100000
			Tipo de Transporte:Comercial
		*/
		
		
		System.out.println("Dono:"+pessoa2.getNome()+"\nIdade:"+pessoa2.getIdade()+"\nCPF:"+pessoa2.getCpf());
		System.out.println("Veiculo:"+barco.getModelo()+"\nAno:"+barco.getAno()+"\nCapacidade:"+barco.getCapacidade()+"\nDestino:"+barco.getDestino());
		/**
		 * Dono:Ivens
			Idade:46
			CPF:569184072
			Veiculo:motor
			Ano:2014
			Capacidade:60
			Destino:Parintins
		 */
	
	}

}