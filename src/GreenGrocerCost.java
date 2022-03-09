import java.util.Scanner;

public class GreenGrocerCost {
    /* This program is made for the greengrocer store. It was made by multiplying the kilogram input received from the user with the constant variable values.
    totalcost = if you are enter the - values you will get 0 result.*/

    public static void main(String[] args) {
       double pear=2.14,apple=3.67,tomato=1.11,banana=0.95,aubergine=5;
       double pearKg, appleKg, tomatoKg, bananaKg, aurbergineKg,totalAmount = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("How many Kg of Pear ? : " );
        pearKg = input.nextDouble();
        System.out.println("How many Kg of Apple ? :");
        appleKg = input.nextDouble();
        System.out.println("How many Kg of Tomato ? : ");
        tomatoKg = input.nextDouble();
        System.out.println("How many kg of Banana ? : ");
        bananaKg = input.nextDouble();
        System.out.println("How many kg of Aurbergine ? : ");
        aurbergineKg = input.nextDouble();

        totalAmount = ((pear*pearKg)+(apple*appleKg)+(tomato*tomatoKg)+(bananaKg*banana)+(aurbergineKg*aubergine));

        double totalCost = totalAmount < 0 ? 0 : totalAmount;
        System.out.println("Amount : " + totalCost);




    }
}
