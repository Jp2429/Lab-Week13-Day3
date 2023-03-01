package playersTest;

import equipment.Tool;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Tool tool;

    @Before
    public void before() {
        tool = new Tool(8, "Potion");
        cleric = new Cleric(tool);
    }

    @Test
    public void hasTool() {
        assertEquals(tool, cleric.getTool());
    }

    @Test
    public void hasGold() {
        assertEquals(0, cleric.getGold());
    }

    @Test
    public void hasHealth() {
        assertEquals(5, cleric.getHealth());
    }
}
