package parkinglotjava.dtos;

import parkinglotjava.models.Vehicle;

public class IssueTicketRequestDto {
    private Long gateId;
    private Vehicle vehicle;
    public Long getGateId() {
        return gateId;
    }
    public void setGateId(Long gateId) {
        this.gateId = gateId;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
}
