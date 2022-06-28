import java.util.Scanner;

public class PovrsinaKvadrata {
    public static void main(String[] args) {

        //Izracunavanje povrsine kvadrata

        Scanner p = new Scanner(System.in);

        System.out.println("Unesi stranicu a u cm");
        double a = p.nextDouble();

        double P = a * a;

        System.out.println("Povrsina kvadrata je: " + P+"cm2");
    }
}
