package UberOlaRideProvider;

import UberOlaRideProvider.statePattern.RequestState;
import UberOlaRideProvider.statePattern.RideState;

public class Ride {
    private String rideId;
    private VehicleDriver driver;
    private Rider rider;
    
    private Location pickUp;
    private Location drop;

    private RideState state;

    public Ride(Builder builder)
    {
        this.rideId = "R" + System.currentTimeMillis();
        this.driver = builder.driver;
        this.rider = builder.rider;
        this.pickUp = builder.pickUp;
        this.drop = builder.drop;
        this.state = new RequestState();
    }
    public String getRideId() {
        return rideId;
    }
    public Location getPickUpLocation() {
        return pickUp;
    }
    public Location getDropLocation() {
        return drop;
    }
    public void setDriver(VehicleDriver driver) {
        this.driver = driver;
    }
    public void setRider(Rider rider) {
        this.rider = rider;
    }
    public  void setState(RideState state) {
        this.state = state;
    }
    public static class Builder {
        private VehicleDriver driver;
        private Rider rider;
        private Location pickUp;
        private Location drop;

        public Builder withDriver(VehicleDriver driver) {
            this.driver = driver;
            return this;
        }

        public Builder withRider(Rider rider) {
            this.rider = rider;
            return this;
        }

        public Builder withPickUp(Location pickUp) {
            this.pickUp = pickUp;
            return this;
        }

        public Builder withDrop(Location drop) {
            this.drop = drop;
            return this;
        }

        public Ride build() {
            return new Ride(this);
        }
    }
}
