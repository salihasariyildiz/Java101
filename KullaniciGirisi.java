package Java101;
import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String password, userName,yesNo = null,newPassword = null;

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen Kullanıcı Adınızı Giriniz: ");
        userName = inp.nextLine();
        System.out.print("Lütfen Şifrenizi Giriniz: ");
        password = inp.nextLine();


        if ((userName.equals("patika")) && (password.equals("java123"))) {
            System.out.println("Giriş Yaptınız !");


        }else if ((!userName.equals("patika")) || (!password.equals("java123"))) {
            System.out.println("Hatalı Giriş Yaptınız !");

        }  if (!password.equals("java123")) {
            System.out.print("Şifre yanlış, şifrenizi sıfırlamak istiyorsanız 'evet' istemiyorsanız 'hayır' yazınız: ");
            yesNo = inp.nextLine();

        } if (yesNo.equals("evet")) {
            System.out.print("Lütfen Yeni Şifrenizi Giriniz: ");
            newPassword = inp.nextLine();

        } else if (yesNo.equals("hayır")) {
            System.out.println("Giriş Yapılamadı");

        } if (newPassword.equals("java123")){
            System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz: ");
            newPassword = inp.nextLine();

        } if (!newPassword.equals("java123")){
            System.out.println("Şifre Oluşturuldu !");
        }

    }


    }