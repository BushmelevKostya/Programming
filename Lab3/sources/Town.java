public class Town extends Site{

    public Town(String name){
        this.name = name;
        System.out.println();
        System.out.printf("Новый объект Place %s успешно создан!", this.name);
    }
    public void moveToPlace(MoonMen human){
        human.site = this.name;
        System.out.println();
        System.out.printf("%s приходит в место: %s", human.surName, this.name);
    }
    public void moveOutOfPlace(MoonMen human){
        System.out.println();
        System.out.printf("%s покидает место: %s", human.surName, this.name);
    }
    public String getName(){
        return this.name;
    }

}
