package playersTest;

import equipment.Creature;
import equipment.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Spell spell;
    Creature creature;
    Wizard wizard;

    @Before
    public void before() {
        spell = new Spell(12, "lightening");
        creature = new Creature(10, "giant eagle");
        wizard = new Wizard(spell, creature);
    }

    @Test
    public void hasHealth() {
        assertEquals(6, wizard.getHealth());
    }
}
