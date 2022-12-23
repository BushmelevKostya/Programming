import java.util.ArrayList;

public class Furniture extends Item{
    private Site location;
    private ArrayList<Item> items;

    public Furniture(Town location){
        this.location = location;
        this.items = new ArrayList<Item>();
    }
    public void putItem(Item item){
        items.add(item);
    }
}
