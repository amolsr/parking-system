package models;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    String id;
    List<Floor> floors;

    public ParkingLot(String id, int noOfFloors, int numberOfSlotsPerFloor) {
        this.id = id;
        List<Floor> li = new ArrayList<>();
        for (int i = 0; i < noOfFloors; i++) {
            li.add(new Floor(i, numberOfSlotsPerFloor));
        }
        this.floors = li;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public Floor getFloorById(int id) {
        return floors.get(id);
    }

}
