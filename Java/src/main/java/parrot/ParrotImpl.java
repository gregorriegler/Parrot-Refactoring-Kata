package parrot;

public class ParrotImpl implements Parrot {

    protected final ParrotTypeEnum type;
    protected final int numberOfCoconuts;
    protected final double voltage;
    protected final boolean isNailed;

    public ParrotImpl(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    @Override
    public double getSpeed() {
        return switch (type) {
            case AFRICAN -> Math.max(0, Parrot.BASE_SPEED - getLoadFactor() * numberOfCoconuts);
            case NORWEGIAN_BLUE -> (isNailed) ? 0 : getBaseSpeed(voltage);
            default -> throw new IllegalArgumentException();
        };
    }

    protected double appleSauce() {
        return Math.max(0, Parrot.BASE_SPEED - getLoadFactor() * numberOfCoconuts);
    }

    protected double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * Parrot.BASE_SPEED);
    }

    protected double getLoadFactor() {
        return 9.0;
    }

}
