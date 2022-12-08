public abstract class Site {
    String name;

    abstract void moveToPlace(MoonMen human);
    abstract void moveOutOfPlace(MoonMen human);
    abstract String getName();
}
