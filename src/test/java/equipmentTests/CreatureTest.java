package equipmentTests;

import equipment.Creature;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreatureTest {

    Creature creature;

    @Before
    public void before() {
        creature = new Creature(8, "dragon");
    }

    @Test
    public void hasDefence() {
        assertEquals(8, creature.getDefence());
    }

    @Test
    public void hasType() {
        assertEquals("dragon", creature.getType());
    }
}
