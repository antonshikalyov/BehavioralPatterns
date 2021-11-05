package Visitor;

public class MiddleMaster implements Master{
    @Override
    public void create(FirstDetail firstDetail) {
        System.out.println("Good first detail");

    }

    @Override
    public void create(SecondDetail secondDetail) {
        System.out.println("Good second detail");
    }

    @Override
    public void create(ThirdDetail thirdDetail) {
        System.out.println("Good third detail");
    }
}
