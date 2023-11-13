package day36_lesQuestions;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

public class C02_Random {

    public static void main(String[] args) {

         /*
         SORU=
        Bir uygulama ile bir Arraye random olarak oluşturulan 10 tarih ekleyin.
        Ve bu tarihleri en eskiden yeniye doğru sıralayınız.
        Yil degiskeni icin 2013 ila 2023 arasinda random sayi uretin.
        Ay degiskeni icin 1 ila 12 arasinda random sayi uretin.
        Gun degiskeni icin 1 ila 28 arasinda random sayi uretin.
        LocalDate classini kullanarak,
        bu uc degiskeni bir method icine gonderin ve random tarih uretin.
        */

        //LocalDate class'indan bir array olusturuyoruz.ve soruda istendigi gibi 10 elementli belirliyoruz.
        LocalDate [] tarihler=new LocalDate[10];//[0,0,0........]

        //simdi bir for loop ile herbir array'i tarihUret() methoduna atayalim.
        for (int i = 0; i < tarihler.length ; i++) {
          tarihler[i]=tarihUret();
        }

        //method olusturduktan sonra,olusturulan tarihleri siralayalim.
        Arrays.sort(tarihler);

        System.out.println(Arrays.toString(tarihler));
    }

    public static LocalDate tarihUret() {

         // Yil degiskeni icin 2013 ila 2023 arasinda random sayi uretin.
        // Ay degiskeni icin 1 ila 12 arasinda random sayi uretin.
        //Gun degiskeni icin 1 ila 28 arasinda random sayi uretin.

        Random random=new Random();//Rastgele sayilar icin bu classtan faydalaniyoruz
        int yil= random.nextInt(10)+2013;
        //0 ile 10 arasinda bir sayi uretecekken +2013 yaptigimizda baslangic sayisini 2013 olarak belirledik.
        //yani 2013'ten basla 2013+10=2023 son tarih olsun.random(2013,2023)'a araliginda yil uret dedik.
        int ay= random.nextInt(11)+1;//1.aydan basla 11+1=12. aya kadar ay uret.
        int gun=random.nextInt(27)+1;//1.gunden basla 1+27=28 araliginda gun uret.

        LocalDate localDate=LocalDate.of(yil,ay,gun);
        //LocalDate [] tarihler array'inin herbir elementi (yil,ay,gun) icerir.

        return localDate;
    }
}
