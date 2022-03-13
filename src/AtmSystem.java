import java.util.Scanner;

public class AtmSystem {

    public static void main(String[] args) {
        String userName, password;
        int counter = 3;
        Scanner input = new Scanner(System.in);
        int selectIslem,balance = 1500,money;

        while (counter > 0){
            counter--;
            System.out.print("Kullanıcı adını giriniz : ");
            userName = input.nextLine();
            System.out.print("Parola giriniz : ");
            password = input.nextLine();

            if(userName.equals("emre")  && password.equals("12345")) {
                System.out.println("Hoşgeldiniz");

                do {
                    System.out.print("1 => Para Yatırma\n" + "2 => Para Çekme\n"+ "3 => Bakiye Sorgulama\n"+"4 => Çıkış yap\n");
                    System.out.print("lütfen yapmak istediğiniz işlemi belirtiniz : ");
                    selectIslem = input.nextInt();

                    switch (selectIslem){
                        case 1:
                            System.out.print("Yatırmak istediğiniz tutarı giriniz : ");
                            money = input.nextInt();
                            balance = balance + money;
                            System.out.println("Yatırılan tutar : "+ money);
                            System.out.println("Güncel bakiye : " + balance);
                            break;
                        case 2:
                            System.out.println("Bakiyeniz : " + balance);
                            System.out.print("Çekmek istediğiniz tutarı giriniz : ");
                            money = input.nextInt();
                            if(money>balance){
                                System.out.println("Yetersiz Bakiye");
                            }else {
                                System.out.println("Çekilen tutar : "+ money);
                                balance = balance - money;
                                System.out.println("Güncel bakiye : " + balance);

                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : "+ balance);
                            break;

                    }
                }while (selectIslem != 4);
                    System.out.println("Görüşmek üzere!");
                    break;
            }else{

                System.out.println("Kalan Hakkınız  : " + counter);

                if(counter == 0) {

                    System.out.println("Hesabınız bloke oldu!");
                }
            }

        }
    }
}
