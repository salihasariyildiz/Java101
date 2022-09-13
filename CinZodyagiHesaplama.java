package Java101;
import java.util.Scanner;

public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        int birthDate, result;
        String zodiac= "";

     Scanner inp =new Scanner(System.in);
     System.out.print("Lütfen Doğum Tarihinizi Giriniz: ");
     birthDate=inp.nextInt();

     result = birthDate % 12;

     if (result == 0){
         zodiac = "Çin Zodyağı Burcunuz: Maymun";
     }
     if (result == 1){
         zodiac = "Çin Zodyağı Burcunuz: Horoz ";
     }
     if (result == 2){
         zodiac = "Çin Zodyağı Burcunuz: Köpek";
     }
     if (result == 3){
         zodiac = "Çin Zodyağı Burcunuz: Domuz";
     }
     if (result == 4){
         zodiac = "Çin Zodyağı Burcunuz: Fare";
     }
     if (result == 5){
         zodiac = "Çin Zodyağı Burcunuz: Öküz";
     }
     if (result == 6){
         zodiac = "Çin Zodyağı Burcunuz: Kaplan";
     }
     if (result == 7){
         zodiac = "Çin Zodyağı Burcunuz: Tavşan";
     }
     if (result == 8){
         zodiac = "Çin Zodyağı Burcunuz: Ejderha";
     }
     if (result == 9){
         zodiac = "Çin Zodyağı Burcunuz: Yılan";
     }
     if (result == 10){
         zodiac = "Çin Zodyağı Burcunuz: At";
     }
     if (result == 11){
         zodiac = "Çin Zodyağı Burcunuz: Koyun";
     }
        System.out.println(""+zodiac);
    }

}
