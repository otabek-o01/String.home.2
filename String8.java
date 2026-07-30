import java.util.Scanner;

public class String8 {

    static String almashtirish(String s1, String s2, String s3) {

        int index = s1.indexOf(s2);

        if (index == -1) {
            return s1;
        }

        return s1.substring(0, index) + s3 + s1.substring(index + s2.length());

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String s1 = input.nextLine();
        String s2 = input.nextLine();
        String s3 = input.nextLine();

        System.out.println(almashtirish(s1, s2, s3));

    }
}