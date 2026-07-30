import java.util.Scanner;

public class String7 {

    static String ochirish(String s1, String s2) {

        int index = s1.indexOf(s2);

        if (index == -1) {
            return s1;
        }

        return s1.substring(0, index) + s1.substring(index + s2.length());

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print(" Enter s1  ");
        String s1 = input.nextLine();

        System.out.print(" Enter s2 ");
        String s2 = input.nextLine();

        System.out.println(ochirish(s1, s2));

    }
}