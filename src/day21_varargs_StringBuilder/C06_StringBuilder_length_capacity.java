package day21_varargs_StringBuilder;

public class C06_StringBuilder_length_capacity {

    public static void main(String[] args) {

        /*
        StringBuilder Class'i String gibi calisir ama mutable bir class'dir.
        String methodlarinin cogu kullanilabilir.
        Ayrica ;
        capacity() methodu ile kapasitesi bulunur ve sinirlandirilabilir.
        length() methodu ile uzunlugu bulunabilir.
        trimToSize() methodu ile  kapasite ve length'i esitlenebilir.

         */
        //Oncelikle StringBuilder class'indan obje olusturulur.or:sb1 ,sb2 ,...
        StringBuilder sb1= new StringBuilder();//icinde hic bir yazi yok, length ==> 0
        System.out.println("sb1 length: "+ sb1.length());//0
        System.out.println("sb1 capacity:"+ sb1.capacity());//16 standart kapasitedir

        StringBuilder sb2= new StringBuilder("Ali Can");
        System.out.println("sb2 length: "+ sb2.length());//sb2 length: 7 (icindeki Ali Can indexlerinin toplami)
        System.out.println("sb2 capacity:" + sb2.capacity());//sb2 capacity:23 (standart kapasite=16+7=23)

        StringBuilder sb3= new StringBuilder(11);// // icinde hic bir yazi yok, length ==> 0
        System.out.println("sb3 length:"+ sb3.length());// sb3 length:0
        System.out.println("sb3 capacity:"+ sb3.capacity());// sb3 capacity:11 (kapasitesini belirleyerek sinirlandirdik)

        // Eger StringBuilder'a ekleme yaparsaniz,
        // java eklenecek metni de alabilmesi icin kapasitesini otomatik olarak genisletir.
        // sb'in kapasitesitini=( 2 * eski capacity + 2 ) seklinde genisletir.

        sb2.append(" okula gitmek istiyor.");
        System.out.println("sb2 :"+ sb2);// sb2 :Ali Can okula gitmek istiyor.
        System.out.println("sb2 length:"+ sb2.length());// sb2 length:29
        System.out.println("sb2 capacity: "+ sb2.capacity());// sb2 capacity: 48 = 2 * 23 +2 (eski capacity=23)

        // Eger kapasite ve length'i esitlemek isterseniz; trimToSize() bu method kullanilir.

        sb2.trimToSize();
        System.out.println("sb2: "+sb2);// sb2: Ali Can okula gitmek istiyor.
        System.out.println("sb2 length: "+ sb2.length());// sb2 length: 29
        System.out.println("sb2 capacity: "+ sb2.capacity());// sb2 capacity: 29
        //capacity 48 iken length 'in uzunluguyla esitledi.

    }
}
