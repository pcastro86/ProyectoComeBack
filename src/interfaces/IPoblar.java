package interfaces;

import modelos.*;

import java.util.List;

public interface IPoblar {
    List <Aerolinea> crearAerolineas();

    List <Vuelo> crearVuelos();

    List <Avion> crearAvion();

    List <Pasajero> creaPasajeros();
}
