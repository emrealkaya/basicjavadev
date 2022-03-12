import java.util.Scanner;

public class BasNumberSum {

    public static void main(String[] args) {
        int sayi, counter = 0, basNumber = 1, temp = 0, a = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        sayi = input.nextInt();

        while (sayi != 0) {

            basNumber = sayi % 10;
            temp +=basNumber;
            sayi/=10;

        }
        System.out.println("toplam " + temp);
    }
}