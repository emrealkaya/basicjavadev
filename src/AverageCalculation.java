import java.util.Scanner;

public class AverageCalculation {

    public static void main(String[] args) {
        double math,physics ,chem,turkLang,music,counter=0,average = 0;
        Scanner input = new Scanner(System.in);


        System.out.print("Math Exam Grade : ");
        math = input.nextDouble();
        if((math >= 0 && math <= 100)){
            average += math;
            counter++;

        }else {
            counter++;
            System.out.println("You did not enter the math grade, please make sure that the number you entered is between 0 and 100?");
        }

        System.out.print("Physics Exam Grade : ");
        physics = input.nextDouble();

        if((physics >= 0 && physics <= 100)){

            average += physics;
            counter++;

        }else {
            counter++;
            System.out.println("You did not enter the physics grade, please make sure that the number you entered is between 0 and 100?");
        }

        System.out.print("Chem Exam Grade : ");
        chem = input.nextDouble();

        if((chem >= 0 && chem <= 100)){

            average += chem;
            counter++;

        }else {
            counter++;
            System.out.println("You did not enter the physics grade, please make sure that the number you entered is between 0 and 100?");
        }

        System.out.print("Turk language Exam Grade : ");
        turkLang = input.nextDouble();

        if((turkLang >= 0 && turkLang <= 100)){

            average += turkLang;
            counter++;

        }else {
            counter++;
            System.out.println("You did not enter the physics grade, please make sure that the number you entered is between 0 and 100?");
        }

        System.out.print("Music Exam Grade : ");
        music = input.nextDouble();

        if((music >= 0 && music <= 100)){

            average += music;
            counter++;

        }else {
            counter++;
            System.out.println("You did not enter the music grade, please make sure that the number you entered is between 0 and 100?");
        }

        double total = average / counter;
        if(total <55){
            System.out.println(String.format("Not successful, your grade : %.2f",total));
            // System.out.println(average);
            // System.out.println(counter);
        }else{
            System.out.println(String.format("Congratulations, you passed the class. Your grade : %.2f",total));
            // System.out.println(average);
            // System.out.println(counter);

        }

    }
}
