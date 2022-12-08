public interface Humanoid {
    void walk(Town town, String time);
    void sleep();
    void read(String item);
    void write(String item);
    void search(Town town);
    void eat(Rucksack rucksack, Town town);
}