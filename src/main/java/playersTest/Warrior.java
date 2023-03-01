package playersTest;

import equipment.Weapon;
import interfaces.IFightable;

public abstract class Warrior {

    private Weapon weapon;
    private int gold;

    public Warrior(Weapon weapon) {
        this.weapon = weapon;
        this.gold = 0;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getGold() {
        return gold;
    }

    public int attack() {
        if (Math.random() > 0.3) {
            return weapon.getDamage();
        } else {
            return 0;
        }
    }
}
