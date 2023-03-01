package equipment;

public class Tool {

    private int heal;
    private String type;

    public Tool(int heal, String type) {
        this.heal = heal;
        this.type = type;
    }

    public int getHeal() {
        return heal;
    }

    public String getType() {
        return type;
    }
}
