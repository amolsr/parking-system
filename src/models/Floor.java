package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Floor {
    int id;
    int noOfSlots;
    Map<VehicleType, Integer> capacityMap;
    List<Vehicle> vehicleList;

    public Floor(int id, int noOfSlots) {
        this.id = id;
        this.noOfSlots = noOfSlots;
        Map<VehicleType, Integer> map = new HashMap<>();
        if (noOfSlots >= 1) {
            map.put(VehicleType.TRUCK, 1);
        }
        if (noOfSlots <= 3) {
            map.put(VehicleType.BIKE, noOfSlots - 1);
        }
        if (noOfSlots > 3) {
            map.put(VehicleType.CAR, noOfSlots - 3);
        }
        this.capacityMap = map;
        this.vehicleList = new ArrayList<>(noOfSlots);
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return id;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "[" + id + "]";
    }
}
