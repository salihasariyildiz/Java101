package Java101;
import java.util.Scanner;

public class ucgendeAlanHesaplama {
    public static void main(String[] args) {
        int a, b, c,cevre,u;
        double alan;
        Scanner inp = new Scanner(System.in);
        System.out.print ("A'nın uzunluğunu giriniz:  ");
        a= inp.nextInt();

        System.out.print("B'nin Uzunluğunu Giriniz:  ");
        b =inp.nextInt();

        System.out.print("C'nin Uzunluğunu Giriniz:  ");
        c=inp.nextInt();

        cevre = a+b+c;
        u = cevre/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı:  "+alan);



    }
}
