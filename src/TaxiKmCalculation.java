import java.util.Scanner;

public class TaxiKmCalculation {

    public static void main(String[] args) {

        double km, perKm = 2.20,taxiAmount;
        int kmOpen = 10;
        int kmMinAmount = 20;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter KM : ");
        km = input.nextDouble();
        taxiAmount = km * perKm + kmOpen;
        String s = taxiAmount <= 20 ? "Min Amount : " + kmMinAmount : "Taxi Amount: " + taxiAmount;
        System.out.println(s);

    }

}
