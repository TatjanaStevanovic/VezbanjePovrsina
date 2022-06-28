import java.sql.SQLOutput;
import java.util.Scanner;

public class PovrsinaPravougaonika {
    public static void main(String[] args) {

        //Izracunavanje povrsine pravouganika

        Scanner s = new Scanner(System.in);

        System.out.println("Unesi vrednost stranice a u centimetrima");
        double a = s.nextDouble();

        System.out.println("Unesi vrednost stranice b u centimetrima");
        double b= s.nextDouble();
        if (a>0 && b>0) {
            double P = a * b;
            System.out.println("Povrsina pravouganika je: " + P + "cm2");
        }
        else {
            System.out.println("Stranice moraju biti pozitivni brojevi. Nije moguce izracunati povrsinu.");
        }

    }


}
