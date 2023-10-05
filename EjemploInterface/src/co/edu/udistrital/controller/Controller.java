package co.edu.udistrital.controller;

import co.edu.udistrital.model.*;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	private VistaConsola vista;
	public Controller() {
		vista = new VistaConsola();
		funcionar();
	}
	
	public void funcionar() {
		Sitp bus = new Sitp();
		vista.mostrarInformacion(bus.arrancar() + "\n" + bus.detener() + "\n" + bus.echarPito());
		vista.mostrarInformacion("_________________________________________________________________");
		Bicicleta bmx = new Bicicleta();
		vista.mostrarInformacion(bmx.arrancar() + "\n" + bmx.detener() + "\n" + bmx.echarPito());
		vista.mostrarInformacion("_________________________________________________________________");
		Metro metroBogota = new Metro();
		vista.mostrarInformacion(metroBogota.arrancar() + "\n" + metroBogota.detener() + "\n" + metroBogota.echarPito());
		
		
	}
}