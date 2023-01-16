package ArmstrongNumberChecker;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true){ // while loop for test cases

            int num,numCount = 0;
            int tempForCount;
            int sumOfPowers = 0;

            System.out.print("Please enter a number: ");
            num = input.nextInt();
            tempForCount = num;
            int originalNum = num;

            while(tempForCount != 0){
                tempForCount /= 10;
                numCount++;
            }

            while(num != 0){
                int powerOfDigit = 1;

                int digit = num % 10;
                num /= 10;

                for(int i = 1; i <= numCount; i++){
                    powerOfDigit *= digit;
                }


                sumOfPowers += powerOfDigit;

            }

            if(originalNum == sumOfPowers){
                System.out.println("Your number is a armstrong number");
            }else{
                System.out.println("Your number is not a armstrong number");
            }
        }
    }
}
