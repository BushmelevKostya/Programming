public class LateForTrainException extends Exception{
    private MoonMen human;
    private Ticket ticket;
    public LateForTrainException(MoonMen human, Ticket ticket){
        this.human = human;
        this.ticket = ticket;
    }

    public MoonMen getHuman() {
        return human;
    }

    public Ticket getTicket() {
        return ticket;
    }
}
