package service;

import models.ParkingLot;
import reporitory.ParkingLotRepository;

public class ParkingLotService {
    public ParkingLotRepository parkingLotRepository;

    public ParkingLotService(ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository = parkingLotRepository;
    }

    public void createParkingLot(String parkingLotId, Integer noOfFloors, Integer noOfSlotsPerFloor) {
        this.parkingLotRepository.setParkingLot(new ParkingLot(parkingLotId, noOfFloors, noOfSlotsPerFloor));
        System.out
                .println("Created parking lot with <no_of_floors> floors and <no_of_slots_per_floor> slots per floor");
    }

    public void display(String displayType, String vehicleType) {
        parkingLotRepository.getCountByVehicleTypeAnddisplayType(displayType, vehicleType);
    }
}
