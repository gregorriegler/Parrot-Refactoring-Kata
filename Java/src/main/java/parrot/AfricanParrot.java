package parrot;

public class AfricanParrot implements Parrot {
    static ParrotImpl createAfricanParrot(int numberOfCoconuts) {
        return new ParrotImpl(ParrotTypeEnum.AFRICAN, numberOfCoconuts, 0, false);
    }

    @Override
    public double getSpeed() {
        return 0;
    }
}