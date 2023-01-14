package GradeCalculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Matematik notunuzu giriniz: ");
        mat = inp.nextInt();

        System.out.print("Lütfen Fizik notunuzu giriniz: ");
        fizik = inp.nextInt();

        System.out.print("Lütfen Kimya notunuzu giriniz: ");
        kimya = inp.nextInt();

        System.out.print("Lütfen Türkçe notunuzu giriniz: ");
        turkce = inp.nextInt();

        System.out.print("Lütfen Tarih notunuzu giriniz: ");
        tarih = inp.nextInt();

        System.out.print("Lütfen Müzik notunuzu giriniz: ");
        muzik = inp.nextInt();

        double average = (mat+kimya+fizik+turkce+tarih+muzik) / 6;

        String result = (average >= 60) ? "Sınıfı geçtiniz" : "Sınıfta kaldınız";

        System.out.println("Not ortalamanız: "+average);
        System.out.println(result);

    }
}
