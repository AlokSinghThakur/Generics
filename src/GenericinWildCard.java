import java.util.ArrayList;

public class GenericinWildCard {
    public static void main(String[] args) {
        ArrayList<?> list = new ArrayList<String>();
//        list.add("Hello");//cannot add in wildcard
    }

    public <T> T getFirst(ArrayList<T> list) {
        return list.get(0);
    }

    public <T> void copy(ArrayList<T> source, ArrayList<T> destination) {
        for (T item : source) {
            destination.add(item);
        }
    }
}
