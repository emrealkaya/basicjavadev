public class PrimeNumber {

    public static void main(String[] args) {
        int sayi=100;

        for(int i = 1; i < sayi; i++){
            boolean isTrue = true;
            for(int j = 2;j < i ;j++){
                if (i % j == 0) {
                    isTrue = false;
                    break;
                }
            }if(isTrue) System.out.print(i+" ");
        }
    }
}