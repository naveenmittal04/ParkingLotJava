package parkinglotjava.repositories;

import parkinglotjava.models.Vehicle;
import java.util.Map;
import java.util.TreeMap;

import com.google.common.base.Optional;

public class VehicleRepository {
    private Map<Long, Vehicle> vehicles = new TreeMap<Long, Vehicle>();

    public void saveVehicle(Vehicle vehicle) {
        vehicles.put(vehicle.getId(), vehicle);
    }

    public Optional<Vehicle> getVehicleById(long id) {
        if (!vehicles.containsKey(id)) {
            return Optional.absent();
        }
        return Optional.of(vehicles.get(id));
    }

    public Optional<Vehicle> getVehicleByNumber(String vehicleNumber) {
        return null;
    }
}
