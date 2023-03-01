package quest;

import interfaces.IFightable;

public class Enemy implements IFightable {

    private String type;
    private int health;
    private int attack;
    private int gold;

    public Enemy(String type, int health, int attack, int gold) {
        this.type = type;
        this.health = health;
        this.attack = attack;
        this.gold = gold;
    }

    public String getType() {
        return type;
    }

    public int getHealth() {
        return health;
    }

    public void reduceHealth(int damage) {
        health -= damage;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return 0;
    }

    public int getGold() {
        return gold;
    }

    public void addGold(int value) {
        gold += value;
    }

    public int attack() {
        if (Math.random() > 0.6) {
            return attack;
        } else {
            return 0;
        }
    }
}
