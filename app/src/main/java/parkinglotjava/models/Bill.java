package parkinglotjava.models;

import java.util.List;

public class Bill extends BaseModel {
    private long amount;
    private List<Payment> payments;
    public long getAmount() {
        return amount;
    }
    public void setAmount(long amount) {
        this.amount = amount;
    }
    public List<Payment> getPayments() {
        return payments;
    }
    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
    public Bill(long amount, List<Payment> payments) {
        this.amount = amount;
        this.payments = payments;
    }    
}
