package playersTest;

import equipment.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Weapon weapon;
    Dwarf dwarf;

    @Before
    public void before() {
        weapon = new Weapon(9, "axe");
        dwarf = new Dwarf(weapon);
    }

    @Test
    public void hasHealth() {
        assertEquals(15, dwarf.getHealth());
    }
}
