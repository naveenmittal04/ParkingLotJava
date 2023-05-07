package parkinglotjava.models;

import java.util.Date;

public class Ticket extends BaseModel {
    private Date entryTime;
    private ParkingSlot parkingSlot;
    private Vehicle vehicle;
    private Operator operator;
    
    public Ticket(long id, Date entryTime,
            ParkingSlot parkingSlot, Vehicle vehicle, Operator operator) {
        super(id);
        this.entryTime = entryTime;
        this.parkingSlot = parkingSlot;
        this.vehicle = vehicle;
        this.operator = operator;
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
    public Operator getOperator() {
        return operator;
    }
    public void setOperator(Operator operator) {
        this.operator = operator;
    }
        
}
