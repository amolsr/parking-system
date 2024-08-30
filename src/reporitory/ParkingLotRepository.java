package reporitory;

import java.util.List;
import java.util.Map;

import models.Floor;
import models.ParkingLot;
import models.Vehicle;
import models.VehicleType;

public class ParkingLotRepository {
    ParkingLot parkingLot;
    Map<Floor, Map<VehicleType, Integer>> availableSlots;

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public boolean isSlotAvailable(Floor floor, VehicleType vehicleType) {
        if (availableSlots.get(floor).get(vehicleType) > 0) {
            return true;
        } else {
            return false;
        }
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void addVehicleToFloor(Floor floor, Vehicle vehicle) {
        List<Vehicle> vehicles = floor.getVehicleList();
        vehicles.add(vehicle);
        floor.setVehicleList(vehicles);
    }
}
