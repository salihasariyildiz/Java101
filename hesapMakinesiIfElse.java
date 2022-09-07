package Java101;
import java.util.Scanner;
public class hesapMakinesiIfElse {
    public static void main(String[] args) {
        double n1,n2,select;

        Scanner inp = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz: ");
        n1 = inp.nextDouble();
        System.out.print("ikinci Sayıyı Giriniz: ");
        n2 = inp.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        select=inp.nextDouble();

        if (select==1){
            System.out.println("Sonuç: "+(n1+n2));
        } else if (select==2) {
            System.out.println("Sonuç: "+(n1-n2));

        } else if (select==3) {
            System.out.println("Sonuç: "+(n1*n2));

        } else if (select==4) {
            if (n2  != 0){
                System.out.println("Sonuç: "+(n1/n2));

            }else{
                System.out.println("Bir sayı 0'a bölünemez.");

            }

        }else{
            System.out.println("Yanlış seçim yaptınız. Tekrar deneyiniz");
        }


    }
}
