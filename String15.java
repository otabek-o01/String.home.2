import java.util.Scanner;

public class String15 {

    static String withoutEnd(String s) {

        return s.substring(1, s.length() - 1);

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String s = input.nextLine();

        System.out.println(withoutEnd(s));

    }
}