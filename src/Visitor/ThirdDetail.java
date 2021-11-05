package Visitor;

public class ThirdDetail implements Detail{
    @Override
    public void beComplated(Master master) {
        master.create(this);
    }
}
