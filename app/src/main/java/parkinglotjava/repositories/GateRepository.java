package parkinglotjava.repositories;

import parkinglotjava.models.Gate;
import java.util.Map;
import java.util.TreeMap;

import com.google.common.base.Optional;

public class GateRepository {
    private Map<Long, Gate> gates = new TreeMap<Long, Gate>();

	public Optional<Gate> getGateById(Long gateId) {
        if(!gates.containsKey(gateId)) {
            return Optional.absent();
        }
        return Optional.of(gates.get(gateId));
	}
}
