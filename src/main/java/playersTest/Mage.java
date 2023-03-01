package playersTest;

import equipment.Creature;
import equipment.Spell;

public abstract class Mage {
    private Spell spell;
    private Creature creature;
    private int gold;

    public Mage(Spell spell, Creature creature) {
        this.spell = spell;
        this.creature = creature;
        this.gold = 0;
    }

    public Spell getSpell() {
        return spell;
    }

    public Creature getCreature() {
        return creature;
    }

    public int getGold() {
        return gold;
    }

    public int attack() {
        if (Math.random() > 0.2) {
            return getSpell().getDamage();
        } else {
            return 0;
        }
    }

    public int getDefence() {
        return getCreature().getDefence();
    }
}
