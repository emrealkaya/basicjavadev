import java.util.Scanner;

public class EvenAndFourDivide {

    /*
    Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
    çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
     */
    public static void main(String[] args) {
        int sayi,toplam=0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Bir sayi giriniz : ");
            sayi = input.nextInt();
            if(sayi%2==0 && sayi%4==0){
                toplam+=sayi;
            }

        }while (sayi%2==0);
        System.out.println("Even and Four Divede Calculate : " + toplam);
    }
}
