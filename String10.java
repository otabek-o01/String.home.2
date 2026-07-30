import java.util.Scanner;

public class String10 {

    static String makeAbba(String a, String b) {

        return a + b + b + a;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String a = input.nextLine();
        String b = input.nextLine();

        System.out.println(makeAbba(a, b));

    }
}