package BiggestInput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int numberCount;
        int inputNumber = 1;
        int firstNum,smallestNum,biggestNum,nextNumber;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kaç tane sayı giriceksiniz: ");
        numberCount = inp.nextInt();

        System.out.print((inputNumber)+". sayıyı giriniz: ");
        firstNum = inp.nextInt();
        numberCount--;
        inputNumber++;
        biggestNum = firstNum;
        smallestNum = firstNum;

        while(numberCount > 0){

            System.out.print((inputNumber)+". sayıyı giriniz: ");
            nextNumber = inp.nextInt();

            if(nextNumber > biggestNum){
                biggestNum = nextNumber;
            }else{
                smallestNum = nextNumber;
            }

            numberCount--;
            inputNumber++;
        }

        System.out.println("En büyük sayı: "+(biggestNum));
        System.out.println("En büyük sayı: "+(smallestNum));

    }
}
