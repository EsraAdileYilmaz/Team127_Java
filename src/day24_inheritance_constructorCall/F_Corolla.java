package day24_inheritance_constructorCall;

public class F_Corolla extends E_Toyota {


    String model="Corolla";//bunu update ettik.bunlar grand parent class'tan geliyor.
    String uretimYeri="Turkiye";//bunu update ettik.bunlar grand parent class'tan geliyor.
    String lastik="Pirelli Sakarya";//bunu update ettik.bunlar parent class'tan geliyor.
    String aku="Inci aku";//bunu update ettik.bunlar parent class'tan geliyor.
    String tekerCapi="19 inc";
    String guvenlik="Safe drive";//bunu update ettik.bunlar parent class'tan geliyor.
    String bagajHacmi="200 litre";

    F_Corolla(){//parametresiz cons.

        super();//once parent'taki parametresiz constructor calisir.
    }

    public static void main(String[] args) {

        F_Corolla corolla1= new F_Corolla();
        //bu class'tan bir obje olusturduk.simdi parent ve
        //grand parent'taki tum ozellikleri kullanacagiz.


        System.out.println(corolla1.marka);// Toyota class'indan Toyota yazdirir
        //marka yi aramaya corolla class'indan baslar.
        //sonra E_Toyota class'ina sonra da D_Car class'ina bakar.
        //asagidan yukariya dogru arama yapar.en guncel halini hangi class'ta bulursa
        //ordakini yazdirir.diger classtakiler gecersiz olur.
        System.out.println(corolla1.model);//Corolla class'indan Corolla yazdirir
        System.out.println(corolla1.renk);// Car class'indan renk atanmamis yazdirir
        System.out.println(corolla1.yakit);// Car class'indan yakit atanmamis
        System.out.println(corolla1.uretimYeri);// Corolla class'indan Turkiye yazdirir
        System.out.println(corolla1.sanziman);// Toyota class'indan otomatik veya manuel
        System.out.println(corolla1.lastik);// Corolla class'indan Pirelli Sakarya yazdirir
        System.out.println(corolla1.guvenlik);// Corolla class'indan Safe drive yazdirir
        System.out.println(corolla1.aku);//Corolla class'indan inci aku yazdirir
        System.out.println(corolla1.tekerCapi);// Corolla class'indan 19 inc yazdirir
        System.out.println(corolla1.bagajHacmi);//Corolla class'indan 200 litre yazdirir

        // toplamda 11 ozellige sahip oldu.parent ve grand parent class'lardaki tum ozelliklere
        //sahip oldu.

        /*
            Bir obje olusturuldugunda
            ilk deger atamasi (initialization) icin MUTLAKA constructor calismalidir.
            Child class'da olusturulan bir objenin,
            parent class(lar)'daki ozellikleri de tasimasi icin
            parent class(lar)'daki CONSTRUCTOR'lar da CALISMALIDIR.

            Java bunun icin ozel bir konsept olusturmustur:
            Java'nin olusturulan her class'a
            obje olusturulmasina izin vermek icin
            DEFAULT CONSTRUCTOR koydugu gibi,

            AYNI SEKILDE
            extends kullanan her class'da olusturulan
            HER CONSTRUCTOR'in ilk satirina da
            super() koyar. super() =super constructor call, bu default'ta olabilir.
            super() sayesinde parent class'in constructor'una gider ve
            oradaki ozellikleri alir.
         */



    }


}
