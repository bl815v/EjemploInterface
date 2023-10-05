package co.edu.udistrital.model;

public class Sitp implements Vehiculo{

	@Override
	public String arrancar() {
		return "*Pone en marcha el bus*";
	}

	@Override
	public String detener() {
		return "*Frena y hace trancon*";
	}

}
