package parkinglotjava.controllers;

import parkinglotjava.dtos.IssueTicketRequestDto;
import parkinglotjava.dtos.IssueTicketResponseDto;
import parkinglotjava.services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDto issueTicket(IssueTicketRequestDto issueTicketRequestDto) {
        if(issueTicketRequestDto != null && issueTicketRequestDto.getGateId() != null && issueTicketRequestDto.getVehicle() != null) {

            return ticketService.issueTicket(issueTicketRequestDto);
        }
        return null;
    }
}
