import java.util.Scanner;

public class Divisible {

    // Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

    public static void main(String[] args) {

        int sayi,i;
        double toplam = 0,counter=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        sayi = input.nextInt();

        for(i=0;i<=sayi;i++){
            if(i%3==0 && i%4==0){
                System.out.print(i+ ",");
                toplam +=i;
                counter++;
            }
        }
        double average = toplam / counter;
        System.out.print("\nDenenen Sayi Miktarı : " + counter);
        System.out.print("\nOrtalama : " + average);

    }
}
