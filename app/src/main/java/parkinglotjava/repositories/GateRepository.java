package parkinglotjava.repositories;

import parkinglotjava.models.Gate;
import java.util.Map;
import java.util.TreeMap;

public class GateRepository {
    private Map<Long, Gate> gates = new TreeMap<Long, Gate>();
}
