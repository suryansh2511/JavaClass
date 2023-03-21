import java.util.Arrays;

public class HomeWork{
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 2, 3, 4},
                {2, 3, 4, 5},
                {5, 6, 7, 8}
        };

        int[] ansRows = getColSum(arr);
        System.out.println("Sum of columns are: " + Arrays.toString(ansRows));

        int[] ansCols = getRowSum(arr);
        System.out.println("Sum of rows are: " + Arrays.toString(ansCols));

        int[] ansMax = BiggestElementInRow(arr);
        System.out.println("Maximum element of each rows are: " + Arrays.toString(ansMax));

        int sum = SumOfAllElements(arr);
        System.out.println("Sum of all the elements is: " +sum);
    }
    public static int[] getRowSum(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        int[] ans = new int[m];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                ans[i] += arr[i][j];
            }
        }
        return ans;
    }
    public static int[] getColSum(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        int[] ans = new int[n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                ans[j] += arr[i][j];
            }
        }
        return ans;
    }

    public static int[] BiggestElementInRow(int[][] arr){
        int m = arr.length;
        int[] ans = new int[m];
        for(int i=0; i<m; i++){
            ans[i] = getMax(arr[i]);
        }
        return ans;
    }

    public static int getMax(int[] arr){
        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int SumOfAllElements(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        int sum = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
