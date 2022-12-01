public class UnknownRogue extends HumanFromMoon{

    public UnknownRogue(String surName, String site) {
        this.surName = surName;
        if (site == "") {
            this.site = "Неизвестное место";
        } else {this.site = site;}
        System.out.println();
        System.out.printf("Новый объект UnknownRogue %s успешно создан!", this.surName);
    }

    public void write(){
        System.out.println();
        System.out.printf("Жулио пишет объект %s", Item.ЗАПИСКА);;
    }
}
