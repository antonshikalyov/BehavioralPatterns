package Visitor;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        JuniorMaster juniorMaster = new JuniorMaster();
        MiddleMaster middleMaster = new MiddleMaster();

        System.out.println("Junior master working...");
        factory.beComplated(juniorMaster);
        System.out.println("\nMiddle master working...");
        factory.beComplated(middleMaster);

    }
}
