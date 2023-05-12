public class Generic {
    public static void main(String[] args) {
        Integer[] integer = {1, 2, 3};
        String[] string = {"Hello", "World"};
        printArray(integer);
        printArray(string);
    }

    public static <T> void printArray(T[] array) {
        for (T arr : array) {
            System.out.println(arr);
        }
    }
}
