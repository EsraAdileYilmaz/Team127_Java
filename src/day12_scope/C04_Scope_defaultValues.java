package day12_scope;

public class C04_Scope_defaultValues {

    String str = "Java";
    String str2 ;
    int sayi = 23;
    int sayi2;

    static boolean bl = true;
    static boolean bl2;
    static char chr = 'a';
    static char chr2;

    /*
    Class level'da olusturulmus ancak deger atanmamis variable'lara
    java default degerler (default values) atar.
    Ve bu deger atanmamis variable'lar kullanilabilir.
     */


    public static void main(String[] args) {

        String metin;

        // System.out.println(metin); deger atanmadigi icin kullanilamaz

        // System.out.println(str);
        // System.out.println(sayi);
        System.out.println(bl); // true
        System.out.println(bl2); // false (default deger atandi)
        System.out.println(chr); // a
        System.out.println(chr2); // hiclik (default deger atandi)


        // staticOlmayanMethod();
        // Non-static method 'staticOlmayanMethod()' cannot be referenced from a static context
        // static olan main method icerisinden static olmayan bir method direk CAGRILAMAZ. yani method Call yapilamaz

        // static method'lar icerisinden,
        // static olmayan (instance) class uyelerine ulasmak istersek
        // obje olusturmamiz gerekir. OBJE=Class anahtari

        //OBJE OLUSTURMA==> CLASS ADI+ OBJE ADI=new +CLASS ADI();
        //Obje olusturduktan sonra instance variable'lara ve
        //static olmayan methodlara ulasabiliriz.

        C04_Scope_defaultValues obj = new C04_Scope_defaultValues();
        obj.staticOlmayanMethod();

    }

        /*
        Local variable'lar deger atamadan olusturulabilir
        ANCAK deger atanmadan KULLANILAMAZ.

        Class level variable'lar ise
        ister static olsun, ister static olmasin
        deger atamadan olusturulabilir
        VE deger atanmadan da KULLANILABILIR.

        Class level variable'lara biz deger ATAMAZSAK
        Java default olarak belirledigi degerleri ATAR.

        Default Java Degerleri=
        char ==> hiclik
        boolean ==> false
        sayisal primitive'ler ==> 0
        non-primitive'ler ==> null 'dir.

     */

    public void staticOlmayanMethod(){

        System.out.println(str); // Java
        System.out.println(str2); // null
        System.out.println(sayi); // 23
        System.out.println(sayi2); // 0
    }

}
