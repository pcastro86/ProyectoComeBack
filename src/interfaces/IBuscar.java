package interfaces;

import modelos.Pasajero;
import modelos.Ticket;

import java.util.List;

public interface IBuscar {
    List<Pasajero> buscarPasajero(List <Pasajero> listadePasajeros, String nombredelPasajero );
    List<Ticket> buscarTicket(List <Pasajero> listadeTickets, String nombredelPasajero );
}
