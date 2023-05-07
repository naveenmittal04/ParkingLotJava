package parkinglotjava.exceptions;

public class ParkingLotNotFoundForGateIdException extends Exception {

    private Long gateId;
    public ParkingLotNotFoundForGateIdException(Long gateId) {
        this.gateId = gateId;
    }

    @Override
    public String getMessage() {
        return "Parking lot not found for gate id "+ gateId;
    }
    
}
