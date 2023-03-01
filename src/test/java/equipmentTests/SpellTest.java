package equipmentTests;

import equipment.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellTest {

    Spell spell;

    @Before
    public void before() {
        spell = new Spell(10, "fire");
    }

    @Test
    public void hasDamage() {
        assertEquals(10, spell.getDamage());
    }

    @Test
    public void hasType() {
        assertEquals("fire", spell.getType());
    }
}
