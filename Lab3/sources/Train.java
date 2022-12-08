public class Train implements Rideable{
    private DepartureTime departureTime;
    private String direction;
    private Site currentLocation;

    public Train(DepartureTime departureTime, Site currentLocation){
        this.departureTime = departureTime;
        this.direction = "вперед";
        this.currentLocation = currentLocation;
        System.out.println();
        System.out.printf("Новый объект Train успешно создан!");
    }

    public void ride(Site site){
        System.out.println();
        System.out.printf("Поезд отправляется из места: %s в место: %s", currentLocation, site);
        this.currentLocation = site;
    }

    public void isRideOnSchedule(DepartureTime time){
        if (time == departureTime){
            System.out.println();
            System.out.printf("Поезд отправляется прямо сейчас");
        }
        System.out.println();
        System.out.printf("Поезд отправляется только когда придет время: %s", this.departureTime);
    }
    public void blow(){
        System.out.println();
        System.out.printf("Ту-Ту!");
    }
    public void changeDirection(){
        if(direction == "вперед"){
            this.direction = "назад";
        }
        else {
            this.direction = "вперед";
        }
    }
    public void setDepartureTime(DepartureTime time){
        this.departureTime = time;
    }
    public DepartureTime getDepartureTime(){
        return departureTime;
    }
    public void setDirection(DepartureTime time){
        this.departureTime = time;
    }
    public DepartureTime getDirection(){
        return departureTime;
    }
}
