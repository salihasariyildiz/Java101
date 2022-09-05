package Java101;

import java.util.Scanner;

public class notOrtalamasiHesaplama {
    public static void main(String[] args) {
        // Değişkenleri oluştur

        int mat, fizik, turkce, kimya, tarih, muzik;

        // Scanner sınıfımızı tanımladık.
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan değerleri al.
        System.out.print("Matematik Notunuz :");
        mat = inp.nextInt();


        System.out.print("Fizik Notunuz :");
        fizik = inp.nextInt();

        System.out.print("Türkçe Notunuz :");
        turkce = inp.nextInt();

        System.out.print("Kimya Notunuz :");
        kimya = inp.nextInt();

        System.out.print("Tarih Notunuz :");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz :");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + turkce + kimya + tarih + muzik);
        double sonuc = (toplam / 6.0);
        System.out.println("Ortalamanız :" + sonuc);

        boolean kosul = (sonuc >=60);
        String sinifigecti = (kosul)? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sinifigecti);


    }
}



