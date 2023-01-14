package CircleSliceAreaCalculator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double pi = 3.14,sliceRatio,sliceArea;
        int r,sliceAngle;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen dairenin yarı çapını giriniz: ");
        r = inp.nextInt();

        System.out.print("Lütfen daire diliminin merkez açısını giriniz: ");
        sliceAngle = inp.nextInt();

        sliceRatio = sliceAngle / 360.0;
        sliceArea = pi * r * r * sliceRatio;


        System.out.println("Girmiş olduğunuz daire diliminin alanı: "+sliceArea);

    }
}
