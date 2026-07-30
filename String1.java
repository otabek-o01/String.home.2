import java.util.Scanner;

public class String1 {

    static String natija (String S){

        String natija = " ";


        for(int i = 0; i < S.length() ; i++){

            natija += S.toString();
            natija += S.toString();
        }

        return natija;
    }

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print(" Harif yoki son kiriting :  ");

        String S = sc.nextLine();

        System.out.print("Natija = " + natija(S));


    }
}