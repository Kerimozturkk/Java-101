package PowerCalculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num,pow,result = 1;
        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        num = inp.nextInt();

        System.out.print("Please enter pow for num: ");
        pow = inp.nextInt();

        if(pow == 0) result = 1;
        for(int i = 1; i <= pow; i++){
            result *= num;
        }


        System.out.println(result);


    }
}
