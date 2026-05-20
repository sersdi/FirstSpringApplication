package ru.codekitchen.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;

@Component
public class Parking {

    private final List<Vehicle> vehiclesList;
    private final Map<String, Vehicle> vehiclesMap;

    @Autowired
    public Parking(List<Vehicle> vehiclesList, Map<String, Vehicle> vehiclesMap) {
        this.vehiclesList = vehiclesList;
        this.vehiclesMap = vehiclesMap;
    }

    public List<Vehicle> getVehiclesList() {
        return vehiclesList;
    }

    public Map<String, Vehicle> getVehiclesMap() {
        return vehiclesMap;
    }

//    @Override
//    public String toString() {
//        return "Parking{" +
//                "vehiclesList=" + vehiclesList +
//                ", vehiclesMap=" + vehiclesMap +
//                '}';
//    }


}
