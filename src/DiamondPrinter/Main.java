package DiamondPrinter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int n = input.nextInt();
        int star = 1;

        for(int i = 1; i <= n; i++){
            for(int k = n; k > i ; k--){
                System.out.print(" ");
            }
            for(int j = 1; j <= star ; j++){
                System.out.print("*");
            }
            star+=2;
            System.out.println();
        }

        star -= 4;

        for(int i = n-1; i >= 1; i--){
            for(int k = n; k > i ; k--){
                System.out.print(" ");
            }
            for(int j = star; j >= 1 ; j--){
                System.out.print("*");
            }
            star-=2;
            System.out.println();
        }



    }
}
