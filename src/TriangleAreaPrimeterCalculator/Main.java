package TriangleAreaPrimeterCalculator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int kenarA,kenarB,kenarC,perimiter;
        Scanner inp = new Scanner(System.in);

        System.out.print("A kenarının uzunluğunu giriniz: ");
        kenarA = inp.nextInt();

        System.out.print("B kenarının uzunluğunu giriniz: ");
        kenarB = inp.nextInt();

        System.out.print("C kenarının uzunluğunu giriniz: ");
        kenarC = inp.nextInt();

        perimiter = kenarA + kenarB + kenarC;

        double u = perimiter / 2;
        double area = Math.sqrt(u*(u-kenarA)*(u-kenarB)*(u-kenarC));

        System.out.println("Üçgenin alanı: "+area);

    }
}
