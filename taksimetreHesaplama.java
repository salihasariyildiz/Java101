package Java101;
import java.util.Scanner;

public class taksimetreHesaplama {
    public static void main(String[] args) {
        int km;
        double acilisUcreti, odenecekTutar;

        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi Km Cinsinden Giriniz:  ");
        km=inp.nextInt();

        acilisUcreti= 10;
        odenecekTutar= acilisUcreti + km * 2.20;
        odenecekTutar= (odenecekTutar<=20) ? 20 :(odenecekTutar);
        System.out.println("Ödenecek Tutar:  "+odenecekTutar);



    }
}
