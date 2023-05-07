package parkinglotjava.repositories;

import parkinglotjava.models.Ticket;
import java.util.Map;
import java.util.TreeMap;

public class TicketRepository {
    private Map<Long, Ticket> tickets = new TreeMap<Long, Ticket>();

    public void saveTicket(Ticket ticket) {
        tickets.put(ticket.getId(), ticket);
    }
}
