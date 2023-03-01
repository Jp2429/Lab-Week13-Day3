package playersTest;


import equipment.Tool;

public class Cleric {

    private Tool tool;
    private int gold;
    private int health;

    public Cleric(Tool tool) {
        this.tool = tool;
        this.gold = 0;
        this.health = 5;
    }

    public Tool getTool() {
        return tool;
    }

    public int getGold() {
        return gold;
    }

    public int getHealth() {
        return health;
    }
}
