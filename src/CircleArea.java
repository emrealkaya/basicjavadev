import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args) {
        double pi = 3.14,circleArea,circleC,circleSegmentA,angle;
        int r;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Circle Radius: ");
        r = input.nextInt();
        System.out.println("Enter Circle Segment Angle: ");
        angle = input.nextDouble();

        circleArea = pi * r * r;
        circleC = 2 * pi * r;
        circleSegmentA = (pi*(r*r)*angle) /360;

        System.out.println(String.format("Circle area: %.2f",circleArea));
        System.out.println(String.format("Circle Circumference: %.2f",circleC));
        System.out.println(String.format("Circle Segment A: %.2f ",circleSegmentA));

    }
}
