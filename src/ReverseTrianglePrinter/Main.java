package ReverseTrianglePrinter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int row;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen satır sayısı giriniz: ");
        row = inp.nextInt();

        for(int i = row; i >= 1;i--){

            for(int k = 1; k <= row-i; k++){
                System.out.print(" ");
            }

            for(int j = 1; j <= ((2*i)-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
