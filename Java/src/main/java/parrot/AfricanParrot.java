package parrot;

public class AfricanParrot extends ParrotImpl{
    public AfricanParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        super(type, numberOfCoconuts, voltage, isNailed);
    }

    static ParrotImpl createAfricanParrot(int numberOfCoconuts) {
        return new ParrotImpl(ParrotTypeEnum.AFRICAN, numberOfCoconuts, 0, false);
    }

    @Override
    public double getSpeed() {
        return switch (type) {
            case AFRICAN -> Math.max(0, Parrot.BASE_SPEED - getLoadFactor() * numberOfCoconuts);
            case NORWEGIAN_BLUE -> (isNailed) ? 0 : getBaseSpeed(voltage);
            default -> throw new IllegalArgumentException();
        };
    }
}