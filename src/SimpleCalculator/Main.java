package SimpleCalculator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b,result = 0;
        String operator;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen ilk değeri giriniz: ");
        a = Integer.parseInt(inp.nextLine());

        System.out.print("Lütfen ikinci değeri giriniz: ");
        b = Integer.parseInt(inp.nextLine());

        System.out.print("Hangi 4 işlemi (+,-,*,/) gerçekleştirmek istiyorsunuz sembolünü giriniz: ");
        operator = inp.nextLine();


        switch (operator){
            case "+":
                result = a + b;
                System.out.println("İşlem sonucu: "+result);
                break;
            case "-":
                result = a - b;
                System.out.println("İşlem sonucu: "+result);
                break;
            case "*":
                result = a * b;
                System.out.println("İşlem sonucu: "+result);
                break;
            case "/":
                if(b == 0) {
                    System.out.println("Sonuc Tanımsızdır");
                    break;
                }
                result = a / b;
                System.out.println("İşlem sonucu: "+result);
                break;
            default:
                System.out.println("Yanlış sembol seçtiniz.");
                break;
        }

    }
}
