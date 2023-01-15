package SimpleLogin;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName="kerim",password="12345";
        String userNameInp = null,passwordInp = null;
        String passwordRestartRes = null;
        String newPassword = null, newRePassword = null;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen kullanıcı adınızı giriniz: ");
        userNameInp = inp.nextLine();

        System.out.print("Lütfen sifrenizi giriniz giriniz: ");
        passwordInp = inp.nextLine();

        if(passwordInp.equals(password)){
            System.out.println("Giriş yapıldı. Hoş Geldiniz");
        }else{
            System.out.println("Kullanıcı adı veya şifreniz yanlış !!!");
            System.out.print("Şifrenizi sıfırlamak ister misiniz (E/H): ");
            passwordRestartRes = inp.nextLine();

            if(passwordRestartRes.equals("E")){

                System.out.print("Lütfen yeni bir sifre giriniz: ");
                newPassword = inp.nextLine();

                System.out.print("Lütfen yeni sifrenizi tekrar giriniz: ");
                newRePassword = inp.nextLine();

                boolean case1 = (newPassword.equals(newRePassword));
                boolean case2 = (!newPassword.equals(password));
                boolean isOkay = case1 && case2;

                if(isOkay){
                    System.out.println("Şifre oluşturuldu");
                }else{
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }


            }else{
                System.out.println("Keyfiniz bilir iyi günler");
            }

        }

    }
}
