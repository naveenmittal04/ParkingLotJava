package main.java.parkinglotjava.models;

import java.sql.Date;
import java.util.List;

public class ParkingSlot extends BaseModel {
    private List<VehicleType> supportedVehicleTypes;
    private ParkingSlotStatus parkingSlotStatus;
    private ParkingFloor parkingFloor;
    public ParkingSlot(long id, Date createdAt, Date updatedAt, List<VehicleType> supportedVehicleTypes,
            ParkingSlotStatus parkingSlotStatus, ParkingFloor parkingFloor) {
        super(id, createdAt, updatedAt);
        this.supportedVehicleTypes = supportedVehicleTypes;
        this.parkingSlotStatus = parkingSlotStatus;
        this.parkingFloor = parkingFloor;
    }
    public ParkingSlot(List<VehicleType> supportedVehicleTypes, ParkingSlotStatus parkingSlotStatus,
            ParkingFloor parkingFloor) {
        this.supportedVehicleTypes = supportedVehicleTypes;
        this.parkingSlotStatus = parkingSlotStatus;
        this.parkingFloor = parkingFloor;
    }
    public List<VehicleType> getSupportedVehicleTypes() {
        return supportedVehicleTypes;
    }
    public void setSupportedVehicleTypes(List<VehicleType> supportedVehicleTypes) {
        this.supportedVehicleTypes = supportedVehicleTypes;
    }
    public ParkingSlotStatus getParkingSlotStatus() {
        return parkingSlotStatus;
    }
    public void setParkingSlotStatus(ParkingSlotStatus parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }
    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }
    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }
}
