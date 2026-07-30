import java.util.Scanner;

public class String20 {

    static String nTwice(String s, int n) {

        return s.substring(0, n) + s.substring(s.length() - n);

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        int n = input.nextInt();

        System.out.println(nTwice(s, n));

    }
}