import java.util.*;

public class Set<T> implements LimitedSet<T> {

    private Map collection = new HashMap<T,Integer>();
    private Integer previousValue;

    public Set(){
    }
    @Override
    public void add(final T t) {
        if(collection.size()<10){
            collection.put(t,0);
        }
        else{
            int min = (int) Collections.min(collection.values());
            for(Object key: collection.keySet()) {

                if(collection.get(key).equals(min))  {
                    remove((T) key);
                    collection.put(t,0);
                    break;
                }
            }
        }
    }
    @Override
    public boolean remove(final T t) {
        collection.remove(t);
        return true;
    }

    @Override
    public boolean contains(final T t) {
            if (collection.containsKey(t)){
                previousValue = (Integer) collection.get(t);
                collection.put(t, previousValue == null ? 1 : previousValue + 1);
                return true;
            }
        return false;
    }
    public void get(){
        List<T> keys = new ArrayList<T>(collection.keySet());
        for (T key : keys) {
            System.out.println(key + ", " + collection.get(key));
        }
    }
}
