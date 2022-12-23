import java.util.ArrayList;
import java.util.function.Consumer;

public class MoonMen implements Humanoid {
    private String surname;
    private Site site;

    public MoonMen(String surName, Site site) {
        this.surname = surName;
        this.site = site;
        System.out.println();
        System.out.printf("Новый объект MoonMen %s успешно создан!", this.surname);
    }

    public MoonMen(){}

    public void read(Item item) {
        System.out.println();
        System.out.printf("%s читает предмет: %s", this.surname, item.getName());
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public Item write(String name, int amount) {
        System.out.println();
        System.out.printf("%s пишет объект %s", this.surname, name);
        return new Item(name, amount);
    }

    public void buy(Rucksack rucksack, Item item, Item santics) {
        int price = item.getPrice() * item.getAmount();
        if (santics.getAmount() >= price) {
            rucksack.put(item);
            santics.setAmount(price);
        } else {
            System.out.println("Недостаточно средств");
        }
    }

    public void sell(Item item, Rucksack rucksack){
        rucksack.putAway(item);
        rucksack.put(new Item("Сантики", item.getPrice()));
    }

    public void afraidToComeBack(Town town) {
        System.out.println();
        System.out.printf("%s боиться вернуться в место: %s", this.surname, town.name);
    }

    public void walk(Town town, String time) {
        System.out.println();
        System.out.printf("%s болтается в месте: %s до времени: %s", this.surname, town.name, time);
    }

    public void search(Town town) {
        System.out.println();
        System.out.printf("%s ищет место: %s", this.surname, town.name);
    }

    public void eat(Rucksack rucksack, Item item, Town town) {
        if (rucksack.getItem(item)) {
            System.out.println();
            System.out.printf("%s съедает %s в месте: %s", this.surname, item.getName(), town.name);
            int count = item.getAmount();
            if (count > 1) {
                item.setAmount(count - 1);
            } else {
                rucksack.putAway(item);
            }
        } else {
            System.out.println();
            System.out.printf("%s не может кушать, у него нет %s", this.surname, item.getName());
        }
    }

    public void sleep() {
        System.out.println();
        System.out.printf("%s устал и спит", this.surname);
    }

    public void moveOutOfPlace(Town town) {
        System.out.println();
        System.out.printf("%s покидает место: %s", this.surname, site.name);
    }

    public void moveToPlace(Town town){
        if(!Town.places.contains(town.getName())){
            throw new NotExistSiteException("Такого места не существует!", town);
        }
        else{
            this.site = town;
        }
        System.out.println();
        System.out.printf("%s приходит в место: %s", this.surname, site.name);
    }

    public String getSurName() {
        return surname;
    }

    public void setSurName(String surName) {
        this.surname = surName;
    }

    public Site getSite() {
        return site;
    }

    public void put(Item item, String... items){
        System.out.println("Из предметов ничего не вытащить");
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null || object.getClass() != getClass()) {
            return false;
        }
        MoonMen human = (MoonMen) object;
        if (this.surname != human.surname) return false;
        return (this.site != human.site);
    }

    @Override
    public String toString() {
        return "Объект " + this.surname + " сейчас находится в месте: " + this.site;
    }

    @Override
    public int hashCode() {
        int result = 31;
        result = result * 17 + surname.hashCode();
        result = result * 17 + site.hashCode();
        return result;
    }



    public class Rucksack {
        private final ArrayList<Item> inventory;


        public Rucksack() {
            this.inventory = new ArrayList<>();
            System.out.println();
            System.out.println("Новый объект Rucksack успешно создан!");
        }

        public void put(Item item) {
            this.inventory.add(item);
            System.out.println();
            System.out.printf("В рюкзак добавлен предмет: %s, в количестве: %d", item.getName(), item.getAmount());
        }

        public void putAway(Item item) {
            if (this.inventory.contains(item)) {
                this.inventory.remove(item);
                System.out.println();
                System.out.printf("Из рюкзака убран предмет: %s", item.getName());
            } else {
                System.out.println();
                System.out.printf("Предмета %s нет в рюкзаке", item.getName()
                );
            }
        }

        public ArrayList<Item> getInventory() {
            System.out.println();
            this.inventory.forEach(new Consumer<Item>() {
                @Override
                public void accept(Item item) {
                    System.out.print(item.getName() + " " + item.getAmount() + " ");
                }
            });
            System.out.println();
            return inventory;
        }

        public boolean getItem(Item item) {
            if (this.inventory.contains(item)) {
                System.out.println();
                System.out.printf("Из рюкзака вытащен предмет: %s", item.getName());
                return true;
            } else {
                return false;
            }
        }

        @Override
        public boolean equals(Object object) {
            if (object == this) {
                return true;
            }
            if (object == null || object.getClass() != getClass()) {
                return false;
            }
            Rucksack rucksack = (Rucksack) object;
            return (this.inventory != rucksack.inventory);
        }

        @Override
        public String toString() {
            return "Сейчас в рюкзаке лежит " + getInventory();
        }

        @Override
        public int hashCode() {
            int result = 31;
            result = result * 17 + inventory.hashCode();
            return result;
        }
    }


}
