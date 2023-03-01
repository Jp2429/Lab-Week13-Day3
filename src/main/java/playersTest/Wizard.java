package playersTest;

import equipment.Creature;
import equipment.Spell;
import interfaces.IFightable;

public class Wizard extends Mage implements IFightable {

    private int health;

    public Wizard(Spell spell, Creature creature) {
        super(spell, creature);
        this.health = 6;
    }

    public int getHealth() {
        return health;
    }

    public void reduceHealth(int damage) {
        health -= damage;
    }
}
