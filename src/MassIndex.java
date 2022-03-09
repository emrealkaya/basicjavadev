import java.util.Scanner;

public class MassIndex {
    // This program features the mass index.

    public static void main(String[] args) {
        double weight, height, massIndex;

        Scanner input = new Scanner(System.in);

        System.out.println("Kilo giriniz: ");
        weight = input.nextDouble();
        System.out.println("Boyunuzu (metre cinsinden) giriniz: ");
        height = input.nextDouble();

        massIndex = weight / (height * height);

        System.out.println("Kitle indeksiniz: "+massIndex);


    }
}
