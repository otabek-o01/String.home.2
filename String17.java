import java.util.Scanner;

public class String17 {

    static String nonStart(String a, String b) {

        return a.substring(1) + b.substring(1);

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String a = input.nextLine();
        String b = input.nextLine();

        System.out.println(nonStart(a, b));

    }
}