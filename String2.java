import java.util.Scanner;

public class String2 {

    static String ikkiMarta(String s, char c) {

        String natija = "";

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == c) {
                natija += c;
                natija += c;
            } else {
                natija += s.charAt(i);
            }

        }

        return natija;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter String: ");
        String s = input.nextLine();

        System.out.print("Enter C: ");
        char c = input.next().charAt(0);

        System.out.println("Natija = " + ikkiMarta(s, c));

    }
}