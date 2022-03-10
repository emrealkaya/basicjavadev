import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        int process,number1,number2;
        Scanner input = new Scanner(System.in);
        System.out.println("Specify the action you want to do :\n 1- Addition \n 2- Extraction \n 3- Multiplication \n 4- Division ");
        process = input.nextInt();
        System.out.println("Enter the first Number: ");
        number1 = input.nextInt();
        System.out.println("Enter the second Number: ");
        number2 = input.nextInt();

        switch (process){
            case 1:
                System.out.println("Between Two Number addition " + (number1+number2));
                break;
            case 2:
                System.out.println("Between Two Number Extraction : "+ (number1-number2));
                break;
            case 3:
                System.out.println("Between Two Number multiplication: " + (number1*number2));
                break;
            case 4:
                if(number2==0) {
                    System.out.println("Undefined");
                }else if(number2>number1) {
                    System.out.println("Between Two Number division: " + ((double)number1/number2));
                }else{
                    System.out.println("Between Two Number division: " + ((double)number1/number2));
                }
                break;

            default:
                System.out.println("You entered an unidentified transaction number!");
                break;



        }

    }
}
