import java.util.Scanner;

public class ExpNumber {

    public static void main(String[] args) {

        int k,n,toplam=1;

        Scanner input = new Scanner(System.in);
        System.out.print("Üstü alınacak sayı : ");
        n = input.nextInt();
        System.out.print("Üst olacak sayı : ");
        k = input.nextInt();

        for (int i = 1; i<=k;i++){
            toplam*=n;
        }
        if(n<0 || k<0){
            System.out.println("Pozitif sayi giriniz!");
        }else {
            System.out.print("Sayinin üstü : " + toplam);
        }
    }
}
