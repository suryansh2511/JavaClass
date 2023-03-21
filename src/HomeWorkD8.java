public class HomeWorkD8{
    public static void main(String[] args) {
        String data = "1001-Krish-23,1002-Manoj-32,1003-Charan-35,1005-Kiran-45";
        // Find youngest age in the list
        String[] rows = data.split(",");
        int[] ages = new int[rows.length];
        for(int i=0; i<rows.length; i++){
            String[] cols = rows[i].split("-");
            ages[i] = Integer.parseInt(cols[2]);
        }
        System.out.println("The minimum age is: " + min(ages));
    }

    public static int min(int[] ages){
        int ans = ages[1];
        for(int i=0; i< ages.length; i++){
            if(ages[i] < ans){
                ans = ages[i];
            }
        }
        return ans;
    }
}
