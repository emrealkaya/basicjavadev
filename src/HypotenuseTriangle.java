import java.util.Scanner;

public class HypotenuseTriangle {

    public static void main(String[] args) {
        int triangleA,triangleB;
        double triangleH;
        Scanner input = new Scanner(System.in);
        System.out.println("1st edge: ");
        triangleA = input.nextInt();
        System.out.println("2st edge: ");
        triangleB = input.nextInt();


        triangleH = Math.sqrt((triangleA * triangleA) + (triangleB * triangleB));
        System.out.println("Triangle Hypotenuse: " + triangleH);






    }
}
