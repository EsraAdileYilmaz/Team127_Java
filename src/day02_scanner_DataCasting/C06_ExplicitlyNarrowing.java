package day02_scanner_DataCasting;

public class C06_ExplicitlyNarrowing {
    public static void main(String[] args) {

        int sayi=20;
        byte byt= (byte)sayi; // data cast edilirken () parantezler arasina manuel olarak yazilir
        System.out.println("20 'nin byte olarak karsiligi: " +byt); //20 'nin byte olarak karsiligi: 20

        sayi=130;
        byt=(byte)sayi;// int'i byte cevir ve ata
        System.out.println("130'un byte olarak karsiligi: " +byt);//130'un byte olarak karsiligi: -126

        sayi=256;
        byt=(byte)sayi;
        System.out.println("256'nin byte olarak karsiligi: " +byt);//256'nin byte olarak karsiligi: 0


        sayi=567;
        byt=(byte)sayi;
        System.out.println("567'nin byte olarak karsiligi: " +byt);//567'nin byte olarak karsiligi: 55

        sayi=640;
        byt=(byte)sayi; //int'i byte cevir ve ata
        System.out.println("640'in byte olarak karsiligi: " +byt);//640'in byte olarak karsiligi: -128


        double dbl=34.7;
        sayi=(int)dbl;//double'i int'e cevir ve ata
        System.out.println("34.7'nin int olarak degeri: "+ sayi);//34.7'nin int olarak degeri: 34
         /*
         int bir tamsayi oldugu icin ondalikli sayilar cast edildiginde ondalik kismini silip atar
         sadece tamsayi kismini alir
          */

        /*
            String str = (String)sayi ;
            Explicit casting her data turu icin calismaz.
            Biz simdilik sayisal primitive data turlerinde
            genis degerli variable 'i dar kapsamli variable'a atamak icin kullaniyoruz.
            Non-primitive data turlerinde de olur,
            ancak parent-child class'lar arasinda gecerlidir
         */


    }
}
