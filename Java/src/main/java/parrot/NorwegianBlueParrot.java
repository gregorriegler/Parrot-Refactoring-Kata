package parrot;

public class NorwegianBlueParrot implements Parrot {

    protected final ParrotTypeEnum type;
    protected final double voltage;
    protected final boolean isNailed;

    public NorwegianBlueParrot(double voltage, boolean isNailed) {
        this.type = ParrotTypeEnum.NORWEGIAN_BLUE;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    @Override
    public double getSpeed() {
        return (isNailed) ? 0 : getBaseSpeed(voltage);
    }

    protected double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * Parrot.BASE_SPEED);
    }

}
