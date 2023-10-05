package day21_varargs_StringBuilder;

public class C05_Varargs_ChosesConsiderer {

    // SORU:istenen kadar int parametre alip
    //      ilk sayi disindaki tum sayilari toplayip
    //      bulunan toplami ilk sayi ile carpip yazdiran
    //      bir method olusturun

    public static void main(String[] args) {

        islem1(1,2,3,4,5,6);// 20 = 1 * 20
        islem1(2,3,0);// 6 2*3
        islem1(0,3);// 0  0*3
        islem1(1);// 0  1* 0 burada geriye kalanlar bos bir array[] olur, 0 method'daki toplama bizim atadigimiz ilk deger

        // SORU:istenen kadar int parametre alip
        //      son sayi disindaki tum sayilari toplayip
        //      bulunan toplami son sayi ile carpip yazdiran
        //      bir method olusturun





    }

   /*public static void islemYapSon(int... toplanacakSayilar, int sonSayi){
        // Vararg parameter must be the last in the list

    }
        Varargs alacagi element sayisi konusunda sinir tanimadigindan
        tum elementleri almak ister.
        Bundan dolayi bir method'da parametre olarak varargs yazilacaksa,
        EN SON parametre olarak yazilmalidir.
        Bu sebeple bir method'da
        2 varargs parametre de KULLANILAMAZ


    */
    public static void islem1(int ilkSayi,int... geriyeKalanlar){

        int toplam=0;

        for (int each:geriyeKalanlar
             ) {
            toplam+=each;
        }

        System.out.println(ilkSayi * toplam);

    }
}
