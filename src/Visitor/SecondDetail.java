package Visitor;

public class SecondDetail implements Detail{
    @Override
    public void beComplated(Master master) {
        master.create(this);
    }
}
