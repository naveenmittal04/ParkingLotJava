package parkinglotjava.repositories;

import parkinglotjava.models.Operator;
import parkinglotjava.models.ParkingSlot;
import parkinglotjava.models.Ticket;
import parkinglotjava.models.Vehicle;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

import com.google.common.base.Optional;

public class TicketRepository {
    private Map<Long, Ticket> tickets = new TreeMap<Long, Ticket>();
    private Long previousId = 0L;

    public void saveTicket(Ticket ticket) {
        tickets.put(ticket.getId(), ticket);
    }

    public Optional<Ticket> issueTicket(ParkingSlot parkingSlot, Vehicle vehicle, Operator operator) {
        Ticket ticket = new Ticket(++previousId, new Date(), parkingSlot, vehicle, operator);
        saveTicket(ticket);
        return Optional.of(ticket);
    }
}
