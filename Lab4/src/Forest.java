import java.util.ArrayList;

public class Forest extends Site{
    static ArrayList<String> places;
    public Forest(String name) {
        this.name = name;
        places.add(name);
        System.out.println();
        System.out.printf("Новый объект Place %s успешно создан!", this.name);
    }
    public ForestFood searchFood(ForestFood food){
        if (Math.random() < 0.1){
            return food;
        }
        return new ForestFood("трава", false);
    }
    public String getName(){
        return this.name;
    }

    public static class ForestFood{
        private final String name;
        private boolean isEdibility;
        static ArrayList<String> food;

        public ForestFood(String name, boolean isEdibility){
            this.name = name;
            this.isEdibility = isEdibility;
            food.add(name);
        }

        public String getName() {
            return name;
        }

        public void setEdibility(boolean isEdibility) {
            this.isEdibility = isEdibility;
        }

        public void cook(){
            setEdibility(true);
        }
    }
}
