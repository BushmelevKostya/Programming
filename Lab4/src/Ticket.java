import java.util.ArrayList;

public class Ticket extends Item{
    private final int numberCarriage;
    private final Train train;
    private MoonMen human;

    public Ticket(int numberCarriage, Train train, MoonMen human){
        this.numberCarriage = numberCarriage;
        this.train = train;
        this.human = human;
    }

    public int getNumberCarriage() {
        return numberCarriage;
    }

    public Train getTrain() {
        return train;
    }

    public MoonMen getHuman() {
        return human;
    }
}
