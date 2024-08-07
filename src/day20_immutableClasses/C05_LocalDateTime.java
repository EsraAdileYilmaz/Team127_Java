package day20_immutableClasses;

import java.time.LocalDateTime;

public class C05_LocalDateTime {

    public static void main(String[] args) {


       //LocalDateTime class'i bize ayni anda tarih ve saati dondurur.


        /*
       getDayOfMonth() methodu bize bulundugumuz ayin gununu dondurur
       getMonth() methodu bize bulundugumuz ayi dondurur
       getYear() methodu bize bulundugumuz yili dondurur
       getDayOfWeek() methodu bize bulundugumuz haftadaki gunu ismiyle dondurur.

        */

        LocalDateTime ldt = LocalDateTime.now();//oncelikle objemizi olusturduk.Anin tarih ve saatini dondurur.
        System.out.println(ldt); //2023-10-03 T 20:15:22.492350 (tarih T saat)

        // Kullaniciya zamani 3 ekim 2023 sali  seklinde yazdirin

        System.out.println(ldt.getDayOfMonth() + " " //3
                         + ldt.getMonth()+ " "       //october
                         + ldt.getYear()+ " "        //2023
                         + ldt.getDayOfWeek());      //Tuesday

        // 3 OCTOBER 2023 TUESDAY


    }
}
