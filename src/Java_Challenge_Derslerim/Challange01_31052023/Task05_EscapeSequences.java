package Java_Challenge_Derslerim.Challange01_31052023;

public class Task05_EscapeSequences {//class blok
    public static void main(String[] args) { //main blok

/*
	  \n (or \r): starts from a new line : metni bir alt satirdan itibaren yazdirir.
	          \t:  horizontal tab : metni yatayda 1 tab miktari kaydirir.
	          \\: prints a back slash :\ (ters slash) yazdirir
	          \': prints single quote :' tek tirnak yazdirir.
	          \": prints double quote :"" cift tirnak yazdirir.
	 \: backslash
	 /:front slash




      Soru-1 :   konsola  1 tab ilerde  "Hello ", "Students  \ //"        seklinde yazdiriniz
      Soru-2 : javaCAN kelimesini her harfini ayri bir satira gelecek sekilde yazdiriniz.
      Soru-3 : "BAŞARI" gayrete aşıktır
               'bahanesi' olanın başarısı olmaz   yazdiriniz
                 2 satir sonra da satir basindan 2 tab ilerde de "ahan da hayatın TRICK'i" yazdiriniz
                 Bunlari sadece 1 sout kullanarak yazdiriniz

 */
        System.out.println("\n ***Kendi Çözümüm*** \n");
        System.out.println("çıktı = " + "\" Hello \", \" Students \\ //");
        System.out.println("j\ta\tv\ta\tC\tA\tN"); //tab ile denedim




        System.out.println("\"Hello \",\"Students \\ // \"");// "Hello ","Students \ // "
        System.out.println("j\na\nv\na\nC\nA\nN");
        System.out.println("\"BAŞARI\" gayrete aşıktır\n\'bahanesi\' olanın başarısı olmaz\n\n\t\t\"ahan da hayatın TRICK\'i\"");


    }//main sonu
}//Class sonu
