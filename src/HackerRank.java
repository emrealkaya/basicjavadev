import java.util.Scanner;

public class HackerRank {

    public static void main(String[] args) {
        int n,result;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        n = input.nextInt();

        for(int i=1; i <= 10;i++){
            result = n*i;

            System.out.println(n+" "+"x"+" "+i+" = "+result);

        }
    }
}

