package parrot;

public class EuropeanParrot implements Parrot {
    static Parrot createEuropean() {
        return new EuropeanParrot();
    }

    private EuropeanParrot() {
    }

    @Override
    public double getSpeed() {
        return 12.0;
    }
}