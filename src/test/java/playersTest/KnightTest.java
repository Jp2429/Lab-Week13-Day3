package playersTest;

import equipment.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Weapon weapon;
    Knight knight;

    @Before
    public void before() {
        weapon = new Weapon(6, "sword");
        knight = new Knight(weapon);
    }

    @Test
    public void hasHealth() {
        assertEquals(20, knight.getHealth());
    }
}
