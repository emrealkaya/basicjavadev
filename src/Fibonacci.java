import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int elemanSayi,n=0,n1=1,result;
        Scanner input = new Scanner(System.in);
        System.out.print("bir sayi giriniz : ");
        elemanSayi = input.nextInt();


        for(int i = 2; i<elemanSayi;i++){
            result = n + n1;
            System.out.println(n+" + "+n1 + " = "+result);
            n = n1;
            n1 = result;

        }
        System.out.println();
    }
}
