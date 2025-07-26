package UberOlaRideProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import UberOlaRideProvider.strategy.NearestDriverStrategy;

public class RideManager implements RideManagerActions {
    private static RideManager instance;
    List<VehicleDriver> drivers = new ArrayList<>();
    private RideManager() {
        // Private constructor to prevent instantiation
    }
    public static RideManager getInstance() {
        if(Objects.isNull(instance)) {
            synchronized (RideManager.class) {
                if(Objects.isNull(instance)) {
                    instance = new RideManager();
                }
            }
        }
        return instance;
    }
    @Override
    public void addDriver(VehicleDriver driver) {
        drivers.add(driver);
        System.out.println("Driver " + driver.getUserName() + " added successfully.");
    }
    @Override
    public void bookRide(Ride ride) {
        VehicleDriver driver = new NearestDriverStrategy().findNearestDriver(drivers, ride.getPickUpLocation());
        ride.setDriver(driver);
        System.out.println("Ride " + ride.getRideId() + " booked with driver " + driver.getUserName() + ".");
        driver.notify("New ride request: " + " from " + ride.getPickUpLocation());
    }
    @Override
    public void completeRide(String rideId) {
       System.out.println("Ride " + rideId + " completed successfully.");
    }



}
