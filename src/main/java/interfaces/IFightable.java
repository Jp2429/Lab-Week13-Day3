package interfaces;

public interface IFightable {

    int attack();
    int getDefence();
    int getHealth();
    void reduceHealth(int damage);
    int getGold();
    void addGold(int value);

}
