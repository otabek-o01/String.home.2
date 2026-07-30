import java.util.Scanner;

public class String14 {

    static String firstHalf(String s) {

        return s.substring(0, s.length() / 2);

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String s = input.nextLine();

        System.out.println(firstHalf(s));

    }
}