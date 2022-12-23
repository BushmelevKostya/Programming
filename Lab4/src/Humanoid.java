public interface Humanoid {
    void walk(Town town, String time);
    void sleep();
    void read(Item item);
    Item write(String name, int amount);
    void search(Town town);
}