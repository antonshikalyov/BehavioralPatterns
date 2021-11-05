package Visitor;

public class Factory implements Detail{
Detail[] details;

public Factory(){
    this.details = new Detail[]{
            new FirstDetail(),
            new SecondDetail(),
            new ThirdDetail()
    };
}

    @Override
    public void beComplated(Master master) {
        for (Detail d: details) {
           d.beComplated(master);
        }
    }
}
