package playersTest;

import equipment.Weapon;
import interfaces.IFightable;

public class Barbarian extends Warrior implements IFightable {
    private int health;

    public Barbarian(Weapon weapon) {
        super(weapon);
        this.health = 10;
    }

    public int getDefence() {
        return 0;
    }

    public int getHealth() {
        return health;
    }

    public void reduceHealth(int damage) {
        health -= damage;
    }
}
