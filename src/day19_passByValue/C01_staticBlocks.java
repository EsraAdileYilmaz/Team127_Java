package day19_passByValue;

public class C01_staticBlocks {

    C01_staticBlocks(){

        System.out.println("Constructor calisti");
    }

    static {

        System.out.println("Static block calisti");

        /*
            Eger class calismaya baslamadan once
            belirli ayarlari yapmak isterseniz
            static block olusturabilirsiniz.

            static block'lar class'daki HERSEYDEN
            hatta main method'dan bile
            once calisirlar.

            Birden fazla static block varsa,
            kendi iclerinde once ustteki calisir.
            Sonra yukaridan asagiya dogru siralanir.

            Class icerisinde heryerde olusturulabilir.
         */

    }

    {
        System.out.println("Static olmayan block");
        /*
            obje olusturmadan once
            yapilmasi gereken on ayarlar varsa static olmayan block
            olustururlur.
            {}

            Static olmayan block'lar obje olusturmadan once calisir.
            ve her objeden once ayri ayri calisir.
            constructor'dan da once calisir.
         */
    }


    public static void main(String[] args) {

        System.out.println("main method calisti");

        C01_staticBlocks obj =new C01_staticBlocks();//1.objemiz
        C01_staticBlocks obj2 =new C01_staticBlocks();//2.objemiz

    }

    static {

        System.out.println("Alttaki static block calisti.");
    }

    /*
    JAVANIN CALISMA SIRASI=
   1. Static block calisti
   2. Alttaki static block calisti.
   3. main method calisti
   4. Static olmayan block
   5. Constructor calisti
   6. Static olmayan block
   7. Constructor calisti

   yani 1.sirada static blocks
        2.sirada main method
        3.sirada static olmayan blocks
        4.sirada constructors

     */
}
