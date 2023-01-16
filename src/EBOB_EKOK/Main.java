package EBOB_EKOK;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b,smallest = 1,result = 0;
        boolean isError = false;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen ilk sayıyı giriniz: ");
        a = inp.nextInt();

        System.out.print("Lütfen ikinci sayıyı giriniz: ");
        b = inp.nextInt();

        if(a < b){
            smallest = a;
        }else if(a == b){
            isError = true;
        }else{
            smallest = b;
        }

        if(isError){
            System.out.println("Aynı değerleri girdiniz :DD");
        }else{
            int i = 1;
            while(i <= smallest){
                if(a % i == 0 && b % i == 0){
                    result = i;
                }
                i++;
            }
            System.out.println("Ebob: "+(result));
            System.out.println("Ekok: "+((a*b)/result));
        }





    }
}
