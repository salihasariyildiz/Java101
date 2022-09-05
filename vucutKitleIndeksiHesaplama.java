package Java101;
import java.util.Scanner;

public class vucutKitleIndeksiHesaplama {
    public static void main(String[] args) {
        double kg,m,vucutkitle;

        Scanner inp =new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu (m cinsinden) Giriniz: ");
        m = inp.nextDouble();

        System.out.print("Lütfen Kilonuzu (kg cinsinden) Giriniz: ");
        kg = inp.nextDouble();

        vucutkitle= kg/(m * m);
        System.out.println("Vücut Kitle İndeksiniz: "+vucutkitle);
    }
}
