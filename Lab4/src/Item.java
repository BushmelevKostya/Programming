import java.util.HashMap;

public class Item {
    private String name;
    private int amount;
    private int price;
    static HashMap<String, Integer> priceMap = new HashMap<>();

    public Item() {
    }

    public Item(String name, int amount) {
        this.name = name;
        this.amount = amount;
        try {
            this.price = priceMap.get(name);
        } catch (Exception e) {
            System.out.println("Такого предмета не существует!");
        }
    }


    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int spending) {
        this.amount = this.amount - spending;
    }

    static void addElement(String name, int price) {
        priceMap.put(name, price);
    }

    public int getPrice() {
        return price;
    }


    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null || object.getClass() != getClass()) {
            return false;
        }
        Item item = (Item) object;
        if (this.name != item.name) return false;
        if (this.amount != item.amount) return false;
        return (this.price != item.price);
    }

    @Override
    public String toString() {
        return this.name + " в наличии в количестве  " + this.amount;
    }

    @Override
    public int hashCode() {
        int result = 31;
        result = result * 17 + name.hashCode();
        result = result * 17 + amount;
        result = result * 17 + price;
        return result;
    }
}

