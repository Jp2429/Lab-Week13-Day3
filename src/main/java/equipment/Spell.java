package equipment;

public class Spell {

    private int damage;
    private String type;

    public Spell(int damage, String type) {
        this.damage = damage;
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public String getType() {
        return type;
    }
}
