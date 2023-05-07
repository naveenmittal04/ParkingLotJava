package parkinglotjava.models;

import java.sql.Date;

public class Ticket extends BaseModel {
    public Ticket(long id, Date createdAt, Date updatedAt, Date entryTime,
            ParkingSlot parkingSlot, Vehicle vehicle) {
        super(id, createdAt, updatedAt);
        this.entryTime = entryTime;
        this.parkingSlot = parkingSlot;
        this.vehicle = vehicle;
    }
    public Ticket(Date entryTime, ParkingSlot parkingSlot, Vehicle vehicle) {
        this.entryTime = entryTime;
        this.parkingSlot = parkingSlot;
        this.vehicle = vehicle;
    }
    public Date getEntryTime() {
        return entryTime;
    }
    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }
    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }
    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    private Date entryTime;
    private ParkingSlot parkingSlot;
    private Vehicle vehicle;    
}
