package DivisibleBy3and4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num,sum = 0,numsCount = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        num = input.nextInt();

        for(int i = 1; i < num; i++){
            if(i % 3 == 0 && i % 4 == 0){
                sum += i;
                numsCount++;
            }
        }

        if(numsCount == 0){
            System.out.println("Aralıkta 3'ün ve 4'ün ortak katı yoktur.");
        }else{
            System.out.println("Sonuc: "+(sum / numsCount));
        }


    }
}
