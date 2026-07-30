import java.util.Scanner;

public class String4 {

    static String yangiSatr(String s1, String s2, int n1, int n2) {

        return s1.substring(0, n1) + s2.substring(s2.length() - n2);

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print(" Enter s1 ");
        String s1 = input.nextLine();

        System.out.print(" Enter s2 ");
        String s2 = input.nextLine();

        System.out.print(" Enter n1 ");
        int n1 = input.nextInt();

        System.out.print(" Enter n2 ");
        int n2 = input.nextInt();

        System.out.println(yangiSatr(s1, s2, n1, n2));

    }
}