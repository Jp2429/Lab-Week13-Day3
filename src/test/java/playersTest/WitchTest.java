package playersTest;

import equipment.Creature;
import equipment.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WitchTest {

    Spell spell;
    Creature creature;
    Witch witch;

    @Before
    public void before() {
        spell = new Spell(10, "fire");
        creature = new Creature(8, "dragon");
        witch = new Witch(spell, creature);
    }

    @Test
    public void hasSpell() {
        assertEquals(spell, witch.getSpell());
    }

    @Test
    public void hasCreature() {
        assertEquals(creature, witch.getCreature());
    }

    @Test
    public void hasGold() {
        assertEquals(0, witch.getGold());
    }

    @Test
    public void hasHealth() {
        assertEquals(8, witch.getHealth());
    }
}
