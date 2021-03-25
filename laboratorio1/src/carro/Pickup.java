package carro;

public class Pickup extends Carro{
	//se sobre escribe metodo
	public String tipo() {
		return "pickup";
	}

	@Override
	public String getMachineName() {
		return tipo();
	}


}
