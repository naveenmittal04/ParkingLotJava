package parkinglotjava.exceptions;

public class GateNotFoundForGateIdException extends Exception {

    private Long gateId;
    public GateNotFoundForGateIdException(Long gateId) {
        this.gateId = gateId;
    }

    @Override
    public String getMessage() {
        return "Gate not found for gate id "+ gateId;
    }
    
}
