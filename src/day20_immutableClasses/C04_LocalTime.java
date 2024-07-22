package day20_immutableClasses;

import java.time.LocalTime;
import java.time.ZoneId;

public class C04_LocalTime {

    public static void main(String[] args) {

          /*
            Localtime objesi canli bir kronometre degil,
            olusturuldugu anda sistemin saat bilgisini kaydeden bir variable'dir.

            Olusturuldugu anin saat,dakika,saniye ve nanosaniyesini verir.
            now() methodu anin saat,dakika,saniye ve nanosaniyesini verir.
         */

        //now() methodu anin saat,dakika,saniye ve nanosaniyesini verir.
        LocalTime localTime= LocalTime.now();// LocalTime class'indan objemizi olusturduk.
        System.out.println(localTime);//20:01:47.190776

        LocalTime turkiyeSaati = LocalTime.now(ZoneId.of("Europe/Paris")).plusHours(1);
        System.out.println(turkiyeSaati);//21:03:18.316922

        LocalTime japonyasaati= LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(japonyasaati);//03:05:38.771490

        System.out.println(localTime.toNanoOfDay());//72415390491000 (bugunun 72415390491000 nano saniyesindeyiz)

        // SORU: Yuzbin ile 1 milyon arasindaki sayilarin toplamini
        //       ve toplama isleminin kac nanosaniye surdugunu yazdirin.

        System.out.println("loop basinda locatime : "+ localTime);
        LocalTime baslangic = LocalTime.now();
        System.out.println("Baslangic : " + baslangic);
        System.out.println("Baslangicta nano saniye : " + baslangic.toNanoOfDay());

        long toplam = 0;

        for (int i = 1; i <10000 ; i++) {
            toplam = 0;
            for (int j = 100000; j <=1000000 ; j++) {
                toplam +=j ;
            }
        }


        System.out.println("toplam : " + toplam);
        System.out.println("loop sonunda locatime : "+localTime);
        LocalTime bitis = LocalTime.now();
        System.out.println("Bitis : " + bitis);
        System.out.println("Bitiste nano saniye : " + bitis.toNanoOfDay());

        System.out.println("Islem suresi " + (bitis.toNanoOfDay()-baslangic.toNanoOfDay()));






    }
}
