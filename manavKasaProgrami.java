package Java101;
import java.util.Scanner;

public class manavKasaProgrami {
    public static void main(String[] args) {
        double armut=2.14, elma=3.67, domates= 1.11, muz= 0.95, patlican=5.00, toplamTutar;

        Scanner inp= new Scanner(System.in);
        System.out.print("Armutun Kilosunu Gitiniz: ");
        armut *= inp.nextDouble();

        System.out.print("Elmanın Kilosunu Giriniz: ");
        elma *= inp.nextDouble();

        System.out.print("Domatesin Kilosunu Giriniz: ");
        domates *=inp.nextDouble();

        System.out.print("Muzun Kilosunu Giriniz: ");
        muz *= inp.nextDouble();

        System.out.print("Patlıcanın Kilosunu Giriniz: ");
        patlican *= inp.nextDouble();

        toplamTutar= armut+elma+domates+muz+patlican;
        System.out.println("Toplam Tutar: "+toplamTutar);


    }
}
