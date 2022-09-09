package Java101;

import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlik {
    public static void main(String[] args) {
        int heat;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen Sıcaklık Giriniz: ");
        heat = inp.nextInt();

        if (heat<5){
            System.out.println("Kayak yapabilirsiniz. ");

        } else if (heat<=25) {
           if ((heat<10)){
               System.out.println("Sinemaya Gidebilirsiniz. ");
           } if ((heat>=10) && (heat<=15)) {
               System.out.println("Piknik ve Sinemaya Gidebilirsniz. ");

           }if((heat>15)){
                System.out.println("Pikniğe Gidebilirsiniz. ");
            }
        }else{
            System.out.println("Yüzmeye Gidebilirsiniz. ");
        }
    }
    }

