package CollectionEx;
import java.util.Iterator;

class MyCollection implements Iterable<String> {
    private String[] items = {"A", "B", "C"};

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < items.length;
            }

            @Override
            public String next() {
                return items[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Remove not supported");
            }
        };
    }
    public static void main(String[] args) {
        MyCollection myCollection = new MyCollection();
        Iterator<String> iterator = myCollection.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            //iterator.remove()
        }
    
    }
}


