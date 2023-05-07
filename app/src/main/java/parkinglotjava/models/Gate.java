package parkinglotjava.models;

import java.sql.Date;

public class Gate extends BaseModel {
    private long gateNumber;
    private GateType gateType;
    private GateStatus gateStatus;
    private Operator operator;
    public long getGateNumber() {
        return gateNumber;
    }
    public void setGateNumber(long gateNumber) {
        this.gateNumber = gateNumber;
    }
    public GateType getGateType() {
        return gateType;
    }
    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }
    public GateStatus getGateStatus() {
        return gateStatus;
    }
    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }
    public Operator getOperator() {
        return operator;
    }
    public void setOperator(Operator operator) {
        this.operator = operator;
    }
    public Gate(long id, Date createdAt, Date updatedAt, long gateNumber, GateType gateType, GateStatus gateStatus,
            Operator operator) {
        super(id, createdAt, updatedAt);
        this.gateNumber = gateNumber;
        this.gateType = gateType;
        this.gateStatus = gateStatus;
        this.operator = operator;
    }
    public Gate(long gateNumber, GateType gateType, GateStatus gateStatus, Operator operator) {
        this.gateNumber = gateNumber;
        this.gateType = gateType;
        this.gateStatus = gateStatus;
        this.operator = operator;
    }
}
