package UberOlaRideProvider.statePattern;

import UberOlaRideProvider.Ride;

public class InProgressState implements RideState {
    @Override
    public void updateState(Ride ride) {
        System.out.println("Ride " + ride.getRideId() + " is now in In Progress State.");
    }
    
}
