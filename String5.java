import java.util.Scanner;

public class String5 {

    static boolean ichidaBormi(String s1, String s2) {

        return s1.contains(s2);

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print(" Enter s1 ");
        String s1 = input.nextLine();

        System.out.print(" Enter s2 ");
        String s2 = input.nextLine();

        System.out.println(ichidaBormi(s1, s2));

    }
}