import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        int kacSayi,sayi,maxSayi = 0, minSayi = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayi gireceksiniz : ");
        kacSayi = input.nextInt();

        for (int i = 1; i<=kacSayi;i++ ){
            System.out.print(i+". Girilecek Sayı : ");
            sayi = input.nextInt();

            if(i==1){
                maxSayi = sayi;
                minSayi = sayi;
            }else{
                if(sayi >= maxSayi){
                    maxSayi = sayi;
                }

                if(sayi <= minSayi){
                    minSayi = sayi;
                }
            }

        }

        System.out.println("En büyük sayi : " + maxSayi);
        System.out.println("En küçük sayi : " + minSayi);

    }

}

