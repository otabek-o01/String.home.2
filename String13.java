import java.util.Scanner;

public class String13 {

    static String firstTwo(String s) {

        if (s.length() < 2) {
            return s;
        }

        return s.substring(0, 2);

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String s = input.nextLine();

        System.out.println(firstTwo(s));

    }
}