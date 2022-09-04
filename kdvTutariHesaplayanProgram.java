package Java101;
import java.util.Scanner;

public class kdvTutariHesaplayanProgram {
    public static void main(String[] args) {
        double tutar;


        Scanner inp =new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz :");
        tutar = inp.nextDouble();
        double kdvOran = (tutar<=1000) ? 0.18 : 0.08;
        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;


        System.out.println("KDV'siz Tutar"+tutar);
        System.out.println("KDV Oranı "+kdvOran);
        System.out.println("KDV Tutar "+kdvTutar);
        System.out.println("KDV'li Tutar :"+kdvliTutar);

        System.out.println(kdvliTutar);








    }


}
