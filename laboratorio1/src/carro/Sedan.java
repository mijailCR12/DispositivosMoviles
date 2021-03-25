package carro;

//carro hereda caracteristicas a sedan (tipe y print)
public class Sedan extends Carro{
	//se sobre escribe metodo
	@Override
	public String tipo() {
		return "sedan";
	}

	@Override
	public String getMachineName() {
		// TODO Auto-generated method stub
		return tipo();
	}
}
