package sumDigitsOfNum;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);

        while(true){ // while loop for test cases in same run-time
            int num,sum = 0;
            System.out.print("Please enter a number: ");
            num = inp.nextInt();


            while(num > 10){
                sum += num % 10;
                num /= 10;
                if(num < 10) sum += num;
            }

            System.out.println(sum);
        }

    }
}
