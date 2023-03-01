package quest;

import interfaces.IFightable;

import java.util.ArrayList;

public class Room {

    private ArrayList<Enemy> enemies;

    public Room() {
        this.enemies = new ArrayList<>();
    }

    public void addEnemy(Enemy enemy) {
        enemies.add(enemy);
    }

    public void removeEnemy(Enemy enemy) {
        enemies.remove(enemy);
    }

    public int getEnemyCount() {
        return enemies.size();
    }

    public Enemy getEnemyToFight() {
        return enemies.get(0);
    }

    public Boolean isCleared() {
        if (enemies.size() == 0) {
            return true;
        }
        return false;
    }

    public String fight(IFightable player) {
        String fightOutcome;

        // Whilst room not cleared:
        while (!isCleared()) {
            // Get first enemy in list to fight:
            Enemy enemyToFight = getEnemyToFight();

            // Player attacks:
            if (player.getHealth() > 0) {
                int damageToEnemy = player.attack();
                enemyToFight.reduceHealth(damageToEnemy);
            } else {
                enemyToFight.addGold(player.getGold());
                fightOutcome = "YOU DIED!!";
                return fightOutcome;
            }

            // Enemy attacks:
            if (enemyToFight.getHealth() > 0) {
                int damageToPlayer;
                int damage = enemyToFight.attack();
                int playerDefence = player.getDefence();
                if (playerDefence >= damage) {
                    damageToPlayer = 0;
                } else {
                    damageToPlayer = damage - playerDefence;
                }
                player.reduceHealth(damageToPlayer);
            } else {
                player.addGold(enemyToFight.getGold());
                removeEnemy(enemyToFight);
            }
        }

        fightOutcome = "Well done, you cleared the dungeon!!";
        return fightOutcome;
    }
    
}
