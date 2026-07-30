import java.util.Scanner;

public class String6 {

    static int takrorlanish(String s1, String s2) {

        int count = 0;
        int index = 0;

        while ((index = s1.indexOf(s2, index)) != -1) {
            count++;
            index += s2.length();
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter s1 :");
        String s1 = input.nextLine();

        System.out.print(" Enter s2 ");
        String s2 = input.nextLine();

        System.out.println(takrorlanish(s1, s2));

    }
}