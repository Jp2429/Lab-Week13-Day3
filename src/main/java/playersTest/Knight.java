package playersTest;

import equipment.Weapon;
import interfaces.IFightable;

public class Knight extends Warrior implements IFightable {

    private int health;
    private int defence;

    public Knight(Weapon weapon) {
        super(weapon);
        this.health = 20;
        this.defence = 4;
    }

    public int getDefence() {
        return defence;
    }

    public int getHealth() {
        return health;
    }

    public void reduceHealth(int damage) {
        health -= damage;
    }
}
