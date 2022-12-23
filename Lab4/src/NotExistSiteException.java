public class NotExistSiteException extends RuntimeException{
    private Town town;

    public NotExistSiteException(String message, Town town) {
        super(message);
        this.town = town;
    }
}