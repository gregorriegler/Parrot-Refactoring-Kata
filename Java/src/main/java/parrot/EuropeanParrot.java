package parrot;

public class EuropeanParrot {
    static Parrot createEuropean() {
        return new ParrotImpl(ParrotTypeEnum.EUROPEAN, 0, 0, false);
    }
}