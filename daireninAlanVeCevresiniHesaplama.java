package Java101;
import java.util.Scanner;

public class daireninAlanVeCevresiniHesaplama {
    public static void main(String[] args) {
    int r;
    double pi, alan, cevre,a,daireDilimininAlani;

    Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin Yarıçapını Giriniz: ");
        r= inp.nextInt();
        System.out.print("Dairenin Açısını Giriniz: ");
        a= inp.nextDouble();

        pi= 3.14;
        alan= pi*r*r;
        cevre= 2*pi*r;
        daireDilimininAlani= (pi*(r*r)*a)/360;

        System.out.println("Dairenin Alanı: "+alan);
        System.out.println("Dairenin Çevresi: "+cevre);
        System.out.println("Daire Diliminin Alani: "+daireDilimininAlani);
    }
}
