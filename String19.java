import java.util.Scanner;

public class String19 {

    static String theEnd(String s, boolean front) {

        if (front) {
            return s.substring(0, 1);
        } else {
            return s.substring(s.length() - 1);
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        boolean front = input.nextBoolean();

        System.out.println(theEnd(s, front));

    }
}