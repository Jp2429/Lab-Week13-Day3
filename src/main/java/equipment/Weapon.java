package equipment;

public class Weapon {

    private int damage;
    private String type;

    public Weapon(int damage, String type) {
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
