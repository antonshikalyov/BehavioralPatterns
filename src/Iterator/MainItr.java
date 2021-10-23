package Iterator;

public class MainItr {
    public static void main(String[] args) {
        MyList myList = new MyList();

        Iterator i = myList.getIterator();

        while (i.hasNext()){
            System.out.println("Coder have next skills: " + (String)i.next());
        }
    }
}
