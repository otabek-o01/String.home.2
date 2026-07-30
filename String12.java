import java.util.Scanner;

public class String12 {

    static String extraEnd(String s) {

        String oxiri = s.substring(s.length() - 2);

        return oxiri + oxiri + oxiri;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String s = input.nextLine();

        System.out.println(extraEnd(s));

    }
}