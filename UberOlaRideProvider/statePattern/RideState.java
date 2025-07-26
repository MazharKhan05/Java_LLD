package UberOlaRideProvider.statePattern;

import UberOlaRideProvider.Ride;

public interface RideState {
    void updateState(Ride ride);
}
