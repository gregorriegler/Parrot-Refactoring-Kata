package parrot;

public class EuropeanParrot implements Parrot {
    static Parrot createEuropean() {
        return new ParrotImpl(ParrotTypeEnum.EUROPEAN, 0, 0, false);
    }

    @Override
    public double getSpeed() {
        return 12.0;
    }
}