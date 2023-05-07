package parkinglotjava.services;

import parkinglotjava.models.Ticket;

import com.google.common.base.Optional;
import parkinglotjava.models.ParkingLot;
import parkinglotjava.models.Vehicle;
import parkinglotjava.repositories.GateRepository;
import parkinglotjava.repositories.ParkingLotRepository;
import parkinglotjava.repositories.TicketRepository;
import parkinglotjava.repositories.VehicleRepository;

public class TicketService {
    private TicketRepository ticketRepository;
    private GateRepository gateRepository;
    private ParkingLotRepository parkingLotRepository;
    private VehicleRepository vehicleRepository;

    public TicketService(TicketRepository ticketRepository, GateRepository gateRepository,
            ParkingLotRepository parkingLotRepository, VehicleRepository vehicleRepository) {
        this.ticketRepository = ticketRepository;
        this.gateRepository = gateRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.vehicleRepository = vehicleRepository;
    }

    public Optional<Ticket> issueTicket(){
        return null;
    }
}
