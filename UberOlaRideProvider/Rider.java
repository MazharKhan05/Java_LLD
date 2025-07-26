package UberOlaRideProvider;

public class Rider extends User implements RiderActions {
    public Rider(String userId, String userName) {
        super(userId, userName);
    }

    @Override
    public void rateDriver(VehicleDriver driver, int rating) {
        System.out.println(driver.getUserName() + " rated with  " + rating + " by " + userName);
    }
    
}
