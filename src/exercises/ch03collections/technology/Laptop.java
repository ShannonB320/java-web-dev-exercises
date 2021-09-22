package exercises.ch03collections.technology;

public class Laptop extends Computer {
    private boolean hasWifi;
    private double weight;

    public Laptop(int storage, int ram, boolean hasKeyboard, boolean hasWifi, double weight) {
        super(storage, ram, hasKeyboard);
        this.hasWifi = hasWifi;
        this.weight = weight;
    }

    public boolean getHasWifi() {return this.hasWifi; }
    public double getWeight() {return this.weight; }


    public boolean isClunky() {
        if (weight > 5.0) {
            return true;
        } else {
            return false;
        }
    }


}
