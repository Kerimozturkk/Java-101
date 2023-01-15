package SumOfEvenAndDivisibleBy4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num,sumOfNums = 0;
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Enter a number : ");
            num = input.nextInt();

            if(num % 4 == 0) {
                sumOfNums += num;
                continue;
            };
            if(num % 2 == 0) sumOfNums += num;

        }while(num % 2 == 0);



        System.out.println("Divisible 4 numbers : "+sumOfNums);
    }
}
