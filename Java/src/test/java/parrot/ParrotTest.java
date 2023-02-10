package parrot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParrotTest {

    @Test
    public void getSpeedOfEuropeanParrot() {
        Parrot parrot = new EuropeanParrot();
        assertEquals(12.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_One_Coconut() {
        Parrot parrot = createAfricanParrot(1);
        assertEquals(3.0, parrot.getSpeed(), 0.0);
    }

    private static ParrotImpl createAfricanParrot(int numberOfCoconuts) {
        return new ParrotImpl(ParrotTypeEnum.AFRICAN, numberOfCoconuts, 0, false);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_Two_Coconuts() {
        Parrot parrot = createAfricanParrot(2);
        assertEquals(0.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanParrot_With_No_Coconuts() {
        Parrot parrot = createAfricanParrot(0);
        assertEquals(12.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_nailed() {
        Parrot parrot = new ParrotImpl(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 1.5, true);
        assertEquals(0.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed() {
        Parrot parrot = new ParrotImpl(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 1.5, false);
        assertEquals(18.0, parrot.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBlueParrot_not_nailed_high_voltage() {
        Parrot parrot = new ParrotImpl(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 4, false);
        assertEquals(24.0, parrot.getSpeed(), 0.0);
    }
}
