import java.util.Scanner;

public class WeatherChoose {

    public static void main(String[] args) {

        int heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature value: ");
        heat = input.nextInt();

        if(5<heat && heat<15){
            System.out.println("cinema");
        }else if(heat>15 && heat<25){

            System.out.println("picnic");
        }else if(heat>25){

            System.out.println("swim");
        }else{
            System.out.println("ski");
        }
    }
}
