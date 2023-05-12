import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = getList(sc);
        int deque = sc.nextInt();
        List<Integer> list1 = secondGet(list, sc, deque);
        String print = list1.toString();
        String printList = list1.toString().substring(1, print.length() - 1).replace(",", "");
        System.out.println(printList);
    }

    public static List<Integer> secondGet(List<Integer> myList, Scanner sc, int dequeCount) {
        int index;
        for (int i = 0; i < dequeCount; i++) {
            switch (sc.next()) {
                case "Insert"->{
                    index = sc.nextInt();
                    int element = sc.nextInt();
                    myList.add(index, element);
                }
                case "Delete"->{
                    index = sc.nextInt();
                    myList.remove(index);
                }
                default->
                        System.out.println("Invalid number");
            }
        }
        return myList;
    }

    public static List<Integer> getList(Scanner sc) {
        int size = sc.nextInt();
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            myList.add(sc.nextInt());
        }
        return myList;
    }
}
