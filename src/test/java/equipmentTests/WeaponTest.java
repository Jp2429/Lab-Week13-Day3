package equipmentTests;

import equipment.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    Weapon weapon;

    @Before
    public void before() {
        weapon = new Weapon(9, "axe");
    }

    @Test
    public void hasDamage() {
        assertEquals(9, weapon.getDamage());
    }

    @Test
    public void hasType() {
        assertEquals("axe", weapon.getType());
    }
}
