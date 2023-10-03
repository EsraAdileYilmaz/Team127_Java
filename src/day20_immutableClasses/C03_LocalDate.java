package day20_immutableClasses;

import java.time.LocalDate;

public class C03_LocalDate {

    public static void main(String[] args) {

        /*
        LocalDate class'inin hazir methodlarindan faydalaniyoruz.
        Ama once bir obje olusturmamiz gerekiyor.
         */

        // now() methodu, bugunun tarihini dondurur
        LocalDate localdate= LocalDate.now();//once objemizi olusturduk.bu obje uzerinden methodlari cagiriyoruz.
        System.out.println(localdate);//2023-10-03 (yil-ay-gun)

        //plus() methodu, sonraki tarihleri verir.
        System.out.println(localdate.plusWeeks(10));//2023-12-12 (10 hafta sonrasinin tarihini dondurdu.)
        System.out.println(localdate.plusMonths(4).plusDays(5));
        //2024-02-08 (4 ay 5 gun sonrasinin tarihini dondurdu.)


        //minus() methodu, onceki tarihleri dondurur.
        System.out.println(localdate.minusYears(3).minusMonths(2).minusDays(13));
        //2020-07-21 (3 yil, 2 ay,13 gun oncesini dondurur)


        //with() methodu, icinde bulundugumuz tarihin degistirmek istedigimiz kismini
        //degistirmeye yarar.
        System.out.println(localdate.withMonth(5));//2023-05-03 (ayini biz sectik oda degistirdi.)
        System.out.println(localdate.withDayOfYear(200));//2023-07-19 (2023 yilinin 200. gununu dondurur)

        //isLeapYear() methodu artik yili bize verir.artik yil mi?
        System.out.println(localdate.isLeapYear());//false (2023 artik yil mi? sorusunun cevabi)

        LocalDate dogumTarihi1 = LocalDate.of(1996,7,12);//yeni obje olusturduk
        LocalDate dogumTarihi2 = LocalDate.of(2000,10,10);//yeni obje olusturduk

        System.out.println(dogumTarihi1.isLeapYear()); // true (dogumTarihi1'in yili artik yil mi?)
        System.out.println(dogumTarihi2.isLeapYear()); // true (dogumTarihi2'in yili artik yil mi?)

        //isBefore() methodu once mi?sorusunun cevabidir.
        //isAfter() methodu sonra mi?sorusunun cevabidir.
        System.out.println(dogumTarihi1.isBefore(dogumTarihi2)); // true (dogumTarihi1'in tarihi dogumTarihi2'nin tarihinden once mi?)
        System.out.println(dogumTarihi1.isAfter(dogumTarihi2)); // false (dogumTarihi1'in tarihi dogumTarihi2'nin tarihinden sonra mi?)

        System.out.println(localdate.lengthOfYear()); // 365 (bu yilin uzunlugunu bulduk)
        System.out.println(dogumTarihi1.lengthOfYear()); // 366
        // (dogumTarihi1 objesinin sahip oldugu yil olan 1996 yilinin uzunlugunu bulduk)


        System.out.println(localdate.getDayOfYear());//276 (bugun yilin kacinci gunu)

        System.out.println(localdate.getDayOfWeek()); // TUESDAY (bugun haftanin hangi gunu?)
        System.out.println(dogumTarihi1.getDayOfWeek()); // FRIDAY (1996,7,12 tarihi hangi gune denk geliyor)

        LocalDate dogumTarihim=LocalDate.of(1980,1,3);
        System.out.println(dogumTarihim.getDayOfWeek());//THURSDAY

        LocalDate hacer=LocalDate.of(2009,7,10);
        System.out.println(hacer.getDayOfWeek());//FRIDAY

        LocalDate eslem=LocalDate.of(2012,3,28);
        System.out.println(eslem.getDayOfWeek());//WEDNESDAY

        LocalDate mehmet=LocalDate.of(1980,6,24);
        System.out.println(mehmet.getDayOfWeek());//TUESDAY

    }
}
