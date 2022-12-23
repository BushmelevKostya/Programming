public interface Rideable {
    void rideOnSchedule(DepartureTime time, Site site);
    void ride();
    void changeDirection(Site direction1, Site direction2);
}
