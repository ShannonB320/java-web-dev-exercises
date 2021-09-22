package exercises.ch03collections.technology;

public class SmartPhone extends Computer{
    private boolean hasWifi;
    private boolean canMakeCalls;
    private int numberOfSelfies;

    public SmartPhone(int storage, int ram, boolean hasKeyboard, boolean hasWifi, boolean canMakeCalls, int numberOfSelfies) {
        super(storage, ram, hasKeyboard);
        this.hasWifi = hasWifi;
        this.canMakeCalls = canMakeCalls;
        this.numberOfSelfies = numberOfSelfies;
    }

    public boolean getHasWifi() { return this.hasWifi; }
    public boolean getCanMakeCalls() {return this.canMakeCalls; }
    public int getNumberOfSelfies() {return this.numberOfSelfies; }

    public void takeSelfie() {
        this.numberOfSelfies++;
    }

}
