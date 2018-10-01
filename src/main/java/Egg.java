public class Egg {
    boolean fried = false;

    public void fry(Egg egg) {
        fried = true;
    }

    public boolean isFried() {
        return fried;
    }
}
