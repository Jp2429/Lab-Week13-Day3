package equipment;

public class Creature {

    private int defence;
    private String type;

    public Creature(int defence, String type) {
        this.defence = defence;
        this.type = type;
    }

    public int getDefence() {
        return defence;
    }

    public String getType() {
        return type;
    }
}
