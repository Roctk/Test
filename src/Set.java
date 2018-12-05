import java.util.*;

public class Set<T> implements LimitedSet<T> {

    private int count;
    private T[] collection;
    private final static int size = 10;

    @SuppressWarnings("unchecked")
    public Set(){
        collection = (T []) new Object [size];
        count = 0;
    }
    @Override
    public void add(final T t) {
        collection[count] = t;
        count++;
        System.out.println(t);

    }

    @Override
    public boolean remove(final T t) {
        boolean check=true;
        for (int i=0;i<count;i++){
            if (!contains(t))
                check = false;
            else {
                collection[i] = null;
                count--;
                check = true;
            }
        }
        return check;
    }

    @Override
    public boolean contains(final T t) {
        for (int i = 0; i < count; i++)
        {
            if (collection[i].equals(t))
            {
                System.out.println(true);
                return true;
            }
        }

        System.out.println(false);
        return false;
    }
    public T[] get(){
        return collection;
    }
}
