import java.util.Scanner;

public class UserLogin {

    public static void main(String[] args) {

        String userName, password;
        Scanner input = new Scanner(System.in);
        System.out.print("Username : ");
        userName = input.nextLine();
        System.out.print("Password : ");
        password = input.nextLine();

        if(userName.equals("emre") && password.equals("123456")){
            System.out.println("Login successful ");
        }else{
            System.out.println("Password or Username entered incorrectly!");
            System.out.print("Do you want to reset password? : If you want to change enter 1 | If you dont wnat enter 2 : ");
            int resetPassword;
            resetPassword = input.nextInt();
            switch (resetPassword){
                case 1:
                    System.out.print("New password : " + input.nextLine());
                    String newPassword;
                    newPassword = input.nextLine();
                    if(newPassword.equals("123456")){
                        System.out.println("Please Try entering another password.");
                        String anotherPassword;
                        System.out.print("New password: ");
                        anotherPassword = input.nextLine();
                        System.out.println("Password changed successful!");
                    }else{
                        System.out.println("Welcome dashboard!");
                    }
                    break;
                case 2:
                    System.out.println("Redirect login page");
                    break;
            }
        }
    }
}
