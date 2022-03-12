import java.util.Scanner;

public class Combination {

    public static void main(String[] args) {

        int n,r,kombinasyon=1,faktoriyelN=1,faktoriyelR=1,faktoriyelK=1;
        Scanner input = new Scanner(System.in);
        System.out.print("N değerini giriniz : ");
        n = input.nextInt();
        System.out.print("R değerini giriniz : ");
        r = input.nextInt();

        for (int i = 1;i<=n;i++){
            faktoriyelN *= i;
        }
        for (int i = 1; i<=r;i++){
            faktoriyelR *=i;
        }
        for(int i = 1 ; i<=n-r;i++){
            faktoriyelK *= i;
        }

        if(n<0 || r<0)
        {
            System.out.println("pozitif sayi giriniz!");
        }else {
            System.out.println(n + ". faktoriyel : " + faktoriyelN);
            System.out.println(r + ". faktoriyel : " + faktoriyelR);
            System.out.println("(" + n + " - " + r + ")" + ". faktöriyel : " + faktoriyelK);
            kombinasyon = faktoriyelN / (faktoriyelR * faktoriyelK);
            System.out.println("Kombinasyon : " + kombinasyon);
        }

    }
}
