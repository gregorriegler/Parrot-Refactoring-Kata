package parrot;

public class AfricanParrot extends ParrotImpl{

    public static final double LOAD_FACTOR = 9.0;
    private final int numberOfCoconuts;

    public AfricanParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        super(type, numberOfCoconuts, voltage, isNailed);
        this.numberOfCoconuts = numberOfCoconuts;
    }

    static ParrotImpl createAfricanParrot(int numberOfCoconuts) {
        return new AfricanParrot(ParrotTypeEnum.AFRICAN, numberOfCoconuts, 0, false);
    }

    @Override
    public double getSpeed() {
        return Math.max(0, Parrot.BASE_SPEED - LOAD_FACTOR * numberOfCoconuts);
    }

}