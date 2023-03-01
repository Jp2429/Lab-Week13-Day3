package playersTest;

import equipment.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Weapon weapon;
    Barbarian barbarian;

    @Before
    public void before() {
        weapon = new Weapon(3, "Club");
        barbarian = new Barbarian(weapon);
    }

    @Test
    public void hasGold() {
        assertEquals(0, barbarian.getGold());
    }

    @Test
    public void hasWeapon() {
        assertEquals(weapon, barbarian.getWeapon());
    }

    @Test
    public void hasHealth() {
        assertEquals(10, barbarian.getHealth());
    }

//    Test not good because function requires random element:
//    @Test
//    public void canAttack() {
//        assertEquals(3, barbarian.attack());
//    }
}
