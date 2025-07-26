package UberOlaRideProvider.statePattern;

import UberOlaRideProvider.Ride;

public class CompletedState implements RideState {
    @Override
    public void updateState(Ride ride) {
        System.out.println("Ride " + ride.getRideId() + " is now in Completed State.");
    }
}
