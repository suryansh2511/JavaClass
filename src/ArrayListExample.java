import java.util.*;
import java.util.Arrays;
import java.util.List;
public class ArrayListExample{
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1); arr.add(2); arr.add(3);
        arr.add(4); arr.add(5); arr.add(6);
        int n = removeELe(arr, 3);
        System.out.println(n);
        for(int e: arr){
            System.out.println(e);
        }
    }
    public static int removeELe(List<Integer>arr, int n){
        return arr.remove(n);
    }
}
