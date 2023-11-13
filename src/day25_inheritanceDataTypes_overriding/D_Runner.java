package day25_inheritanceDataTypes_overriding;

public class D_Runner {

    public static void main(String[] args) {


         /*
            Bir obje olusturulurken
            Data turu ve constructor ayni class'dan ise
            variable'larin hangi degeri alacagini bulmak icin
            ilgili class'a gidip aramaya baslariz
            parent class'lara dogru aramaya devam ederiz
            ilk buldugumuz yani en guncel olan deger
            gecerli deger olur.

            Java bir objenin data turu olarak
            constructor'in oldugu class
            veya parent class'lari kabul eder.

            Eger data turu, constructor'in parent'i ise
            aramaya DATA TURUnun oldugu class'dan baslanir
            parent class'lara dogru aramaya devam edilir
            ilk bulunan deger kullanilir.
         */

        C_AvciKuslar kartal1 = new C_AvciKuslar();//burada objenin data turu ile objenin constructor'i
        //ayni classtadir. buyuzden variablelari aramaya kendi class'indan baslar.
        System.out.println(kartal1.hareket); // C Ucarlar
        System.out.println(kartal1.solunum); // B akcigerle nefes alirlar
        System.out.println(kartal1.beslenme); // C et yerler
        System.out.println(kartal1.cogalma); // B yumurtayla cogalirlar
        System.out.println(kartal1.omur); // A yasar ve olurler
        System.out.println(kartal1.kanat); // B Kanatlidirlar
        System.out.println(kartal1.gaga); // C sivri gagalidir
        System.out.println(kartal1.pence); // C pencelidir


        B_Kuslar kartal2 = new C_AvciKuslar();//burda objenin data turu ile objenin constructor'i
        //farkli classlardandir.buyuzden variablelari aramaya data turunun oldugu B_Kuslar class'indan baslar.
        System.out.println(kartal2.hareket); // A hareket ederler
        System.out.println(kartal2.solunum); // B akcigerle nefes alirlar
        System.out.println(kartal2.beslenme); // A beslenirler
        System.out.println(kartal2.cogalma); // B yumurtayla cogalirlar
        System.out.println(kartal2.omur); // A yasar ve olurler
        System.out.println(kartal2.kanat); // B kanatlidirlar
        System.out.println(kartal2.gaga); // B gagalidir
        //System.out.println(kartal2.pence); // CTE


        A_Hayvanlar kartal3 = new C_AvciKuslar();//burda objenin data turu ile objenin constructor'i
        //farkli classlardandir.buyuzden variablelari aramaya data turunun oldugu A_Hayvanlar class'indan baslar.
        System.out.println(kartal3.hareket); // A hareket ederler
        System.out.println(kartal3.solunum); // A solunum yaparlar
        System.out.println(kartal3.beslenme); // A beslenirler
        System.out.println(kartal3.cogalma); // A cogalirlar
        System.out.println(kartal3.omur); // A yasar ve olurler
        //System.out.println(kartal3.kanat); // CTE
        //System.out.println(kartal3.gaga); // CTE
        //System.out.println(kartal3.pence); // CTE


    }
}
