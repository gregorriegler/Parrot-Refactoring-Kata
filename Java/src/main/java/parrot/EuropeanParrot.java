package parrot;

public class EuropeanParrot {
    static Parrot createEuropean() {
        return new Parrot(ParrotTypeEnum.EUROPEAN, 0, 0, false);
    }
}