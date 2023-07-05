package ch16_DateTime;

import java.time.LocalDate;

public class C01_LocalDate_iclal {
    public static void main(String[] args) {
        //LocalDate  --- sadece yıl ay gün tutar
        LocalDate bugun= LocalDate.now();
        System.out.println("bugun = " + bugun);
    }
}
