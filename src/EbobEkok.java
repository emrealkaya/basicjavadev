import java.util.Scanner;

public class EbobEkok {

    public static void main(String[] args) {

        int n1,n2,min,k=1,ebob = 0,ekok;

        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayisini giriniz :  ");
        n1 = input.nextInt();
        System.out.print("n2 sayisini giriniz :  ");
        n2 = input.nextInt();

        min = (n1>n2) ? n2 : n1;
        
        while (k<=min) {

            if (n1 % min == 0 && n2 % min == 0) {
                ebob = min;
                break;

            } else {
                min -= k;
                System.out.println(min);
            }
        }
        ekok = (n1*n2)/ebob;
        System.out.println("Ebob : " + ebob);
        System.out.println("Ekok : " + ekok);

    }
}
