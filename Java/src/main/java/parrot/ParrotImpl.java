package parrot;

public class ParrotImpl implements Parrot {

    private final ParrotTypeEnum type;
    private final int numberOfCoconuts;
    private final double voltage;
    private final boolean isNailed;

    public ParrotImpl(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    @Override
    public double getSpeed() {
        return switch (type) {
            case AFRICAN -> appleSauce();
            case NORWEGIAN_BLUE -> (isNailed) ? 0 : getBaseSpeed(voltage);
            default -> throw new IllegalArgumentException();
        };
    }

    private double appleSauce() {
        return Math.max(0, Parrot.BASE_SPEED - getLoadFactor() * numberOfCoconuts);
    }

    private double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * Parrot.BASE_SPEED);
    }

    private double getLoadFactor() {
        return 9.0;
    }

}
