package day20_immutableClasses;

public class C02_StringPool {

    public static void main(String[] args) {


        String str1 = "Java";
        String str2 = "java";
        String str3 = "Java";
        String str4 = new String("Java" );
        String str5 = "Ja" + "va";
        String str6 = "Ja";
        String str7 = "va";
        String str8 = str6+str7;

        /*
        equals() methodu ile karsilastirma yapilirken sadece metinler esas alinir.
        Metinler ayni ise true,deilse false dondurur.

        ==(double equal sign) ile karsilastirma yapilirken ise hem metinler hemde referanslar
        esas alinir.Metinler ayni fakat referanslari(havuz ici durumu) farkli ise yine de
        false dondurur.Hem metinler ayni, hemde ayni referanstan (ayni havuzdan) geliyorsa ancak ozaman
        true dondurur.
         */

        System.out.println(str1 == str3); // true (basit yontemle olusturulduklari icin ayni referansa sahipler.)
        System.out.println(str1 == str4); // false (str1 basit yontemle, str4 new keywordu ve yeni ref ile olustugu icin false dondu)
        System.out.println(str1 == str5); // true (basit yontemle olusturulduklari icin ayni referansa sahipler.)
        System.out.println(str1 == str8); // false (str1 basit yontemle str8 islem yapilarak,yeni ref ile olustugu icin false dondu)
        System.out.println(str1 == "Java"); // true (basit yontemle olusturulduklari icin ayni referansa sahipler.)

        /*
            Basit sekilde olusturulan String objeler icin
            Java oncelikle bir String Pool olusturur ve bu String Pool'u kontrol eder.
            Eger Pool'da ayni degere sahip baska bir String varsa,
            yeni obje ile eski objenin referansini ve degerini eslestirir.

            ==(double equal sign) kullaniminda havuzda olan ve degeri ayni olanlar true verir,
            havuzda olmayanlarin true verme ihtimali yoktur.
         */


    }
}
