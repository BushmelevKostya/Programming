public interface Rideable {
    void isRideOnSchedule(DepartureTime time);
    void ride(Site site);
    void blow();
    void changeDirection();
}
