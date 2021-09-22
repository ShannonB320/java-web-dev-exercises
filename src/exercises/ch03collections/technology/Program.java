package exercises.ch03collections.technology;

public class Program {

    public static void main(String[] args) {

        Computer compy = new Computer(15, 700, true);
        Laptop lappy1 = new Laptop(35, 500, true, true, 7.0);
        Laptop lappy2 = new Laptop(40, 500, true, true, 4.8);
        SmartPhone celly = new SmartPhone(50, 300, false, true, true, 5280);

        System.out.println("Storage: " + compy.getStorage() + "\nRAM: " + compy.getRam());
        compy.increaseStorage(15);
        compy.increaseRAM(50);
        System.out.println("Storage: " + compy.getStorage() + "\nRAM: " + compy.getRam());

        System.out.println(lappy1.isClunky());
        System.out.println(lappy2.isClunky());

        System.out.println(celly.getNumberOfSelfies());
            celly.takeSelfie();
            celly.takeSelfie();
            celly.takeSelfie();
            celly.takeSelfie();
            celly.takeSelfie();
            celly.takeSelfie();
            celly.takeSelfie();
            celly.takeSelfie();
            celly.takeSelfie();
            celly.takeSelfie();
        System.out.println(celly.getNumberOfSelfies());
    }

}
