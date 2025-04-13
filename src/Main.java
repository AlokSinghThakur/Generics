//import java.lang.reflect.Type;

public class Main {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setValue(1);
        int i = box.getValue();
        System.out.println("Hello world!" + i);

//        Pair<String, Integer> pair = new Pair<>("Age", 30);
//        System.out.println(pair.getKey());
//        System.out.println(pair.getValue());
    }
}

//      T: Type
//      E: Element
//      K: Key (used in maps)
//      V:Value (used in maps)
//      N: Number