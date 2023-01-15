package NumberSequencer;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b,c;

        Scanner inp = new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz: ");
        a = inp.nextInt();

        System.out.print("2. Sayıyı giriniz: ");
        b = inp.nextInt();

        System.out.print("3. Sayıyı giriniz: ");
        c = inp.nextInt();

        if((a > b) && (a > c)){
            if(b > c) System.out.println("Büyükten kücüğe: a,b,c");
            else if (b==c)System.out.println("Büyükten kücüğe: a,b = c");
            else System.out.println("Büyükten kücüğe: a,c,b");

        } else if (a == b && a ==c) {

            System.out.println("a = b = c");

        } else {

            if(b > c) System.out.println("Büyükten kücüğe: b,c,a");
            else if (b==c)System.out.println("Büyükten kücüğe: b = c,a");
            else System.out.println("Büyükten kücüğe: c,b,a");
        }

    }
}
