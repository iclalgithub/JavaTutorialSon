package ch15_Varargs;

import java.util.Arrays;

public class C01_Varargs {
    public static void main(String[] args) {
        /*
      VARARGS :dillerdeki  yuklem gelmemisse veya daha ornek cogaltilacaksa kullanildigi gibi javada da ayni sekilde kullanilir
      var----variety cesitlilik args---arguments
      SYNTAX ->
      mathodName(parametre1,parametre2, dataType... dataName) {
      method body....

         }

        1) Method parametre parantezi icinde birden çok parametre varsa, varargs daima en sona tanımlanmalıdır
       .
         2) Method parametre parantezi icinde 1'den fazla varargs ifade TANIM-LA-NA-MAZZZ :


         Method'da  argument sayisi sabitse standart normal  method tanımlanmalı..
         ancak argument sayisi belirli değilse  VARARGS ifade tercih edilmeli

        */
        
        int sayi1=99;
        int sayi2=15;
        int sayi3=55;
        int sayi4=35;
        
        topla(sayi1,sayi2);//iki sayının toplamı= 114
        topla(sayi3,sayi4);//iki sayının toplamı= 90

        //verilen 3 sayının toplamı
        //sen ikiyi de taşı 3üde taşı--overload ettik metodu
        topla(sayi3,sayi4,sayi1);
        //üç sayının toplamı=189


        System.out.println("Varargs ile Toplama yapılıyor");
        toplaVarargs(sayi1,sayi2,sayi4,33);
        //toplam = 182
        toplaVarargs(sayi1,sayi2,sayi4,33,35);
        //toplam = 217
        toplaVarargs(sayi1,sayi2,sayi4,33,sayi3,sayi1,22);
        //toplam = 358
        
    }//main sonu

    private static void toplaVarargs(int ...i) {//varargs son parametre olmalı
        //private static void toplaVarargs(int ...i,String s)
        //Varargs parameter must be the last in the list
        System.out.println("i"+i);
        //i[I@3f99bd52
        System.out.println("Arrays.toString(i) = " + Arrays.toString(i));
        //Arrays.toString(i) = [99, 15, 35, 33]

        int toplam=0;
        for (int w:i) {
            toplam+=w;
        }
        System.out.println("toplam = " + toplam);
        //toplam = 182
    }

    private static void topla(int s, int ss,int sss) {
        System.out.println("üç sayının toplamı=" +(s+ss+sss));
    }

    private static void topla(int s, int d) {
        System.out.println("iki sayının toplamı= " + (s + d));
    }
}//class sonu
