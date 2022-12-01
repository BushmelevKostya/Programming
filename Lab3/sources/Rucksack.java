import java.util.ArrayList;

public class Rucksack {
    static ArrayList inventory;

    public Rucksack(ArrayList inventory){
        this.inventory = inventory;
        System.out.println();
        System.out.printf("Новый объект Rucksack успешно создан!");
    }
    public void put(Item item) {
        this.inventory.add(item);
        System.out.println();
        System.out.printf("В рюкзак добавлен предмет: %s", item);
    }

    public void putAway(Item item){
        if (this.inventory.contains(item)){
            this.inventory.remove(item);
            System.out.println();
            System.out.printf("Из рюкзака убран предмет: %s", item);
        }
    }

    public ArrayList getInventory() {
        System.out.println(inventory);
        return inventory;
    }
    public void getItem(String nameOfHuman, Item item){
        System.out.println();
        System.out.printf("%s вытаскивает предмет: %s", nameOfHuman, item);
    }
}
