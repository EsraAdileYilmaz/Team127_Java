package day29_exceptions_garbageCollector;

public class C04_DifferentsExceptions {

    public static void main(String[] args) {

        String str="Java Candir";

        // Integer sayi=str;

        Object obj=str; // arada parent-child iliskisi oldugundan auto-widening olur.

        // Integer sayi= (Integer) obj; // Arada parent-child iliskisi oldugundan explicit narrowing yapilabilir
        // System.out.println(sayi); // ClassCastException firlatir.


      // Arama sonuc sayisinin 100'den fazla oldugunu test edin.
        String aramaSonucuStr= "123"; //NumberFormatException (verirdi String aramaSonucuStr= "123A"; olsaydi)
        Integer aramaSonucuInt=Integer.parseInt(aramaSonucuStr);

        if(aramaSonucuInt>100){
            System.out.println("Arama sonucu 100'den buyuk, test PASSED");
        }else{
            System.out.println("Arama sonucu 100'den buyuk degil, test FAILED");
        }




    }
}
