package Java101;
import java.util.Scanner;
public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int math,phy,turkish, chem, music,total = 0,lesson = 0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik Notunuz: ");
        math = inp.nextInt();
        if (math>0 && math<100){
            total += math;
            lesson++;
        } else if (math==100 || math==0) {
            System.out.println("Girmiş olduğunuz not ortalamaya katılmayacaktır");
            
        }else {
            System.out.println("Girmiş olduğunuz not ortalamaya katılmayacaktır");
        }

        System.out.print("Fizik Notunuz: ");
        phy = inp.nextInt();
        if (phy>0 && phy<0){
            total +=phy;
            lesson++;
        } else if (phy==100 || phy==0) {
            System.out.println("Girmiş olduğunuz not ortalamaya katılmayacaktır");

        } else{
            System.out.println("Girmiş olduğunuz not ortalamaya katılmayacaktır");
        }

        System.out.print("Türkçe Notunuz: ");
        turkish = inp.nextInt();
        if (turkish>0 && turkish<100){
            total += turkish;
            lesson++;
        } else if (turkish==100 ||turkish==0 ) {
            System.out.println("Girmiş olduğunuz not ortalamaya katılmayacaktır");

        } else {
            System.out.println("Girmiş olduğunuz not ortalamaya katılmayacaktır");
        }

        System.out.print("Kimya Notunuz: ");
        chem = inp.nextInt();
        if ((chem>0) && (chem<100)){
            total += chem;
            lesson++;
        } else if (chem==100 ||chem==0 ) {
            System.out.println("Girmiş olduğunuz not ortalamaya katılmayacaktır");

        } else {
            System.out.println("Girmiş olduğunuz not ortalamaya katılmayacaktır");
        }

        System.out.print("Müzik Notunuz: ");
        music = inp.nextInt();
        if ((music>0) && (music<100)){
            total += music;
            lesson++;
        } else if (music==100 || music==0) {
            System.out.println("Girmiş olduğunuz not ortalamaya katılmayacaktır");

        } else {
            System.out.println("Girmiş olduğunuz not ortalamaya katılmayacaktır");
        }

        double average= total/lesson;


        if (average <= 55 ){
            System.out.println("Sınıfta Kaldınız. Seneye Görüşmek Üzere !");

        }else{
            System.out.println("Tebrekler. Sınıfı Geçtiniz !");
        }

        System.out.println("Ortalamanız: "+average);
    }
}