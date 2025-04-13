interface Printable {
    void print();
}


class MyNumber extends Number implements Printable {

    private final int value;

    public MyNumber(int value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.println("My number: " + value);

    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}

class Boxx<T extends Number & Printable> { // first generic will always be class second will be Interface
    private T item;

    public Boxx(T item) {
        this.item = item;
    }

    public void display() {
        item.print();
    }

    public T getItem() {
        return item;
    }
}

public class Test {
    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(12);
        Boxx<MyNumber> box = new Boxx<>(myNumber);
        box.display();
    }
}