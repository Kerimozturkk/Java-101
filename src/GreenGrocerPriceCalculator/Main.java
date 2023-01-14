package GreenGrocerPriceCalculator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float armutPP = 2.14F,elmaPP = 3.67F,domatesPP = 1.11F,muzPP = 0.95F,patlicanPP = 5.0F,result;
        int armutW,elmaW,domatesW,muzW,patlicanW;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kaç kilo Armut aldınız: ");
        armutW = inp.nextInt();

        System.out.print("Kaç kilo Elma aldınız: ");
        elmaW = inp.nextInt();

        System.out.print("Kaç kilo Domates aldınız: ");
        domatesW = inp.nextInt();

        System.out.print("Kaç kilo Muz aldınız: ");
        muzW = inp.nextInt();

        System.out.print("Kaç kilo Armut aldınız: ");
        patlicanW = inp.nextInt();

        result = (armutW * armutPP) + (elmaW * elmaPP) + (domatesW * domatesPP) + (muzW * muzPP) + (patlicanW * patlicanPP);
        System.out.println("Toplam tutar: "+result);




    }
}
