package ChineseZodiacCalculator;
import java.util.Scanner;
/*

Doğum Tarihi %12 = 0 ➜ Maymun

Doğum Tarihi %12 = 1 ➜ Horoz

Doğum Tarihi %12 = 2 ➜ Köpek

Doğum Tarihi %12 = 3 ➜ Domuz

Doğum Tarihi %12 = 4 ➜ Fare

Doğum Tarihi %12 = 5 ➜ Öküz

Doğum Tarihi %12 = 6 ➜ Kaplan

Doğum Tarihi %12 = 7 ➜ Tavşan

Doğum Tarihi %12 = 8 ➜ Ejderha

Doğum Tarihi %12 = 9 ➜ Yılan

Doğum Tarihi %12 = 10 ➜ At

Doğum Tarihi %12 = 11 ➜ Koyun

*/

public class Main {
    public static void main(String[] args) {
        int bDate;
        boolean isError = false;
        String horoscope = "";
        Scanner inp = new Scanner(System.in);

        System.out.print("Doğum tarihinizi giriniz: ");
        bDate = inp.nextInt();
        if(bDate < 1900 || bDate > 2023) isError = true;

        switch (bDate % 12){
            case 0:
                horoscope = "Maymun";
                break;
            case 1:
                horoscope = "Horoz";
                break;
            case 2:
                horoscope = "Köpek";
                break;
            case 3:
                horoscope = "Domuz";
                break;
            case 4:
                horoscope = "Fare";
                break;
            case 5:
                horoscope = "Öküz";
                break;
            case 6:
                horoscope = "Kaplan";
                break;
            case 7:
                horoscope = "Tavşan";
                break;
            case 8:
                horoscope = "Ejderha";
                break;
            case 9:
                horoscope = "Yılan";
                break;
            case 10:
                horoscope = "At";
                break;
            case 11:
                horoscope = "Koyun";
                break;
            default:
                isError = true;
                break;
        }

        if(isError){
            System.out.println("Hatalı bir işlem yaptınız");
        }else{
            System.out.println("Çin Zodyağı Burcunuz : "+horoscope);
        }



    }
}
