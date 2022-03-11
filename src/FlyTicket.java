import java.util.Scanner;

public class FlyTicket {
    public static void main(String[] args) {
        int km,yas,yolculukTipi;
        double perKm = 0.10,discountStudent=0.10,discountKids=0.50,discountAdult=0.30,discountRoundTrip=0.20,total,totalCost;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        km = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini belirtiniz(1 => Tek Yön, 2 => Gidiş Dönüş): ");
        yolculukTipi = input.nextInt();

        if(yolculukTipi>=1 && yolculukTipi <=2 && km>0 && yas>0){
            switch (yolculukTipi){
                case 1:
                    double cost;
                    cost = (km*perKm);
                    if(yas<12){
                        total = cost - cost * discountKids;
                        System.out.println("Toplam tutar : " +total);
                    }else if(yas>=12 && yas<=24){
                        total = cost - cost * discountStudent;
                        System.out.println("Toplam tutar: " + total);
                    }else if(yas>65){
                        total = cost - cost * discountAdult;
                        System.out.println("Toplam tutar : " + total);
                    }else{

                        System.out.println("Toplam tutar : " + cost);
                    }
                    break;

                case 2:
                    cost = (km*perKm);
                    double newCost;
                    if(yas<12){
                        total = cost - cost * discountKids;
                        newCost = total * discountRoundTrip;
                        totalCost = (total - newCost) * 2 ;
                        System.out.println("Toplam tutar : " +totalCost);
                    }else if(yas>=12 && yas<=24){
                        total = cost - cost * discountStudent;
                        newCost = total * discountRoundTrip;
                        totalCost = (total - newCost) * 2 ;
                        System.out.println("Toplam tutar: " + totalCost);
                    }else if(yas>65){
                        total = cost - cost * discountAdult;
                        newCost = total * discountRoundTrip;
                        totalCost = (total - newCost) * 2 ;
                        System.out.println("Toplam tutar : " + totalCost);
                    }else{
                        newCost = cost -(cost * discountRoundTrip);
                        System.out.println("Toplam tutar : " + newCost);
                    }
                    break;

        }
      } else {

            System.out.println("hatalı veri girdiniz!");
        }

    }
}
