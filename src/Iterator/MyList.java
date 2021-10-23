package Iterator;

public class MyList implements Agregate {

    String mylist[] = {"Collections", "Patterns GoF", "Maven"};

    @Override
    public Iterator getIterator() {
        return new MyIterator();
    }
}


