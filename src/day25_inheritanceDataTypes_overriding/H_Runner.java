package day25_inheritanceDataTypes_overriding;

public class H_Runner {

    public static void main(String[] args) {

         /*

           Ozellikler method olarak olusturulmussa=

               1 -constructor ve data turu ayni ise
                 o class'dan aramaya baslayip, parent class'lara dogru devam ederiz,
                 ilk buldugumuz method calistirilir.

               2-constructor ve data turu ayni degil ise
                  data turu olan class'dan aramaya baslayip, parent class'lara dogru devam ederiz
                  eger method bulunursa, hemen calistirilmaz
                  o method'un constructor olan class'a kadar daha gunceli var mi kontrol edilir
                  daha guncel varsa guncel olan calisir.

                3_ aramaya basladigimiz class'da ve parent class'larinda method bulunamazsa
                   child class'lara donulmez, guncel var mi bakilmaz,
                   CTE olusur.

                4-Constructor nerdeyse obje orda olusur.

         */

        G_AvciKuslar kartal4 = new G_AvciKuslar();//burada data turu ve constructor ayni class'tandir.
        //buyuzden methodlari aramaya ayni class'tan baslanilir.parentlara dogru cikilir.
        kartal4.hareket(); // G ucarlar
        kartal4.solunum(); // F akcigerle nefes alirlar
        kartal4.beslenme(); // G et yerler
        kartal4.cogalma(); // F yumurtayla cogalirlar
        kartal4.omur(); // E yasar ve olurler
        kartal4.kanat(); // F kanatlidirlar
        kartal4.gaga(); // G sivri gagali
        kartal4.pence(); // G pencelidir


        F_Kuslar kartal5 = new G_AvciKuslar();//burada data turu ve constructor farkli class'lardandir.
        //buyuzden method aramaya data turunun olusturuldugu F_Kuslar class'indan baslar.
        //ama methodlarda daha gunceli aranir.bunun icin cons. olusturuldugu G_AvciKuslar class'ina kadar inilir.
        kartal5.hareket(); // G ucarlar
        kartal5.solunum(); // F akcigerle nefes alirlar
        kartal5.beslenme(); // G et yerler
        kartal5.cogalma(); // F yumurtayla cogalirlar
        kartal5.omur(); // E yasar ve olurler
        kartal5.kanat(); // F kanatlidir
        kartal5.gaga(); // G sivri gagali
        //kartal5.pence(); // CTE (aranan method F_Kuslar class'inda olmadigi icin guncelinden bahsedilemez.)


        E_Hayvanlar kartal6 = new G_AvciKuslar();//burada data turu ve constructor farkli class'lardandir.
        //buyuzden method aramaya data turunun olusturuldugu E_Hayvanlar class'indan baslar.
        //ama methodlarda daha gunceli aranir.bunun icin cons. olusturuldugu G_AvciKuslar class'ina kadar inilir.
        kartal6.hareket(); // G ucarlar
        kartal6.solunum(); // F akcigerle nefes alirlar
        kartal6.beslenme(); // G et yerler
        kartal6.cogalma(); // F yumurtayla cogalirlar
        kartal6.omur(); // E yasar ve olurler
        //kartal6.kanat(); // CTE (aranan method E_Hayvanlar class'inda olmadigi icin guncelinden bahsedilemez.)
        //kartal6.gaga(); // CTE (aranan method E_Hayvanlar class'inda olmadigi icin guncelinden bahsedilemez.)
        //kartal6.pence(); // CTE (aranan method E_Hayvanlar class'inda olmadigi icin guncelinden bahsedilemez.)

        F_Kuslar kus1 = new F_Kuslar();
        // constructor ve data turu ayni class'tan oldugu icin
        // kuslar class'ina gidip ilk buldugumu kullanirim.

        kus1.hareket(); // E hareket ederler
        kus1.solunum(); // F akcigerle nefes alirlar
        kus1.beslenme(); // E beslenirler
        kus1.cogalma(); // F yumurtayla cogalirlar
        kus1.omur(); // E yasar ve olurler
        kus1.kanat(); // F kanatlidirlar
        kus1.gaga(); // F gagalari vardir
        // kus1.pence(); // CTE (aranan method F_Kuslar class'inda olmadigi icin guncelinden bahsedilemez.)


        E_Hayvanlar kus2 = new F_Kuslar();//burada data turu ve constructor farkli class'lardandir.
        //buyuzden method aramaya data turunun olusturuldugu class'tan baslar.
        //ama methodlarda daha gunceli aranir.bunun icin cons. olusturuldugu class'a kadar inilir.
        kus2.hareket(); // E hareket ederler
        kus2.solunum(); // F akcigerle nefes alirlar
        kus2.beslenme(); // E beslenirler
        kus2.cogalma(); // F yumurtayla cogalirlar
        kus2.omur(); // E yasar ve olurler
        //kus2.kanat(); // CTE (aranan method E_Hayvanlar class'inda olmadigi icin guncelinden bahsedilemez.)
        //kus2.gaga(); // CTE (aranan method E_Hayvanlar class'inda olmadigi icin guncelinden bahsedilemez.)
        //kus2.pence(); // CTE (aranan method E_Hayvanlar class'inda olmadigi icin guncelinden bahsedilemez.)

        E_Hayvanlar hayvanlar1 = new E_Hayvanlar();
        // constructor ve data turu ayni class'tan oldugu icin
        // hayvanlar class'ina gidip ilk buldugumu kullanirim.
        hayvanlar1.hareket(); // E hareket ederler
        hayvanlar1.solunum(); // E nefes alirlar
        hayvanlar1.beslenme(); // E beslenirler
        hayvanlar1.cogalma(); // E cogalirlar
        hayvanlar1.omur(); // E yasar ve olurler
        //hayvanlar1.kanat(); // CTE (aranan method E_Hayvanlar class'inda olmadigi icin guncelinden bahsedilemez.)
        //hayvanlar1.gaga(); // CTE (aranan method E_Hayvanlar class'inda olmadigi icin guncelinden bahsedilemez.)
        //hayvanlar1.pence(); // CTE (aranan method E_Hayvanlar class'inda olmadigi icin guncelinden bahsedilemez.)

    }
}
