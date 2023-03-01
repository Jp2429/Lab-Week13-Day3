package equipmentTests;

import equipment.Tool;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ToolsTest {

    Tool tool;

    @Before
    public void before() {
        tool = new Tool(8, "potion");
    }

    @Test
    public void hasHeal() {
        assertEquals(8, tool.getHeal());
    }

    @Test
    public void hasType() {
        assertEquals("potion", tool.getType());
    }
}
