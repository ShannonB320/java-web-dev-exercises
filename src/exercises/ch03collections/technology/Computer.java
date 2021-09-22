package exercises.ch03collections.technology;

public class Computer {

    private int ram;
    private int storage;
    private boolean hasKeyboard;

    public Computer(int storage, int ram, boolean hasKeyboard) {
        this.ram = ram;
        this.storage = storage;
        this.hasKeyboard = hasKeyboard;
    }

    public int getRam() {return this.ram; }
    public int getStorage() {return this.storage; }
    public boolean getHasKeyboard() {return this.hasKeyboard; }

    public void increaseRAM (int n) {
        this.ram = this.ram + n;
    }

    public void increaseStorage (int x) {
        this.storage = this.storage + x;
    }

}
