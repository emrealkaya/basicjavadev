import java.util.Scanner;

public class ChineseZodiac {

    public static void main(String[] args) {
        int yearOfBirth;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your year of birth :");
        yearOfBirth = input.nextInt();
        if (yearOfBirth % 12 == 0) {
            System.out.println("Monkey");

        }else if (yearOfBirth % 12 == 1) {
            System.out.println("Cockerel");

        }else if (yearOfBirth % 12 == 2) {
            System.out.println("Dog");

        } else if (yearOfBirth % 12 == 3) {
            System.out.println("Pork");

        } else if (yearOfBirth % 12 == 4) {
            System.out.println("Mouse");

        } else if (yearOfBirth % 12 == 5) {
            System.out.println("Pig");

        } else if (yearOfBirth % 12 == 6) {
            System.out.println("Tiger");

        } else if (yearOfBirth % 12 == 7) {
            System.out.println("Rabbit");

        } else if (yearOfBirth % 12 == 8) {
            System.out.println("Dragon");

        } else if (yearOfBirth % 12 == 9) {
            System.out.println("Snake");

        } else if (yearOfBirth % 12 == 10) {
            System.out.println("Horse");

        } else if (yearOfBirth % 12 == 11) {
            System.out.println("Sheep");

        }
    }
}

