package playersTest;

import equipment.Creature;
import equipment.Spell;
import interfaces.IFightable;

public class Witch extends Mage implements IFightable {
    private int health;

    public Witch(Spell spell, Creature creature) {
        super(spell, creature);
        this.health = 8;
    }

    public int getHealth() {
        return health;
    }

    public void reduceHealth(int damage) {
        health -= damage;
    }
}
