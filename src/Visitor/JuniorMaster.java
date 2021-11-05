package Visitor;

public class JuniorMaster implements Master{
    @Override
    public void create(FirstDetail firstDetail) {
        System.out.println("Bad first detail");
    }

    @Override
    public void create(SecondDetail secondDetail) {
        System.out.println("Bad second detail");

    }

    @Override
    public void create(ThirdDetail thirdDetail) {
        System.out.println("Bad third detail");
    }
}
