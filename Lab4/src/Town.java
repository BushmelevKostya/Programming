import java.util.ArrayList;

public class Town extends Site {
    private ArrayList<Furniture> furniture;
    static ArrayList<String> places = new ArrayList<>();

    public Town(String name) {
        this.name = name;
        this.furniture = new ArrayList<Furniture>();
        places.add(name);
        System.out.println();
        System.out.printf("Новый объект Place %s успешно создан!", this.name);
    }

    public void addFurniture(Furniture furniture){
        this.furniture.add(furniture);
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null || object.getClass() != getClass()) {
            return false;
        }
        Town town = (Town) object;
        return (this.name != town.name);
    }

    @Override
    public String toString() {
        return "В городе есть " + this.name;
    }

    @Override
    public int hashCode() {
        int result = 31;
        result = result * 17 + name.hashCode();
        return result;
    }
}

