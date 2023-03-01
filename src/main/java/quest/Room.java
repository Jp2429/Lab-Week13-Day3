package quest;

import interfaces.IFightable;

import java.util.ArrayList;

public class Room {

    private int gold;
    private ArrayList<Enemy> enemies;

    public Room() {
        this.enemies = new ArrayList<>();
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public void addEnemy(Enemy enemy) {
        enemies.add(enemy);
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

    public void fight(IFightable player) {
        // Whilst room not cleared:
        while (!isCleared()) {
            // Get first enemy in list to fight:
            Enemy enemyToFight = getEnemyToFight();
            // Player attacks:
            int damage = player.attack();
            enemyToFight.reduceHealth(damage);

            if (enemyToFight.getHealth() > 0) {
                
            }
            // Enemy attacks:

        }
    }



}
