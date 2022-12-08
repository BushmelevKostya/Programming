import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        list2.add("ЗАПИСКА");
        list2.add("КАПИТАЛ");
        list2.add("САНТИКИ");
        list2.add("МОРОЖЕНОЕ");
        list2.add("БУТЫЛКАВОДЫССИРОПОМ");
        var rucksack1 = new Rucksack(list1, list2);
        var rucksack2 = new Rucksack(list1, list2);
        rucksack1.put("КАПИТАЛ");
        rucksack2.put("КАПИТАЛ");
        System.out.println();
        Thread.sleep(2000);

        var hotel = new Town("Гостиница");
        var cityPark = new Town("Городской парк");
        var canteen = new Town("Нестоловая");
        var station = new Town("Станция");

        System.out.println();
        Thread.sleep(2000);

        var human1 = new MoonMen("Незнайка", "Неизвестный город");
        var human2 = new MoonMen("Козлик", "Неизвестный город");
        var human3 = new MoonMen("Жулио", "");
        System.out.println();
        Thread.sleep(2000);

        var train = new Train(DepartureTime.EVENING, station);
        System.out.println();
        Thread.sleep(2000);

        human3.write("ЗАПИСКА");
        rucksack1.put("ЗАПИСКА");
        System.out.println();
        Thread.sleep(2000);

        rucksack1.getItem(human1.getSurName(), "ЗАПИСКА");
        human1.read("ЗАПИСКА");
        System.out.println();
        Thread.sleep(2000);

        train.isRideOnSchedule(DepartureTime.DAY);
        System.out.println();
        Thread.sleep(2000);

        human1.afraidToComeBack(hotel);
        human2.afraidToComeBack(hotel);
        System.out.println();
        Thread.sleep(2000);

        cityPark.moveToPlace(human1);
        cityPark.moveToPlace(human2);
        System.out.println();
        Thread.sleep(2000);

        human1.walk(cityPark, "обед");
        human2.walk(cityPark, "обед");
        System.out.println();
        Thread.sleep(2000);

        cityPark.moveOutOfPlace(human1);
        cityPark.moveOutOfPlace(human2);
        System.out.println();
        Thread.sleep(2000);

        human1.search(canteen);
        human2.search(canteen);
        System.out.println();
        Thread.sleep(2000);

        canteen.moveToPlace(human1);
        canteen.moveToPlace(human2);
        System.out.println();
        Thread.sleep(2000);

        human1.eat(rucksack1, canteen);
        rucksack1.put("САНТИКИ");
        human2.eat(rucksack2, canteen);
        rucksack2.put("САНТИКИ");
        System.out.println();
        Thread.sleep(2000);

        human1.trade(rucksack1, "МОРОЖЕНОЕ");
        human2.trade(rucksack2, "БУТЫЛКАВОДЫССИРОПОМ");
    }
}