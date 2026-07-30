import java.util.Scanner;

public class String16 {

    static String comboString(String a, String b) {

        if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String a = input.nextLine();
        String b = input.nextLine();

        System.out.println(comboString(a, b));

    }
}