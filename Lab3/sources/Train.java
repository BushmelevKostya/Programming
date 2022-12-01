public class Train implements Rideable{
    private String time;
    public Train(String time){
        this.time = time;
        System.out.println();
        System.out.printf("Новый объект Train успешно создан!");
    }
    public void RideOnSchedule(){
        System.out.println();
        System.out.printf("Поезд отправляется только когда придет время: %s", this.time);
    }
}
