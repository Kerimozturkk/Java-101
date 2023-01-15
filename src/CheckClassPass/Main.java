package CheckClassPass;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,fiz,tr,kim,muz;
        int lessonsCount = 5;
        double average;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = inp.nextInt();
        if(mat < 0 || mat > 100){
            mat = 0;
            lessonsCount--;
        }

        System.out.print("Fizik notunuzu giriniz: ");
        fiz = inp.nextInt();
        if(fiz < 0 || fiz > 100){
            fiz = 0;
            lessonsCount--;
        }

        System.out.print("Türkçe notunuzu giriniz: ");
        tr = inp.nextInt();
        if(tr < 0 || tr > 100){
            tr = 0;
            lessonsCount--;
        }

        System.out.print("Kimya notunuzu giriniz: ");
        kim = inp.nextInt();
        if(kim < 0 || kim > 100){
            kim = 0;
            lessonsCount--;
        }

        System.out.print("Müzik notunuzu giriniz: ");
        muz = inp.nextInt();
        if(muz < 0 || muz > 100){
            muz = 0;
            lessonsCount--;
        }



        if(lessonsCount > 0){
            average = (mat+fiz+tr+kim+muz) / lessonsCount;
            if(average >= 55){
                System.out.println("Sınıfı Geçtiniz, Ortalamanız: "+average);
            }else{
                System.out.println("Sınıfta kaldınız... Ortalamanız: "+average);
            }
        }else{
            System.out.println("Sınavlara girmemişsiniz");
        }

    }
}
