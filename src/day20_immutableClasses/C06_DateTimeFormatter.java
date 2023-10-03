package day20_immutableClasses;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C06_DateTimeFormatter {

    public static void main(String[] args) {


        /*
            Yazdigimiz kodlarda zaman veya tarih ile ilgili islemlerde
            tarih veya zamani istedigimiz formatta tutabilmek icin
            DateTimeFormatter Class'ini kullanabiliriz.
         */

        LocalDateTime ldt= LocalDateTime.now();
        System.out.println(ldt);//2023-10-03 T 20:29:33.934338

        // 03 Oct 2023 Tue
        DateTimeFormatter istenenFormat = DateTimeFormatter.ofPattern("dd MMM yyyy  EEEE");
        System.out.println(ldt.format(istenenFormat)); // 03 oct. 2023  mardi

         /*
		 format olustururken
		 GUN
		 d : basta 0 varsa onu yazmadan gun numarasi
		 dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
		 DDD : yilin kacinci gunu oldugunu yazar
		 E, EE, EEE : gun isminin ilk 3 harfi
		 EEEE : gun isminin tamamini

		 AY (Ay icin M, dakika icin m kullanilir)
		 M : basta 0 varsa onu yazmadan ay numarasi
		 MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
		 MMM : Ay isminin ilk 3 harfi
		 MMMM : Ay isminin tamami

		 YY : yilin son iki rakamini
		 YYYY : Yilin tamamini

		 Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

		 HH : saatin tamami, tek rakamli saat olursa 02 gibi
		 H  : tek rakamli saat olursa sadece saati

		 a yazarsak AM veya PM degerini yazar

		 */

    }
}
