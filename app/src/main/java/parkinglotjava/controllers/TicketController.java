package parkinglotjava.controllers;

import com.google.common.base.Optional;

import parkinglotjava.dtos.IssueTicketRequestDto;
import parkinglotjava.dtos.IssueTicketResponseDto;
import parkinglotjava.dtos.ResponseStatus;
import parkinglotjava.models.Ticket;
import parkinglotjava.services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDto issueTicket(IssueTicketRequestDto issueTicketRequestDto) {
        Optional<Ticket> ticket;
        IssueTicketResponseDto issueTicketResponseDto = new IssueTicketResponseDto();        
        //validate request
        if(issueTicketRequestDto == null ||
         issueTicketRequestDto.getGateId() == null ||
         issueTicketRequestDto.getOwnerName() == null ||
         issueTicketRequestDto.getRegistrationNumber() == null ||
         issueTicketRequestDto.getVehicleType() == null) {
            issueTicketResponseDto.setStatus(ResponseStatus.INVALID_REQUEST);
            return issueTicketResponseDto;
        }

        try{
            ticket = ticketService.issueTicket(issueTicketRequestDto.getGateId(),
             issueTicketRequestDto.getRegistrationNumber(),
             issueTicketRequestDto.getOwnerName(),
             issueTicketRequestDto.getVehicleType());
        } catch(Exception e) {
            issueTicketResponseDto.setStatus(ResponseStatus.FAILURE);
            return issueTicketResponseDto;
        }

        return issueTicketResponseDto;
    }
}
