import java.util.Scanner;

public class String9 {

    static String helloName(String name) {

        return "Hello " + name + "!";

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();

        System.out.println(helloName(name));

    }
}