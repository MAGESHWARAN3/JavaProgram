import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
             ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(8);
        arrayList.add(1);
        arrayList.add(9);

            System.out.println("Unsorted ArrayList: " + arrayList);

             Collections.sort(arrayList);

  System.out.println("Sorted ArrayList: " + arrayList);
    }
}
