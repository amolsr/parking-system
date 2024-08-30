package service;

import java.util.List;

import models.Floor;
import models.ParkingLot;
import models.Vehicle;
import models.VehicleType;
import reporitory.ParkingLotRepository;
import reporitory.TicketRepository;

public class VehicleService {

    TicketRepository ticketRepository;

    ParkingLotRepository parkingLotRepository;

    public VehicleService(TicketRepository ticketRepository, ParkingLotRepository parkingLotRepository) {
        this.ticketRepository = ticketRepository;
        this.parkingLotRepository = parkingLotRepository;
    }

    public parkVehicle(String vehicle_type, String reg_no, String color){
        ParkingLot parkingLot = parkingLotRepository.getParkingLot();

        List<Floor> floors = parkingLot.getFloors();

        Vehicle vc = new Vehicle(reg_no, color, VehicleType.valueOf(vehicle_type));

        for(int i = 0 ; i < floors.size() ; i++) {
            if(parkingLotRepository.isSlotAvailable(floors.get(i), VehicleType.valueOf(vehicle_type))){

            }else{
                System.out.println("No Slot Available");
            }
        }



    }

    public unpark_vehicle(String tickerId){

    }
}
