import java.util.Scanner;

public class DiamondWithStar {
/*
    *      1 yıldız 4 boşluk   yukarıdan aşağıya n-1 kadar gidiyo
   ***     3 yıldız 3 boşuk
  *****    5 yıldız 2 boşluk
 *******   7 yıldız 1 boşluk
*********  9 yıldız 0 boşluk   yukarıdan aşağıya kadar gider
 *******   7 yıldız 1 boşluk
  *****    5 yıldız 2 boşluk
   ***     3 yıldız 3 boşluk
    *      1 yıldız 4 boşluk
 */
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        sayi = input.nextInt();

       for(int i = 0; i <=sayi ; i++){
           for(int j = 0; j< sayi-i;j++) {
               System.out.print(" ");

              }
           for(int k = 0; k < (2*i+1) ;k++){

               System.out.print("*");
           }

           System.out.println();
           }

        for(int i = 0; i <sayi ; i++){
            for(int j = 0; j< (i+1) ;j++) {
                System.out.print(" ");

            }
            for(int k = 1; k < (2*(sayi-i)) ;k++){

                System.out.print("*");
            }

            System.out.println();
        }

       }


    }


