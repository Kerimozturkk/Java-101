package KdvCalculator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        float price;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen bir fiyat giriniz: ");
        price = inp.nextFloat();

        double highTax = price * 0.18;
        double lowTax = price * 0.08;

        double priceWithTax = (price < 1000) ? highTax : lowTax;

        System.out.println("Vergi miktarı: "+priceWithTax);
        System.out.println("Total ücret: "+(price+priceWithTax));

    }
}
