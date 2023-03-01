package questTests;

import org.junit.Before;
import org.junit.Test;
import quest.Enemy;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Enemy enemy;

    @Before
    public void before() {
        enemy = new Enemy("troll", 20, 4, 50);
    }

    @Test
    public void hasType() {
        assertEquals("troll", enemy.getType());
    }

    @Test
    public void hasHealth() {
        assertEquals(20, enemy.getHealth());
    }

    @Test
    public void hasAttack() {
        assertEquals(4, enemy.getAttack());
    }

    @Test
    public void hasGold() {
        assertEquals(50, enemy.getGold());
    }
}
