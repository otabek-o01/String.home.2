import java.util.Scanner;

public class String11 {

    static String makeOutWord(String a, String b) {

        return a.substring(0, 2) + b + a.substring(2);

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String a = input.nextLine();
        String b = input.nextLine();

        System.out.println(makeOutWord(a, b));

    }
}