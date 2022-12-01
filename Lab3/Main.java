import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        ArrayList list = new ArrayList();
        var rucksack1 = new Rucksack(list);
        var rucksack2 = new Rucksack(list);
        rucksack1.put(Item.КАПИТАЛ);
        rucksack2.put(Item.КАПИТАЛ);
        System.out.println();
        Thread.sleep(2000);

        var hotel = new Place("Гостиница");
        var cityPark = new Place("Городской парк");
        var canteen = new Place("Нестоловая");
        System.out.println();
        Thread.sleep(2000);

        var rogue = new UnknownRogue("Жулио", "");
        var human1 = new BestFriends("Незнайка", "Неизвестный город");
        var human2 = new BestFriends("Козлик", "Неизвестный город");
        System.out.println();
        Thread.sleep(2000);

        var train = new Train("вечер");
        System.out.println();
        Thread.sleep(2000);

        rogue.write();
        rucksack1.put(Item.ЗАПИСКА);
        System.out.println();
        Thread.sleep(2000);

        rucksack1.getItem(human1.getSurName(), Item.ЗАПИСКА);
        human1.read(Item.ЗАПИСКА);
        System.out.println();
        Thread.sleep(2000);

        train.RideOnSchedule();
        System.out.println();
        Thread.sleep(2000);

        human1.afraidToComeBack(hotel);
        human2.afraidToComeBack(hotel);
        System.out.println();
        Thread.sleep(2000);

        cityPark.MoveToPlace(human1);
        cityPark.MoveToPlace(human2);
        System.out.println();
        Thread.sleep(2000);

        human1.dangleAround(cityPark, "обед");
        human2.dangleAround(cityPark, "обед");
        System.out.println();
        Thread.sleep(2000);

        cityPark.MoveOutOfPlace(human1);
        cityPark.MoveOutOfPlace(human2);
        System.out.println();
        Thread.sleep(2000);

        human1.search(canteen);
        human2.search(canteen);
        System.out.println();
        Thread.sleep(2000);

        canteen.MoveToPlace(human1);
        canteen.MoveToPlace(human2);
        System.out.println();
        Thread.sleep(2000);

        human1.haveDinner(rucksack1, canteen);
        rucksack1.put(Item.САНТИКИ);
        human2.haveDinner(rucksack2, canteen);
        rucksack2.put(Item.САНТИКИ);
        System.out.println();
        Thread.sleep(2000);

        human1.trade(rucksack1, Item.МОРОЖЕНОЕ);
        human2.trade(rucksack2, Item.БУТЫЛКАВОДЫССИРОПОМ);
    }
}