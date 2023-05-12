import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Iterator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List myList = new ArrayList();

        for (int i = 0; i < n; i++) {
            myList.add(sc.nextInt());
        }

        myList.add("###");

        for (int i = 0; i < m; i++) {
            myList.add(sc.next());
        }
        java.util.Iterator iterator = myList.iterator();
        while (iterator.hasNext()) {
            Object ob = iterator.next();
            try {
                Integer.parseInt(String.valueOf(ob));
            } catch (Exception ex) {
                if (!ob.equals("###"))
                    System.out.println(ob);
            }
        }
    }
}
