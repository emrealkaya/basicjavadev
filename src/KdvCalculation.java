import java.util.Scanner;

public class KdvCalculation {

    public static void main(String[] args) {

        double kdvRatio = 0.18,money,kdvRatio2 = 0.8,kdvW,kdvAmount,kdvW2,kdvAmount2,kdvWAmount,kdvWAmount2;
        Scanner input = new Scanner(System.in);
        System.out.println("Money amount: ");
        money = input.nextDouble();
        kdvW = money * kdvRatio;
        kdvAmount = money + kdvW;
        kdvW2 = (money * 8) /100;
        kdvAmount2 = money + kdvW2;
        kdvWAmount = kdvAmount - money;
        kdvWAmount2 = kdvAmount2 - money;


        System.out.println("Money in Account: "+ money);
        String s = money <= 1000 ? "New Money: " + kdvAmount+"\nMoney < 1000"+ "\nKDV RATIO: "+ kdvRatio +
                                              String.format("\nVAT Amount: %.1f",kdvWAmount):"New Money: " +
                                              kdvAmount2 + "\nMoney > 1000 "+ "\nKDV RATIO: "+ kdvRatio2 + String.format("\nVAT Amount: %.1f",kdvWAmount2);

        String b = money<=0 ? "invalid Amount" : s;
        System.out.println(b);


    }

}
