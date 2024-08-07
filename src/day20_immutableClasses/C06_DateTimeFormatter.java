package day20_immutableClasses;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C06_DateTimeFormatter {

    public static void main(String[] args) {


        /*
            Yazdigimiz kodlarda zaman veya tarih ile ilgili islemlerde
            tarih veya zamani istedigimiz formatta tutabilmek icin
            DateTimeFormatter Class'ini kullanabiliriz.


             ldt.format(istenenFormat) methodunu kullanarak istedigimiz tarihi formatlayabiliriz.

		     FORMAT OLUSTURURKEN
		     GUN (Gun numarasi icin d, Gun yazisi icin E kullanilir)
		     d : basta 0 varsa onu yazmadan gun numarasi (3 oct...)
		     dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
		     DDD : yilin kacinci gunu oldugunu yazar (365 gun uzerinden )
		     E, EE, EEE : gun isminin ilk 3 harfi
		     EEEE : gun isminin tamamini

		     AY (Ay icin M, dakika icin m kullanilir)
		     M : basta 0 varsa onu yazmadan ay numarasi
		     MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
		     MMM : Ay isminin ilk 3 harfi
		     MMMM : Ay isminin tamami

             Y (Yil icin kullanilir)
		     YY : yilin son iki rakamini
		     YYYY : Yilin tamamini

		     Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)
		     HH / hh : saatin tamami, tek rakamli saat olursa 02 gibi
		     H / h : tek rakamli saat olursa sadece saati

		     a yazarsak AM veya PM degerini yazar.

		 */


        LocalDateTime ldt= LocalDateTime.now();
        System.out.println(ldt);//2023-10-03 T 20:29:33.934338
        //ldt'yi istedigimiz gibi formatlamak icin DateTimeFormatter class'indan faydalaniyoruz.

        // 03 Oct 2023 Tue
        DateTimeFormatter istenenFormat = DateTimeFormatter.ofPattern("dd MMM yyyy  EEEE");
        System.out.println(ldt.format(istenenFormat)); // 03 oct. 2023  mardi


        // saati 09:55 AM seklinde yazdiralim
        DateTimeFormatter istenenSaatFormati1 = DateTimeFormatter.ofPattern("hh:mm a");//burada once format olusturuyoruz
        System.out.println(ldt.format(istenenSaatFormati1)); // 09:58 AM


        // saati 9:55  24 saate gore
        DateTimeFormatter istenenSaatFormati2 = DateTimeFormatter.ofPattern("H:mm");
        System.out.println(ldt.format(istenenSaatFormati2)); // 10:00


        /*
        Once LocalDateTime ldt= LocalDateTime.now(); class'indan bir obje olusturuyoruz.
        Sonra bunu yani ldt'yi istedigimiz formatta yazmak icin DateTimeFormatter class'indan bir obje olusturuyoruz.
        Ve bu class'dan DateTimeFormatter.ofPattern("H:mm"); methodu yardimi ile istedigimiz formata ceviriyoruz.
         */

    }
}
