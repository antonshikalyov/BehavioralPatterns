package Iterator;

public class MyIterator implements Iterator{
        MyList myList = new MyList();
        int id = 0;

        @Override
        public boolean hasNext() {
            if (id < myList.mylist.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return myList.mylist[id++];
    }
}
