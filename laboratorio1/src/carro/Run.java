package carro;

import Moto.Ducati;
import Moto.Moto;
import Moto.Ninja;

public class Run {
	/*public static void main(String[] args) {
		Carro carro = new Sedan(); //composicion y polimorfismo
		carro.print();
		
		carro = new Pickup(); //composicion y polimorfismo
		carro.print();
	}*/
	public static void main(String[] args) {
		//inyeccion de dependencia
		//new Carretera(createCarType(CarType.SEDAN)).runCar();
		//new Carretera(createCarType("pickup")).runCar();
	
		new Carretera(createCarFactory(CarType.SEDAN)).runMaquinaria();
		new Carretera(createCarFactory(CarType.PICKUP)).runMaquinaria();
		new Carretera(createMotoFactory(MotoType.DUCATI)).runMaquinaria();
		new Carretera(createMotoFactory(MotoType.NINJA)).runMaquinaria();
	}
	
	//Single responsability principle
	private static Carro createCarFactory(CarType type) {
		if(type.equals(CarType.SEDAN)) {
			return new Sedan();
		}
		return new Pickup();
		
	}
	
	private enum CarType{
		SEDAN,
		PICKUP
	}
	
	private static Moto createMotoFactory(MotoType type) {
		if(type.equals(MotoType.DUCATI)) {
			return new Ducati();
		}
		return new Ninja();	
	}
	
	private enum MotoType{
		NINJA,
		DUCATI
	}}
