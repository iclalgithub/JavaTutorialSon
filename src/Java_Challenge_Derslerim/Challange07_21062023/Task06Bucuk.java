package Java_Challenge_Derslerim.Challange07_21062023;

import java.util.Scanner;

public class Task06Bucuk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Agam adını giresen : ");
        String ad = input.nextLine().toUpperCase(); //HALUK
        System.out.print("Agam soyadını giresen : ");
        String soyad = input.nextLine().toUpperCase(); //BİLGİN
        System.out.println(name(ad, soyad));

    }// main sonu

    public static String name(String ad, String soyad) {
        return (ad.charAt(0)+(ad.substring(1).toLowerCase()))+" "
                +(soyad.charAt(0)+(soyad.substring(1).toLowerCase()));
    }
}// Class
