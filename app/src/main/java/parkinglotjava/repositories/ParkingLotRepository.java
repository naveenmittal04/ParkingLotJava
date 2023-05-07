package parkinglotjava.repositories;

import parkinglotjava.models.ParkingLot;
import java.util.Map;
import java.util.TreeMap;

import com.google.common.base.Optional;

public class ParkingLotRepository {
    private Map<Long, ParkingLot> parkingLots = new TreeMap<Long, ParkingLot>();

    public Optional<ParkingLot> getParkingLotByGateId(Long gateId) {
        return null;
    }
}
