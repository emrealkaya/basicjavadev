import java.util.Scanner;

public class Horoscope {
    /*
Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart
     */
    public static void main(String[] args) {

        int month,day;
        Scanner input =  new Scanner(System.in);

        System.out.print("Enter the month you were born: ");
        month = input.nextInt();

        System.out.print("Enter the day you were born : ");
        day = input.nextInt();

        if(month==1 && day >= 1  && day <= 21 || month==12 && day >= 22 && day <=31){
            System.out.println("Oğlak");
        }else if(month==2 &&  day >= 1  && day <= 19 || month==1 && day >= 22 && day <=31 ){

            System.out.println("kova");
        }else if(month==3 &&  day >= 1  && day <= 20 || month==2 && day >= 20 && day <=31){

            System.out.println("balık");
        }else if(month==4 &&  day >= 1  && day <= 20 || month==3 && day >= 21 && day <=31){

            System.out.println("koç");
        }else if(month==5 &&  day >= 1  && day <= 21 || month==4 && day >= 21 && day <=31){

            System.out.println("boğa");
        }else if(month==6 &&  day >= 1  && day <= 22 || month==5 && day >= 22 && day <=31){

            System.out.println("ikizler");
        }else if(month==7 &&  day >= 1  && day <= 22 || month==6 && day >= 23 && day <=31){

            System.out.println("yengeç");
        }else if(month==8 &&  day >= 1  && day <= 22 || month==7 && day >= 23 && day <=31){

            System.out.println("aslan");
        }else if(month==9 &&  day >= 1  && day <= 22 || month==8 && day >= 23 && day <=31){

            System.out.println("başak");
        }else if(month==10 &&  day >= 1  && day <= 22 || month==9 && day >= 23 && day <=31){

            System.out.println("terazi");
        }else if(month==11 &&  day >= 1  && day <= 21 || month==10 && day >= 23 && day <=31){

            System.out.println("akrep");
        }else if(month==12 &&  day >= 1  && day <= 21 || month==11 && day >= 22 && day <=31){

            System.out.println("yay");
        }else if (month<=0 || month>12 && day>31 || day<=0){

            System.out.println("yanlış değer girildi");
        }

    }
}



