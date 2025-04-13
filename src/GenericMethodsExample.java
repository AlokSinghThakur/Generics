public class GenericMethodsExample {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4};
        String[] stringArray = {"Hello", "World"};
        printArray(stringArray);
        printArray(intArray);
        display(1);
        display("Hello123");
    }

    public static  <T> void display(T element){
        System.out.println("Generic display: "+ element);
    }

    public static void display(Integer element){
        System.out.println("Integer display: "+ element);
    }
    public static  <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element + "");
        }
        System.out.println();
    }
}
