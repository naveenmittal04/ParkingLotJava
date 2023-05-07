package parkinglotjava.dtos;

import parkinglotjava.models.VehicleType;

public class IssueTicketRequestDto {
    private Long gateId;
    private String registrationNumber;
    private String ownerName;
    private VehicleType vehicleType;

    public Long getGateId() {
        return gateId;
    }
    public void setGateId(Long gateId) {
        this.gateId = gateId;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public IssueTicketRequestDto(Long gateId, String registrationNumber, String ownerName, VehicleType vehicleType) {
        this.gateId = gateId;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    public VehicleType getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
    
}
