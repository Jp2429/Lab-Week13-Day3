package questTests;

import equipment.Weapon;
import org.junit.Before;
import org.junit.Test;
import playersTest.Knight;
import quest.Enemy;
import quest.Room;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room roomPlayerWins, roomPlayerDies;
    Knight knightGood, knightBad;
    Weapon sword, mace;
    Enemy enemyGood, enemyBad;

    @Before
    public void before() {
        // Classes for scenario where player will win:
        sword = new Weapon(10, "sword");
        knightGood = new Knight(sword);
        enemyBad = new Enemy("Troll", 2, 1, 50);
        roomPlayerWins = new Room();
        roomPlayerWins.addEnemy(enemyBad);

        // Classes for scenario where player will lose:
        mace = new Weapon(1, "mace");
        knightBad = new Knight(mace);
        enemyGood = new Enemy("Ogre", 100, 10, 50);
        roomPlayerDies = new Room();
        roomPlayerDies.addEnemy(enemyGood);
    }

    @Test
    public void canAddEnemy() {
        roomPlayerDies.addEnemy(enemyGood);
        assertEquals(2, roomPlayerDies.getEnemyCount());
    }

    @Test
    public void canCheckRoomCleared() {
        assertEquals(false, roomPlayerWins.isCleared());
    }

    @Test
    public void canGetEnemyToFight() {
        assertEquals(enemyGood, roomPlayerDies.getEnemyToFight());
    }

    @Test
    public void canGetNewEnemyToFight() {
        roomPlayerWins.addEnemy(enemyGood);
        roomPlayerWins.removeEnemy(enemyBad);
        assertEquals(enemyGood, roomPlayerWins.getEnemyToFight());
    }

    @Test
    public void canFight_playerWins() {
        String fightOutcome = roomPlayerWins.fight(knightGood);
        assertEquals("Well done, you cleared the dungeon!!", fightOutcome);
        assertEquals(0, roomPlayerWins.getEnemyCount());
        assertEquals(50, knightGood.getGold());
        assertEquals(20, knightGood.getHealth());
    }

    @Test
    public void canFight_playerDies() {
        String fightOutcome = roomPlayerDies.fight(knightBad);
        assertEquals("YOU DIED!!", fightOutcome);
        assertEquals(1, roomPlayerDies.getEnemyCount());
//        assertEquals(95, enemyGood.getHealth()); // Won't work due to random element
    }

    @Test
    public void canFight_multipleEnemies() {
        roomPlayerWins.addEnemy(enemyBad);
        String fightOutcome = roomPlayerWins.fight(knightGood);
        assertEquals("Well done, you cleared the dungeon!!", fightOutcome);
        assertEquals(0, roomPlayerWins.getEnemyCount());
        assertEquals(100, knightGood.getGold());
        assertEquals(20, knightGood.getHealth());
    }
}
