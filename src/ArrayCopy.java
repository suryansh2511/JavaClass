import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCopy{
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5,6};
        int[] arr2 = new int[]{7,8,9,10,11,12};
        int[] arr3 = new int[arr1.length + arr2.length];
        /* for(int i=0; i<arr1.length; i++){
            arr3[i] = arr1[i];
        }
        for(int i=0; i<arr2.length; i++){
            arr3[i+arr1.length] = arr2[i];
        }
        System.out.println(Arrays.toString(arr3)); */

        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
        System.out.println(Arrays.toString(arr3));
    }
}
