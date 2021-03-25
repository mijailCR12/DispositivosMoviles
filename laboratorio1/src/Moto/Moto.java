package Moto;

import Maquinaria.IMaquinaria;

public abstract class Moto implements IMaquinaria{
	//inmutable
	public final void print() {
		System.out.print(tipo());
	}
}
