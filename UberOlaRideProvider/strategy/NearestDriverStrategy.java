package UberOlaRideProvider.strategy;

import java.util.List;

import UberOlaRideProvider.Location;
import UberOlaRideProvider.VehicleDriver;

public class NearestDriverStrategy {
    public VehicleDriver findNearestDriver(List<VehicleDriver> drivers, Location pickupLocation) {
        VehicleDriver nearestDriver = null;
        double minDistance = Double.MAX_VALUE;

        for (VehicleDriver driver : drivers) {
            double distance = driver.getLocation().getDistance(pickupLocation);
            if (distance < minDistance) {
                minDistance = distance;
                nearestDriver = driver;
            }
        }

        return nearestDriver;
    }
}
