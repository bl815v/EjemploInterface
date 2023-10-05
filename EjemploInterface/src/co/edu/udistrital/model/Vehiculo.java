package co.edu.udistrital.model;

public interface Vehiculo {
	String arrancar();
	String detener();
	default String echarPito() {
		return "*suena el pito*";
	}
}
