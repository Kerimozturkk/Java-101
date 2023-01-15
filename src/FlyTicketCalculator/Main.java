package FlyTicketCalculator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int distance,age,type;
        float pricePerKM = 0.10F,ageDiscountRatio,typeDiscountRatio;
        boolean isError = false;
        float result;
        int typeMultiplier = 1;


        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        distance = inp.nextInt();
        if(distance < 0) isError = true;

        System.out.print("Yaşınızı giriniz : ");
        age = inp.nextInt();
        if(age > 120 || age < 0) isError = true;

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        type = inp.nextInt();
        if(type != 1 && type != 2) isError = true;


//        result = distance * pricePerKM;

        if(age > 65){
            ageDiscountRatio = 0.3F;
        } else if (age < 24 && age >= 12) {
            ageDiscountRatio = 0.1F;
        }else if (age < 12){
            ageDiscountRatio = 0.5F;
        }else{
            ageDiscountRatio = 0;
        }

        if(type == 1){
            typeDiscountRatio = 0;
        }else{
            typeDiscountRatio = 0.2F;
            typeMultiplier = 2;

        }

        if(isError){
            System.out.println("Hatalı Veri Girdiniz !");
        }else{
            result = distance * pricePerKM;
            result -= result * ageDiscountRatio;
            result -= result * typeDiscountRatio;
            result *= typeMultiplier;

            System.out.println("Toplam Tutar = "+result+"₺");
        }


    }
}
