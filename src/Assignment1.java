import java.util.TreeSet;
import java.util.Set;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Assignment1 {
    public static void main(String[] args) {
        List<Integer> myArr = new ArrayList<Integer>();
        Collections.addAll(myArr,-90,1000,-5,0,1111);
        System.out.print("original array: ");
        for(int i:myArr){
            System.out.print(i+" ");
        }
        System.out.println("\n");
        Set<Integer> mySortedArr = new TreeSet<>(myArr);
        System.out.print("Sorted array: ");
        for(int i:mySortedArr){
            System.out.print(i+" ");
        }
    }
}