package parrot;

public class EuropeanParrot implements Parrot {

    public EuropeanParrot() {
    }

    @Override
    public double getSpeed() {
        return BASE_SPEED;
    }
}