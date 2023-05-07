package parkinglotjava.services;

import parkinglotjava.models.Ticket;

import com.google.common.base.Optional;

import parkinglotjava.exceptions.GateNotFoundForGateIdException;
import parkinglotjava.exceptions.ParkingLotNotFoundForGateIdException;
import parkinglotjava.models.Gate;
import parkinglotjava.models.ParkingLot;
import parkinglotjava.models.ParkingSlot;
import parkinglotjava.models.Vehicle;
import parkinglotjava.models.VehicleType;
import parkinglotjava.repositories.GateRepository;
import parkinglotjava.repositories.ParkingLotRepository;
import parkinglotjava.repositories.TicketRepository;
import parkinglotjava.repositories.VehicleRepository;
import parkinglotjava.strategies.ParkingSlotAssignmentStrategy;

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

    public Optional<Ticket> issueTicket(Long gateId, String vehicleNumber, String ownerNamer, VehicleType vehicleType) throws ParkingLotNotFoundForGateIdException, GateNotFoundForGateIdException {
        Optional<ParkingLot> parkingLot = parkingLotRepository.getParkingLotByGateId(gateId);
        if (!parkingLot.isPresent()) {
            throw new ParkingLotNotFoundForGateIdException(gateId);
        }
        Optional<Vehicle> vehicle = vehicleRepository.getVehicleByNumber(vehicleNumber);
        if (!vehicle.isPresent()) {
            vehicle = Optional.of(new Vehicle(vehicleNumber, vehicleType, ownerNamer));
            vehicleRepository.saveVehicle(vehicle.get());
        }

        ParkingSlotAssignmentStrategy parkingSlotAssignmentStrategy = parkingLot.get().getParkingSlotAssignmentStrategy();
        ParkingSlot parkingSlot = parkingSlotAssignmentStrategy.assignParkingSlot(parkingLot.get(), vehicleType);
        Optional<Gate> gate = gateRepository.getGateById(gateId);
        if(!gate.isPresent()) {
            throw new GateNotFoundForGateIdException(gateId);
        }
        Optional<Ticket> ticket = ticketRepository.issueTicket(parkingSlot, vehicle.get(), gate.get().getOperator());
        return ticket;
    }
}
