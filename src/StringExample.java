public class StringExample{
    public static void main(String[] args) {
        String name1 = "Krish";
        String name2 = "Krish";
        String name3 = "Krish";
        System.out.println(name1 == name2);
        System.out.println(name2 == name3);

        // We wre not changing name1
        System.out.println(name1.concat("!"));
        System.out.println(name1);

        String name4 = new String("Krish");
        String name5 = new String("Krish");
        // We are comparing reference variables
        System.out.println(name4 == name5);

        // We are comparing the content
        System.out.println(name4.equals(name5));

        String name6 = new String(new char[]{'K','r','i','s','h'});
        System.out.println(name5 == name6);
        System.out.println(name5.equals(name6));
    }
}
