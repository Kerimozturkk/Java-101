package BodyWeightIndexCalculator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int weight;
        float height;
        double result;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu giriniz: ");
        height = inp.nextFloat();

        System.out.print("Lütfen kilonuzu giriniz: ");
        weight = inp.nextInt();

        result = weight * (height * height);

        System.out.println("Vücut kütle endeksiniz: "+result);

    }
}
