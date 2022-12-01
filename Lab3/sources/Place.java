public class Place extends Site{

    public Place(String name){
        this.name = name;
        System.out.println();
        System.out.printf("Новый объект Place %s успешно создан!", this.name);
    }
    public void MoveToPlace(BestFriends human){
        human.site = this.name;
        System.out.println();
        System.out.printf("%s приходит в место: %s", human.surName, this.name);
    }
    public void MoveOutOfPlace(BestFriends human){
        System.out.println();
        System.out.printf("%s покидает место: %s", human.surName, this.name);
    }
    public String getName(){
        return this.name;
    }

}