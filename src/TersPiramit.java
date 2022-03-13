import java.util.Scanner;

public class TersPiramit {
    public static void main(String[] args) {
        int satirSayisi;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç satırdan oluşsun : ");
        satirSayisi = input.nextInt();

        for(int i = 0; i <satirSayisi ; i++){
            for(int j = 0; j<=(i-1) ;j++) {
                System.out.print(" ");

            }
            for(int k = 1; k <(2*(satirSayisi-i)) ;k++){

                System.out.print("*");
            }

            System.out.println();
        }
        }
    }
