package interfaces.implementaciones;

import interfaces.IBuscar;
import modelos.Pasajero;
import modelos.Ticket;

import java.util.ArrayList;
import java.util.List;

public class BuscarImp implements IBuscar {
    @Override
    public List<Pasajero> buscarPasajero(List<Pasajero> listadePasajeros, String nombredelPasajero) {
        List <Pasajero> pasajero = new ArrayList<>();
        for (Pasajero a: listadePasajeros) {
            if (a.getNombre().equals(nombredelPasajero)){
                pasajero.add(a);
            }
            
        }
        
        return pasajero;
    }

    @Override
    public List<Ticket> buscarTicket(List<Pasajero> listadeTickets, String nombredelPasajero) {
        List <Ticket> ticket = new ArrayList<>();
        for (Ticket a: listadeTickets) {
            if (a.getPasajero().equals(nombredelPasajero)){
                ticket.add(a);
            }

        }

        return ticket;
    }
}
