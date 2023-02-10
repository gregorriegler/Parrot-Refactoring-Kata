package parrot;

public class AfricanParrot extends ParrotImpl{
    public AfricanParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        super(type, numberOfCoconuts, voltage, isNailed);
    }

    static ParrotImpl createAfricanParrot(int numberOfCoconuts) {
        return new ParrotImpl(ParrotTypeEnum.AFRICAN, numberOfCoconuts, 0, false);
    }
}