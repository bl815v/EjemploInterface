package co.edu.udistrital.model;

public class Bicicleta implements Vehiculo{

	@Override
	public String arrancar() {
		return "*Pedalea*";
	}

	@Override
	public String detener() {
		return "*Frena con cuidado*";
	}
	
}
