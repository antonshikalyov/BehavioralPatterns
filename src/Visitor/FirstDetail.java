package Visitor;

public class FirstDetail implements  Detail{
    @Override
    public void beComplated(Master master) {
      master.create(this);
    }
}
