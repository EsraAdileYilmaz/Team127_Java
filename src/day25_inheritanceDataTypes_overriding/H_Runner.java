package day25_inheritanceDataTypes_overriding;

public class H_Runner {

    public static void main(String[] args) {

         /*

           Ozellikler method olarak olusturulmussa=

               1 -constructor ve data turu ayni ise
                 o class'dan aramaya baslayip, parent class'lara dogru devam ederiz
                 ilk buldugumuz method calistirilir.

               2-constructor ve data turu ayni degil ise
                  data turu olan class'dan aramaya baslayip, parent class'lara dogru devam ederiz
                  eger method bulunursa, hemen calistirilmaz
                  o method'un constructor olan class'a kadar daha gunceli var mi kontrol edilir
                  daha guncel varsa guncel olan calisir.

                3_ aramaya basladigimiz class'da ve parent class'larinda method bulunamazsa
                   child class'lara donulmez, guncel var mi bakilmaz,
                   CTE olusur.

         */

        G_AvciKuslar kartal4 = new G_AvciKuslar();//burada data turu ve constructor ayni class'tandir.
        //buyuzden methodlari aramaya ayni class'tan baslanilir.parentlara dogru cikilir.
        kartal4.hareket(); // G Ucarlar
        kartal4.solunum(); // F Akcigerle
        kartal4.beslenme(); // G Et yerler
        kartal4.cogalma(); // F Yumurtayla cogalirlar
        kartal4.omur(); // E yasar ve olurler
        kartal4.kanat(); // F kanatlidir
        kartal4.gaga(); // G sivri gagalidir
        kartal4.pence(); // G pencelidirler


        F_Kuslar kartal5 = new G_AvciKuslar();//burada data turu ve constructor farkli class'lardandir.
        //buyuzden method aramaya data turunun olusturuldugu F_Kuslar class'indan baslar.
        //ama methodlarda daha gunceli aranir.bunun icin cons. olusturuldugu G_AvciKuslar class'ina kadar inilir.
        kartal5.hareket(); // G Ucarlar
        kartal5.solunum(); // F Akcigerle
        kartal5.beslenme(); // G Et yerler
        kartal5.cogalma(); // F Yumurtayla cogalirlar
        kartal5.omur(); // E yasar ve olurler
        kartal5.kanat(); // F kanatlidir
        kartal5.gaga(); // G sivri gagalidir
        //kartal5.pence(); // CTE (aranan method olmadigi icin guncelinden bahsedilemez.)


        E_Hayvanlar kartal6 = new G_AvciKuslar();//burada data turu ve constructor farkli class'lardandir.
        //buyuzden method aramaya data turunun olusturuldugu E_Hayvanlar class'indan baslar.
        //ama methodlarda daha gunceli aranir.bunun icin cons. olusturuldugu G_AvciKuslar class'ina kadar inilir.
        kartal6.hareket(); // G Ucarlar
        kartal6.solunum(); // F Akcigerle
        kartal6.beslenme(); // G Et yerler
        kartal6.cogalma(); // F Yumurtayla cogalirlar
        kartal6.omur(); // E yasar ve olurler
        //kartal6.kanat(); // CTE (aranan method olmadigi icin guncelinden bahsedilemez.)
        //kartal6.gaga(); // CTE (aranan method olmadigi icin guncelinden bahsedilemez.)
        //kartal6.pence(); // CTE (aranan method olmadigi icin guncelinden bahsedilemez.)

        F_Kuslar kus1 = new F_Kuslar();
        // constructor ve data turu ayni class'tan oldugu icin
        // kuslar class'ina gidip ilk buldugumu kullanirim.

        kus1.hareket(); // E Hareket ederler
        kus1.solunum(); // F Akcigerle
        kus1.beslenme(); // E Beslenirler
        kus1.cogalma(); // F Yumurtayla cogalirlar
        kus1.omur(); // E yasar ve olurler
        kus1.kanat(); // F kanatlidir
        kus1.gaga(); // F gagalidir
        // kus1.pence(); // CTE (aranan method olmadigi icin guncelinden bahsedilemez.)


        E_Hayvanlar kus2 = new F_Kuslar();//burada data turu ve constructor farkli class'lardandir.
        //buyuzden method aramaya data turunun olusturuldugu class'tan baslar.
        //ama methodlarda daha gunceli aranir.bunun icin cons. olusturuldugu class'a kadar inilir.
        kus2.hareket(); // E Hareket ederler
        kus2.solunum(); // F Akcigerle
        kus2.beslenme(); // E Beslenirler
        kus2.cogalma(); // F Yumurtayla cogalirlar
        kus2.omur(); // E yasar ve olurler
        //kus2.kanat(); // CTE (aranan method olmadigi icin guncelinden bahsedilemez.)
        //kus2.gaga(); // CTE (aranan method olmadigi icin guncelinden bahsedilemez.)
        //kus2.pence(); // CTE (aranan method olmadigi icin guncelinden bahsedilemez.)

        E_Hayvanlar hayvanlar1 = new E_Hayvanlar();
        // constructor ve data turu ayni class'tan oldugu icin
        // hayvanlar class'ina gidip ilk buldugumu kullanirim.
        hayvanlar1.hareket(); // E Hareket ederler
        hayvanlar1.solunum(); // E solunum yaparlar
        hayvanlar1.beslenme(); // E Beslenirler
        hayvanlar1.cogalma(); // E cogalirlar
        hayvanlar1.omur(); // E yasar ve olurler
        //hayvanlar1.kanat(); // CTE (aranan method olmadigi icin guncelinden bahsedilemez.)
        //hayvanlar1.gaga(); // CTE (aranan method olmadigi icin guncelinden bahsedilemez.)
        //hayvanlar1.pence(); // CTE (aranan method olmadigi icin guncelinden bahsedilemez.)

    }
}
