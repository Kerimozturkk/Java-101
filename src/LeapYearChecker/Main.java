package LeapYearChecker;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int year;
        boolean isLeapYear = false;

        Scanner inp = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        year = inp.nextInt();


        if(year % 100 != 0){
            if(year % 4 == 0) isLeapYear = true;
        }else{
            if(year % 400 == 0) isLeapYear = true;
        }

        if(isLeapYear){
            System.out.println(year+" bir artık yıldır !");
        }else{
            System.out.println(year+" bir artık yıldır değildir !");
        }



    }
}
