public class Set<T> implements LimitedSet<T> {

    private int count;
    private T[] collection;
    private final static int size = 10;
    private int incr[]=new int[10];

    @SuppressWarnings("unchecked")
    public Set(){
        for (int i=0;i<size;i++){
            incr[i]=0;
        }
        collection = (T []) new Object [size];
        count = 0;
    }
    @Override
    public void add(final T t) {
        try {
            collection[count] = t;
            count++;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(">10");
            int indexOfMin = 0;
            for (int i = 0; i < incr.length; i++)
                if (incr[i] < incr[indexOfMin])
                    indexOfMin = i;

            remove(collection[indexOfMin]);
            collection[count] = t;
            count++;
        }


    }

    @Override
    public boolean remove(final T t) {
        boolean check=true;
        int j;
        for (int i=0;i<count;i++){
            if (!contains(t))
                check = false;
            else {
                for (j =0; j < size; j++)
                    if (collection[j] == t)
                        break;
                for (int k = j; k < size - 1; k++) //сдвиг последующих элементов
                    collection[k] = collection[k + 1];
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
                incr[i]++;
                return true;
            }
        }
        return false;
    }
    public T[] get(){
        for (int i=0;i<size;i++)
            System.out.print(incr[i]+" ");
        System.out.println();
        return collection;
    }
}
