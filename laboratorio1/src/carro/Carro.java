package carro;

import Maquinaria.IMaquinaria;

/* abstract dice que solo se va hacer 
 * uso de esta clase por medio de herencia
 */
public abstract class Carro implements IMaquinaria{

	//inmutable
	public final void print() {
		System.out.print(tipo());
	}
}
