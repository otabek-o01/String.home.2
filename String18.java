import java.util.Scanner;

public class String18 {

    static String left2(String s) {

        if (s.length() <= 2) {
            return s;
        }

        return s.substring(2) + s.substring(0, 2);

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String s = input.nextLine();

        System.out.println(left2(s));

    }
}