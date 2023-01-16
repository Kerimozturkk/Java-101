package PowersOf4and5InRange;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int top;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        top = input.nextInt();


        for(int i = 1; i < top;i *= 4){
            System.out.println("power of 4: "+(i));
        }

        for(int i = 1; i < top;i *= 5){
            System.out.println("power of 5: "+(i));
        }

//        System.out.println("------");
//        int powOf6 = 1;
//        while(top > powOf6){
//            System.out.println(powOf6);
//            powOf6 *= 6;
//        }


    }
}
