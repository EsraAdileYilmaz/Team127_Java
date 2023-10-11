package day23_inheritance;

public class G_Auris extends E_Toyota {//Toyota class'ini kendine parent class edindi

    public static void main(String[] args) {


        /*
            Bir class baska bir class'a extends ile child olursa
            o class ve o class'in parent class'larindaki tum ozelliklere
            OTOMATIK olarak sahip olur.

            Child class;
            isterse parent classlardaki ozellikleri sahiplenir,
            isterse o bilgileri gunceller (update eder),
            isterse de parent class'larda olan ozelliklere ilave olarak
                    kendi spesifik ozelliklerini ekleyebilir.

            Child class ne kadar guncelleme yaparsa,
            ozellikleri o kadar kendisine uyarlamis olur.

            Ozellikleri kendisine uyarlamazsa,
            parent class'in butun child class'lari kapsayan
            DAHA GENEL ozelliklerini sahiplenmis olur
         */

        G_Auris auris=new G_Auris();// burda bu class'tan bir obje olusturduk.

        System.out.println(auris.marka);// Toyota class'indan Toyota yazdirir
        System.out.println(auris.model);//Car class'indan model atanmamis
        System.out.println(auris.renk);// Car class'indan renk atanmamis
        System.out.println(auris.yakit);//Car class'indan yakit atanmamis
        System.out.println(auris.uretimYeri);// Toyota class'indan Japonya veya Turkiye
        System.out.println(auris.sanziman);// Toyota class'indan otomatik veya manuel
        System.out.println(auris.lastik);// Toyota class'indan Pirelli
        System.out.println(auris.guvenlik);// Toyota class'indan Toyota .....
        System.out.println(auris.aku);// Toyota class'indan aku atanmadi

        //toplamda 9 ozelligi oldu. ama bu ozelliklerde spesifik ozellikler yoktur`.
        // parent ve grand parent'taki genel ozelliklere sahiptir.
    }


}
