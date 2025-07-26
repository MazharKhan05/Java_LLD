package UberOlaRideProvider;

public interface RideManagerActions {
    public void addDriver(VehicleDriver driver);
    public void bookRide(Ride ride);
    public void completeRide(String rideId);
}
