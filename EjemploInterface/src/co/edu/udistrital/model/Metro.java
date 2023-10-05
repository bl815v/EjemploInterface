package co.edu.udistrital.model;

public class Metro implements Vehiculo{

	@Override
	public String arrancar() {
		return "*Acelera el metro*";
	}

	@Override
	public String detener() {
		return "*Se detiene en la estacion*";
	}

}
