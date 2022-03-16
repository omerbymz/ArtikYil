package Ders1;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int yil;

        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz: ");
        yil = input.nextInt();

        if(yil % 100 == 0) {
            if (yil % 400 == 0) {
                System.out.print("Bu Yıl Artık Yıldır.");
            } else {
                System.out.print("Artık Yıl Değil");
            }
        }else if(yil %4 ==0){
            System.out.print("Bu Yıl Artık Yıldır");
        }else {
            System.out.print("Artık Yıl Değil");
        }
    }
}
