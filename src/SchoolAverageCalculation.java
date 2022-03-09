import java.util.Scanner;

public class SchoolAverageCalculation {

    public static void main(String[] args) {

        double mat,pyh,chem,turkish,history,music,result=0;
        Scanner input = new Scanner(System.in);

        System.out.println("Maths Exam Result: ");
        mat = input.nextDouble();

        System.out.println("Physics Exam Result: ");
        pyh = input.nextDouble();

        System.out.println("Chemistry Exam Result: ");
        chem = input.nextDouble();

        System.out.println("Turkish Language Exam Result: ");
        turkish = input.nextDouble();

        System.out.println("History Exam Result: ");
        history = input.nextDouble();

        System.out.println("Music Exam Result: ");
        music = input.nextDouble();

        result = (mat+pyh+chem+turkish+history+music)/6;

        String e = result < 60 ? "Unsuccessful" : "Successful";

        System.out.println("Examp Result:"+result+" "+e);

    }
}
