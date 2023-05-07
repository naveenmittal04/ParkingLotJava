package parkinglotjava.repositories;

import parkinglotjava.models.ParkingLot;
import java.util.Map;
import java.util.TreeMap;

public class ParkingLotRepository {
    private Map<Long, ParkingLot> parkingLots = new TreeMap<Long, ParkingLot>();
}
