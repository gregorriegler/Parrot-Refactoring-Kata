package parrot;

public class AfricanParrot extends ParrotImpl{

    public static final double LOAD_FACTOR = 9.0;

    public AfricanParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        super(type, numberOfCoconuts, voltage, isNailed);
    }

    static ParrotImpl createAfricanParrot(int numberOfCoconuts) {
        return new AfricanParrot(ParrotTypeEnum.AFRICAN, numberOfCoconuts, 0, false);
    }

    @Override
    public double getSpeed() {
        return Math.max(0, Parrot.BASE_SPEED - getLoadFactor() * numberOfCoconuts);
    }

    protected double getLoadFactor() {
        return LOAD_FACTOR;
    }
}