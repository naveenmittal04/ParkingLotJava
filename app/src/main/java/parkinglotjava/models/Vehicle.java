package parkinglotjava.models;

public class Vehicle extends BaseModel{
    private String registrationNumber;
    private VehicleType type;
    private String ownerName;

    public Vehicle(String registrationNumber, VehicleType type, String ownerName) {
        this.registrationNumber = registrationNumber;
        this.type = type;
        this.ownerName = ownerName;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Vehicle(String registrationNumber, VehicleType type) {
        this.registrationNumber = registrationNumber;
        this.type = type;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public VehicleType getType() {
        return type;
    }    
}
