package main.java.parkinglotjava.models;

import java.sql.Date;

import main.java.parkinglotjava.strategies.BillCalculatorStrategy;
import main.java.parkinglotjava.strategies.ParkingSlotAssignmentStrategy;

public class ParkingLot extends BaseModel {
    private String name;
    private ParkingLotStatus status;
    private BillCalculatorStrategy billCalculatorStrategy;
    private ParkingSlotAssignmentStrategy parkingSlotAssignmentStrategy;
    
    public ParkingLot(long id, Date createdAt, Date updatedAt, String name, ParkingLotStatus status,
            BillCalculatorStrategy billCalculatorStrategy,
            ParkingSlotAssignmentStrategy parkingSlotAssignmentStrategy) {
        super(id, createdAt, updatedAt);
        this.name = name;
        this.status = status;
        this.billCalculatorStrategy = billCalculatorStrategy;
        this.parkingSlotAssignmentStrategy = parkingSlotAssignmentStrategy;
    }

    public ParkingLot(String name, ParkingLotStatus status, BillCalculatorStrategy billCalculatorStrategy,
            ParkingSlotAssignmentStrategy parkingSlotAssignmentStrategy) {
        this.name = name;
        this.status = status;
        this.billCalculatorStrategy = billCalculatorStrategy;
        this.parkingSlotAssignmentStrategy = parkingSlotAssignmentStrategy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ParkingLotStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingLotStatus status) {
        this.status = status;
    }

    public BillCalculatorStrategy getBillCalculatorStrategy() {
        return billCalculatorStrategy;
    }

    public void setBillCalculatorStrategy(BillCalculatorStrategy billCalculatorStrategy) {
        this.billCalculatorStrategy = billCalculatorStrategy;
    }

    public ParkingSlotAssignmentStrategy getParkingSlotAssignmentStrategy() {
        return parkingSlotAssignmentStrategy;
    }
    
    public void setParkingSlotAssignmentStrategy(ParkingSlotAssignmentStrategy parkingSlotAssignmentStrategy) {
        this.parkingSlotAssignmentStrategy = parkingSlotAssignmentStrategy;
    }
}
