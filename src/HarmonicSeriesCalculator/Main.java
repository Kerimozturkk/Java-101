package HarmonicSeriesCalculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double top;
        double sum = 0.0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        top = inp.nextDouble();

        for(double i = 1; i <= top;i++){
            sum += (1/i);
        }
        System.out.println("Harmonic Series Result: "+(sum));
    }
}
