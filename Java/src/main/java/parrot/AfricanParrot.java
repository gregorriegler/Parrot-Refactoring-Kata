package parrot;

public class AfricanParrot {
    static ParrotImpl createAfricanParrot(int numberOfCoconuts) {
        return new ParrotImpl(ParrotTypeEnum.AFRICAN, numberOfCoconuts, 0, false);
    }
}