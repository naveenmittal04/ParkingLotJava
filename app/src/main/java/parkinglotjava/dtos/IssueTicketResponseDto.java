package parkinglotjava.dtos;

import parkinglotjava.models.Ticket;

public class IssueTicketResponseDto {
    private ResponseStatus status;
    private Ticket ticket;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }
}
