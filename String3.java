import java.util.Scanner;

public class String3 {

    static String qisqaUzunQisqa(String s1, String s2) {

        if (s1.length() < s2.length()) {
            return s1 + s2 + s1;
        } else {
            return s2 + s1 + s2;
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter s1 ");

        String s1 = input.nextLine();

        System.out.print("Enter s2 ");
        String s2 = input.nextLine();

        System.out.println(qisqaUzunQisqa(s1, s2));

    }
}