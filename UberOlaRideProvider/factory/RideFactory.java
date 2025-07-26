package UberOlaRideProvider.factory;

import UberOlaRideProvider.Rider;
import UberOlaRideProvider.User;
import UberOlaRideProvider.VehicleDriver;

public class RideFactory {
    public static User createUser(String type, String userId, String userName) {
        return switch (type.toLowerCase()) {
            case "driver" -> new VehicleDriver(userId, userName);
            case "rider" -> new Rider(userId, userName);
            default -> throw new IllegalArgumentException("Unknown user type: " + type);
        };
    }
}
