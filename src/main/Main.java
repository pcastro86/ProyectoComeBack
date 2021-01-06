package main;

import interfaces.IBuscar;
import interfaces.IPoblar;
import interfaces.implementaciones.BuscarImp;
import interfaces.implementaciones.PoblarImp;
import modelos.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        IPoblar crearDatos = new PoblarImp();
        List <Aerolinea> listadoAerolineas = crearDatos.crearAerolineas();
        System.out.println(listadoAerolineas);

        List <Vuelo> listadoVuelos = crearDatos.crearVuelos();
        System.out.println(listadoVuelos);

        List <Avion> listadoAviones = crearDatos.crearAvion();
        System.out.println(listadoAviones);

        List <Pasajero> listadoPasajeros = crearDatos.creaPasajeros();
        System.out.println(listadoPasajeros);

        Ticket t1 = new Ticket(listadoAerolineas.get(0), listadoPasajeros.get(1), listadoVuelos.get(1), "clase1");
        System.out.println(t1);

        IBuscar buscarPasajeros = new BuscarImp();
        List<Pasajero> pasajeroABuscar = buscarPasajeros.buscarPasajero(listadoPasajeros, "Gimena");
        System.out.println(pasajeroABuscar);




    }
}
