package parrot;

public class NorwegianBlueParrot implements Parrot {

    protected final ParrotTypeEnum type;
    protected final double voltage;
    protected final boolean isNailed;

    public NorwegianBlueParrot(ParrotTypeEnum type, double voltage, boolean isNailed) {
        this.type = type;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    @Override
    public double getSpeed() {
        return switch (type) {
            case NORWEGIAN_BLUE -> (isNailed) ? 0 : getBaseSpeed(voltage);
            default -> throw new IllegalArgumentException();
        };
    }

    protected double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * Parrot.BASE_SPEED);
    }

}
