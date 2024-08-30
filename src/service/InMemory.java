package service;

import reporitory.ParkingLotRepository;
import reporitory.TicketRepository;

public class InMemory {
    public static ParkingLotRepository parkingLotRepository;
    public static TicketRepository ticketRepository;

    public InMemory() {
        this.parkingLotRepository = new ParkingLotRepository();
        this.ticketRepository = new TicketRepository();
    }

}
