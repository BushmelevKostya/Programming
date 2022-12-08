import java.util.ArrayList;

public class Rucksack {
    static ArrayList inventory;
    static ArrayList availableItems;

    public Rucksack(ArrayList inventory, ArrayList availableItems){
        this.inventory = inventory;
        this.availableItems = availableItems;
        System.out.println();
        System.out.printf("Новый объект Rucksack успешно создан!");
    }
    public void setAvailableItems(String item){
        availableItems.add(item);
        System.out.println();
        System.out.printf("Новый объект %s успешно проинициализирован", item);
    }
    public void put(String item) {
        if (availableItems.contains(item)){
            this.inventory.add(item);
            System.out.println();
            System.out.printf("В рюкзак добавлен предмет: %s", item);
        }
        else {
            System.out.println();
            System.out.printf("Предмета %s не существует, сначала инициализирйте этот предмет", item);
        }
    }

    public void putAway(String item){
        if (this.inventory.contains(item)){
            this.inventory.remove(item);
            System.out.println();
            System.out.printf("Из рюкзака убран предмет: %s", item);
        }
        else {
            System.out.println();
            System.out.printf("Предмета %s нет в рюкзаке", item);
        }
    }

    public ArrayList getInventory() {
        System.out.println(inventory);
        return inventory;
    }
    public void getItem(String nameOfHuman, String item){
        if (this.inventory.contains(item)) {
            System.out.println();
            System.out.printf("%s вытаскивает предмет: %s", nameOfHuman, item);
        }
        else {
            System.out.println();
            System.out.printf("Предмета %s нет в рюкзаке", item);
        }
    }
}
