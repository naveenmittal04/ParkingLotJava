package parkinglotjava.strategies;

import parkinglotjava.models.ParkingLot;
import parkinglotjava.models.ParkingSlot;
import parkinglotjava.models.VehicleType;

public interface ParkingSlotAssignmentStrategy {
    public ParkingSlot assignParkingSlot(ParkingLot parkingLot, VehicleType vehicleType);
}