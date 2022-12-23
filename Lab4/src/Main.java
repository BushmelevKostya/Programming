//238982.32
//Исключения - Место не существует
//Исключения - опоздал на поезд
//Локальный класс - кондуктор
//Вложенный класс - рюкзак
//Внутренный класс - вагон
//Анонимный класс - фокусник

public class Main {
    public static void main(String[] args) throws Exception{
        Item.setElement("Note", 1);
        Item.setPriceMap("Santik", 1);
        Item.setPriceMap("Ice-cream", 5);
        Item.setPriceMap("BottleOfWater", 5);
        Item.setPriceMap("Dinner", 90);

        var santics = new Item("Santik", 220);

        var davilon = new Town("Давилон");
        var san_Comaric = new Town("Сан-Комарик");
        var hotel = new Town("Гостиница");
        var cityPark = new Town("Городской парк");
        var canteen = new Town("Нестоловая");
        var station = new Town("Станция");
        var office = new Town("Контора");
        System.out.println();
        Thread.sleep(1000);

        var human1 = new MoonMen("Незнайка", davilon);
        var human2 = new MoonMen("Козлик", davilon);
        var human3 = new MoonMen("Жулио", davilon);
        System.out.println();

        var train = new Train(DepartureTime.EVENING, san_Comaric, davilon, 3);
        var ticket1 = new Ticket(1, train, human1);
        var ticket2 = new Ticket(1, train, human2);

        MoonMen.Rucksack rucksack = human1.new Rucksack();
        rucksack.put(santics);
        var note = human3.write("Note", 1);
        var cupboard = new Furniture(office);
        cupboard.putItem(note);
        cupboard.putItem(ticket1);
        cupboard.putItem(ticket2);

        human1.moveToPlace(office);
        human2.moveToPlace(office);

        rucksack.put(note);
        rucksack.put(ticket1);
        rucksack.put(ticket2);
        System.out.println();
        Thread.sleep(1000);


        class Conductor extends MoonMen{
            public void check(Ticket ticket){
                var carriage = ticket.getTrain().getCarriages().get(ticket2.getNumberCarriage());
                carriage.addPassanger(ticket.getHuman());
            }
        }

        var conductor = new Conductor();
        conductor.check(ticket1);
        conductor.check(ticket2);

        try{
            train.getCarriages().get(1).checkPassangers();
        }
        catch(LateForTrainException exception){
            exception.getHuman().sell(exception.getTicket(), rucksack);
        }

        var hat = new Item("Шляпа", 1);
        MoonMen magicMan = new MoonMen(){
            @Override
            public void put (Item item, String...items){
                for (int i = 0; i < items.length; i++) {
                    System.out.printf("Из объекта: %s появляenся предмет: %s!", item, items[i]);
                }
            }
        };
        magicMan.put(hat, "зубная щетка", "зубной порошок", "мыло", "полотенце", "носовой платок", "носки", "гвозди", "проволока");

        rucksack.getItem(note);
        human1.read(note);
        System.out.println();
        Thread.sleep(1000);

        train.rideOnSchedule(DepartureTime.DAY, san_Comaric);
        System.out.println();
        Thread.sleep(1000);

        human1.afraidToComeBack(hotel);
        human2.afraidToComeBack(hotel);
        System.out.println();
        Thread.sleep(1000);

        human1.moveToPlace(cityPark);
        human2.moveToPlace(cityPark);
        System.out.println();
        Thread.sleep(1000);

        human1.walk(cityPark, "обед");
        human2.walk(cityPark, "обед");
        System.out.println();
        Thread.sleep(1000);

        human1.moveOutOfPlace(cityPark);
        human2.moveOutOfPlace(cityPark);
        System.out.println();
        Thread.sleep(1000);

        human1.search(canteen);
        human2.search(canteen);
        System.out.println();
        Thread.sleep(1000);

        human1.moveToPlace(canteen);
        human2.moveToPlace(canteen);
        System.out.println();
        Thread.sleep(1000);

        var dinner = new Item("Dinner", 2);
        human1.buy(rucksack, dinner, santics);
        human1.eat(rucksack, dinner, canteen);
        human2.eat(rucksack, dinner, canteen);
        System.out.println();
        Thread.sleep(1000);

        var ice_cream = new Item("Ice-cream", 2);
        var bottleOfWater = new Item("BottleOfWater", 1);
        human1.buy(rucksack, ice_cream, santics);
        human1.buy(rucksack, bottleOfWater, santics);


    }
}
