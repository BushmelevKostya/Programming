public class MoonMen implements Humanoid{
    protected String surName;
    protected String site;

    public MoonMen(String surName, String site){
        this.surName = surName;
        if (site == "") {
            this.site = "Неизвестное место";
        } else {this.site = site;}
        System.out.println();
        System.out.printf("Новый объект MoonMen %s успешно создан!", this.surName);
    }

    public void read(String item){
        System.out.println();
        System.out.printf("%s читает предмет: %s", this.surName, item);
    }
    public void write(String item){
        System.out.println();
        System.out.printf("%s пишет объект %s", this.surName, item);;
    }
    public void afraidToComeBack(Town town){
        System.out.println();
        System.out.printf("%s боиться вернуться в место: %s", this.surName, town.name);
    }
    public void walk(Town town, String time){
        System.out.println();
        System.out.printf("%s болтается в месте: %s до времени: %s", this.surName, town.name, time);
    }
    public void search(Town town){
        System.out.println();
        System.out.printf("%s ищет место: %s", this.surName, town.name);
    }
    public void eat(Rucksack rucksack, Town town) {
        if (rucksack.inventory.contains("КАПИТАЛ")) {
            System.out.println();
            System.out.printf("%s как следует обедает в месте: %s", this.surName, town.name);
            rucksack.putAway("КАПИТАЛ");
        } else {
            System.out.println();
            System.out.printf("%s не может обедать, у него нет капитала", this.surName);
        }
    }
    public void trade(Rucksack rucksack, String item){
        if (rucksack.inventory.contains("САНТИКИ")){
            System.out.println();
            System.out.printf("%s покупает предмет: %s", this.surName, item);
            rucksack.putAway("САНТИКИ");
            rucksack.put(item);
        }
        else{
            System.out.println();
            System.out.printf("%s не может торговать, у него нет Сантиков", this.surName);
        }
    }
    public void sleep(){
        System.out.println();
        System.out.printf("%s устал и спит", this.surName);
    }
    public String getSurName(){
        return surName;
    }

    public void setSurName(String surName){
        this.surName = surName;
    }

    public String getSite() {
        return site;
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
