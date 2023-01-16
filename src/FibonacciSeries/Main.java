package FibonacciSeries;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int length,currentResult = 0;
        Scanner inp = new Scanner(System.in);


        System.out.print("Fibonnaci Serisi kaç elemandan oluşsun: ");
        length = inp.nextInt();

        int prev = 0;
        int next = 1;
        int result = 0;


        System.out.print(prev+" ");
        System.out.print(next+" ");
        length -= 2;
        while(length > 0){
            result = next + prev;
            prev = next;
            next = result;
            System.out.print(result+" ");
            length--;
        }
    }
}
