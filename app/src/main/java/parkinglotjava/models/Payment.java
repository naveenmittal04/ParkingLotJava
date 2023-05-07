package parkinglotjava.models;

public class Payment extends BaseModel{
    private long amount;
    private long referenceNumber;
    public long getAmount() {
        return amount;
    }
    public void setAmount(long amount) {
        this.amount = amount;
    }
    public long getReferenceNumber() {
        return referenceNumber;
    }
    public void setReferenceNumber(long referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public Payment(long amount, long referenceNumber) {
        this.amount = amount;
        this.referenceNumber = referenceNumber;
    }
    
}
