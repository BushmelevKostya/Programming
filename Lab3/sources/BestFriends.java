public class BestFriends extends HumanFromMoon{
    public BestFriends(String surName, String site){
        this.surName = surName;
        this.site = site;
        System.out.println();
        System.out.printf("Новый объект BestFriends %s успешно создан!", this.surName);
    }

    public void read(Item item){
        System.out.println();
        System.out.printf("%s читает предмет: %s", this.surName, item);
    }
    public void afraidToComeBack(Place place){
        System.out.println();
        System.out.printf("%s боиться вернуться в место: %s", this.surName, place.name);
    }
    public void dangleAround(Place place, String time){
        System.out.println();
        System.out.printf("%s болтается в месте: %s до времени: %s", this.surName, place.name, time);
    }
    public void search(Place place){
        System.out.println();
        System.out.printf("%s ищет место: %s", this.surName, place.name);
    }
    public void haveDinner(Rucksack rucksack, Place place) {
        if (rucksack.inventory.contains(Item.КАПИТАЛ)) {
            System.out.println();
            System.out.printf("%s как следует обедает в месте: %s", this.surName, place.name);
            rucksack.putAway(Item.КАПИТАЛ);
        } else {
            System.out.println();
            System.out.printf("%s не может обедать, у него нет капитала", this.surName);
        }
    }
    public void trade(Rucksack rucksack, Item item){
        if (rucksack.inventory.contains(Item.САНТИКИ)){
            System.out.println();
            System.out.printf("%s покупает предмет: %s", this.surName, item.name());
            rucksack.putAway(Item.САНТИКИ);
            rucksack.put(item);
        }
        else{
            System.out.println();
            System.out.printf("%s не может торговать, у него нет Сантиков", this.surName);
        }
    }
    @Override
    public int hashCode(){
        int result = 31;
        result = result * 9 + surName.hashCode();
        result = result * 9 + site.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object object) {
        if (object.getClass() != this.getClass()){return false;}
        return object.hashCode() == this.hashCode();
    }

    @Override
    public String toString(){
        return "Объект " + this.surName + " сейчас находится в месте: " + this.site;
    }
}
