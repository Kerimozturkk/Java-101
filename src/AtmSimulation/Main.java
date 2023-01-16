package AtmSimulation;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        int right = 3;
        boolean isLogin = false;
        int balance = 1400;
        int customerChoice;


        Scanner input = new Scanner(System.in);

        while(right > 0){
            System.out.print("Kullanıcı Adınız: ");
            userName = input.nextLine();

            System.out.print("Parolanız: ");
            password = input.nextLine();

            if(userName.equals("kerim") && password.equals("1234")){
                System.out.println("Sisteme giriş yaptınız");
                isLogin = true;
                break;
            }else{
                System.out.println("Hatalı Kullanıcı adı ve ya şifre. Tekrar Deneyiniz.");
                System.out.println("Kalan Hakkınız: "+ --right);
                if(right == 0) System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişeme geçiniz.");
            }
        }

        if(isLogin){
            System.out.println("Merhaba X Bankasına Hoş Geldiniz");
            System.out.println();

            do{
                System.out.println("Lütfen yapmak istediğiniz islemi seçiniz");
                System.out.println(
                        "1- Para Yatırma\n" +
                                "2- Para Çekme\n" +
                                "3- Para Bakiye Sorgulama\n" +
                                "4- Para Çık\n"
                );
                System.out.print("İşlem numarısını giriniz: ");
                customerChoice = input.nextInt();

                switch (customerChoice){
                    case 1:
                        System.out.print("Para Miktarı: ");
                        int deposit = input.nextInt();
                        balance += deposit;
                        customerChoice = -1;
                        System.out.println();
                        break;
                    case 2:
                        System.out.print("Para Miktarı: ");
                        int price = input.nextInt();
                            if(price > balance){
                                System.out.println("Yetersiz Bakiye");
                            }else{
                                balance -= price;
                            }
                        customerChoice = -1;
                        System.out.println();
                        break;
                    case 3:
                        System.out.println();
                        System.out.println("Mevcut Bakiyeniz: "+(balance));
                        System.out.println();
                        customerChoice = -1;
                        break;
                    case 4:
                        System.out.println("Başarıyla Çıkış Yapıldı");
                        break;
                    default:
                        System.out.println("Başarısız işlem. İyi Günler");
                        break;
                }

            }while(customerChoice < 0 || customerChoice > 4);





        }

    }
}
