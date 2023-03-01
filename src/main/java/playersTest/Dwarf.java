package playersTest;

import equipment.Weapon;
import interfaces.IFightable;

public class Dwarf extends Warrior implements IFightable {

    private int health;
    private int defence;

    public Dwarf(Weapon weapon) {
        super(weapon);
        this.health = 15;
        this.defence = 2;
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
