package HoroscopeFinder;
import java.util.Scanner;

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

public class Main {
    public static void main(String[] args) {
        int bDay;
        String bMonth;

        Scanner inp = new Scanner(System.in);

        System.out.print("Doğum gününüzü girinizi: ");
        bDay = Integer.parseInt(inp.nextLine());

        System.out.print("Doğum ayınızı girinizi: ");
        bMonth = inp.nextLine();

        if(bMonth.equals("Ocak")){
            if(bDay <= 21) System.out.println("Oğlak Burcusunusuz");
            else System.out.println("Kova Burcusunuz");
        }

        if(bMonth.equals("Şubat")){
            if(bDay <= 19) System.out.println("Kova Burcusunusuz");
            else System.out.println("Balık Burcusunuz");
        }

        if(bMonth.equals("Mart")){
            if(bDay <= 20) System.out.println("Balık Burcusunusuz");
            else System.out.println("Koç Burcusunuz");
        }

        if(bMonth.equals("Nisan")){
            if(bDay <= 20) System.out.println("Koç Burcusunusuz");
            else System.out.println("Boğa Burcusunuz");
        }

        if(bMonth.equals("Mayıs")){
            if(bDay <= 21) System.out.println("Boğa Burcusunusuz");
            else System.out.println("İkizler Burcusunuz");
        }

        if(bMonth.equals("Haziran")){
            if(bDay <= 22) System.out.println("İkizler Burcusunusuz");
            else System.out.println("Yengeç Burcusunuz");
        }

        if(bMonth.equals("Temmuz")){
            if(bDay <= 22) System.out.println("Yengeç Burcusunusuz");
            else System.out.println("Aslan Burcusunuz");
        }

        if(bMonth.equals("Ağustos")){
            if(bDay <= 22) System.out.println("Aslan Burcusunusuz");
            else System.out.println("Başak Burcusunuz");
        }

        if(bMonth.equals("Eylül")){
            if(bDay <= 22) System.out.println("Başak Burcusunusuz");
            else System.out.println("Terazi Burcusunuz");
        }

        if(bMonth.equals("Ekim")){
            if(bDay <= 22) System.out.println("Terazi Burcusunusuz");
            else System.out.println("Akrep Burcusunuz");
        }

        if(bMonth.equals("Kasım")){
            if(bDay <= 21) System.out.println("Akrep Burcusunusuz");
            else System.out.println("Yay Burcusunuz");
        }

        if(bMonth.equals("Aralık")){
            if(bDay <= 21) System.out.println("Yay Burcusunusuz");
            else System.out.println("Oğlak Burcusunuz");
        }


    }
}
