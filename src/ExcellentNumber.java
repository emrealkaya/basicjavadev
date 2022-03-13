import java.util.Scanner;

public class ExcellentNumber {
    public static void main(String[] args) {

        int girilenSayi, total = 0;
        Scanner input = new Scanner(System.in);

        do {

            System.out.print("Bir sayi giriniz : ");
            girilenSayi = input.nextInt();
            total = 0;
            for (int i = 1; i < girilenSayi; i++){
                if(girilenSayi % i == 0){
                    total +=i;
                }

            }

            if(girilenSayi == total){

                System.out.println(girilenSayi+ " "+"Sayısı mükemmel sayıdır.");
            }else{
                System.out.println("Mükemmel sayı değildir");
            }



        }while (girilenSayi>0);
    }
}

