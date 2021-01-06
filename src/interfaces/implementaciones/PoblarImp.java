package interfaces.implementaciones;

import interfaces.IPoblar;
import modelos.*;

import java.util.ArrayList;
import java.util.List;

public class PoblarImp implements IPoblar {
    @Override
    public List<Aerolinea> crearAerolineas() {
        List <Aerolinea> arolineasCreadas = new ArrayList<>();

        Aerolinea payaso = new Aerolinea("Aerolinas Payaso");
        Aerolinea latam = new Aerolinea("LATAM");
        Aerolinea iberia = new Aerolinea("Iberia");

        arolineasCreadas.add(payaso);
        arolineasCreadas.add(latam);
        arolineasCreadas.add(iberia);

        return arolineasCreadas;
    }

    @Override
    public List<Vuelo> crearVuelos() {
        List <Vuelo> vuelosCreados = new ArrayList<>();

        Vuelo vuelo1 = new Vuelo("VU213", "BS.AS", "MIAMI", "23-06", "03-07","10:00", "15:00", null);
        Vuelo vuelo2 = new Vuelo("VU3333", "FRA", "CANADA", "30-10", "30-12","14:00", "18:00", null);


        vuelosCreados.add(vuelo1);
        vuelosCreados.add(vuelo2);

        return vuelosCreados;
    }

    @Override
    public List<Avion> crearAvion() {
        List<Avion> avionesCreados = new ArrayList<>();

        Avion avion1 = new Avion("AV201", 200, "Ford");
        Avion avion2 = new Avion("AV442", 100, "Renault");
        avionesCreados.add(avion1);
        avionesCreados.add(avion2);

        return avionesCreados;
    }

    @Override
    public List<Pasajero> creaPasajeros() {
        List<Pasajero> pasajerosCreados = new ArrayList<>();

        Pasajero pasaj1 = new Pasajero("Pilar", "Castro", 33085669);
        Pasajero pasaj2 = new Pasajero("Gimena", "Moron", 2828282);
        pasajerosCreados.add(pasaj1);
        pasajerosCreados.add(pasaj2);

        return pasajerosCreados;
    }

}
