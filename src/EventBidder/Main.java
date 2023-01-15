package EventBidder;
import  java.util.Scanner;

        /*

        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

        */


public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen sıcaklık değerini giriniz: ");
        heat = inp.nextInt();

        if(heat > 25){
            System.out.println("Yüzmeye gidebilirsin.");
        }else{
            if(heat >= 10) System.out.println("Pikniğe gidebilirsin.");
            if(heat >= 5 && heat <= 15) System.out.println("Sinemaya gidebilirsin.");
            if(heat < 5) System.out.println("Kayak yapabilirsin.");
        }


    }
}
















