package carro;

import Maquinaria.IMaquinaria;

public class Carretera {
	//composicion, polimorfismo y inyeccion de dependencias
	//todo lo que sea categoria carro puede estar aqui
	//private Carro carro;	
	/*public Carretera(Carro carro) {
		this.carro = carro;
		
	}*/
	
	/*public void runCar() {
		System.out.print("Autopistas del sol corre carro tipo: ");
		carro.print();
	}*/
	private final IMaquinaria maquinaria;
	public Carretera(IMaquinaria maquinaria) {
		this.maquinaria = maquinaria;
	}
	
	public void runMaquinaria() {
		System.out.print("En autopistas del sol circulan maquinaria tipo: " + maquinaria.getMachineName()+"\n");
		//System.out.print();
	}
}
