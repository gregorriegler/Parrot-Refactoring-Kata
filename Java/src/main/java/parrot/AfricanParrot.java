package parrot;

public class AfricanParrot implements Parrot{

    private static final double LOAD_FACTOR = 9.0;
    private final int numberOfCoconuts;

    public AfricanParrot(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }

    static AfricanParrot createAfricanParrot(int numberOfCoconuts) {
        return new AfricanParrot(numberOfCoconuts);
    }

    @Override
    public double getSpeed() {
        return Math.max(0, Parrot.BASE_SPEED - LOAD_FACTOR * numberOfCoconuts);
    }

}