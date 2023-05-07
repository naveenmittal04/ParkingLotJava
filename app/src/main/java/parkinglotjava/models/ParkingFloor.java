package parkinglotjava.models;

import java.util.List;

public class ParkingFloor extends BaseModel{
    private Integer floorNumber;
    private List<ParkingSlot> parkingSlots;
    public ParkingFloor(Integer floorNumber, List<ParkingSlot> parkingSlots, ParkingFloorStatus parkingFloorStatus) {
        this.floorNumber = floorNumber;
        this.parkingSlots = parkingSlots;
        this.parkingFloorStatus = parkingFloorStatus;
    }
    public Integer getFloorNumber() {
        return floorNumber;
    }
    public void setFloorNumber(Integer floorNumber) {
        this.floorNumber = floorNumber;
    }
    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }
    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }
    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }
    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }
    private ParkingFloorStatus parkingFloorStatus;
}
