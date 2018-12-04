import java.util.*;

public class Set<T> implements LimitedSet<T> {

    private int count;
    private T[] collection;
    private Map map = new HashMap<T, T>();

    @SuppressWarnings("unchecked")
    public Set(int size){
        collection = (T []) new Object [size];
        count = 0;
    }
    @Override
    public void add(final T t) {
        if(count>=10){
            for (T string : lst) {
                if(map.keySet().contains(string)) {
                    map.put(string,Integer.parseInt(map.get(string).toString())+1);
                } else {
                    map.put(string, 1);
                }
            }
            Iterator<Integer> iter = map.values().iterator();
            int temp = count;
            while (iter.hasNext()) {
                int max = iter.next();
                if (max < temp) {
                    temp = max;
                }
            }
            remove((T) map.get(temp));
            System.out.println(temp);
            System.out.println(map);
        }
        if (count==9){
            collection[count] = t;
            count++;
            contains(t);
        }
        else{
            collection[count] = t;
            count++;
            contains(t);
            contains(t);
        }

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

    List<T> lst = new ArrayList<T>();
    @Override
    public boolean contains(final T t) {
        lst.add(t);
        for (int i = 0; i < count; i++)
        {
            if (collection[i].equals(t))
            {
                return true;
            }
        }

        return false;
    }
}
