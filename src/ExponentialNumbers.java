import java.util.Scanner;

public class ExponentialNumbers {

    //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        sayi = input.nextInt();

        for (int i = 1; i<sayi;i*=4){

            System.out.println("4'un kuvveti : " + i);
        }

        for (int i = 1; i<sayi; i*=5){

            System.out.println("5'in kuvveti : " + i);
        }

    }
}
