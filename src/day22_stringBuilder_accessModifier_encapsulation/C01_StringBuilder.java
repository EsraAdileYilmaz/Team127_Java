package day22_stringBuilder_accessModifier_encapsulation;

public class C01_StringBuilder {

    public static void main(String[] args) {

        /*
        reverse() methodu ile tum metin ters cevrilebilir.
        compareTo() methodu ile iki StringBuilder'in ayni olup olmadigi karsilastirilir.
        Buna karsin equals() methodu ile  karsilastirma YAPILAMAZ.
        (==) ile de karsilastirma YAPILAMAZ.

       replace() methodu ile baslangic indexi, bitis indexi ve
                             update etmek istedigimiz metni yaziyoruz.

         */

        StringBuilder sb= new StringBuilder("Java Candir");
        sb.reverse();// metni ters cevirdik.
        System.out.println(sb);// ridnaC avaJ
        sb.reverse();//tekrar ters cevirirsek metin eski haline doner.
        System.out.println(sb);// Java Candir

        StringBuilder sb2= new StringBuilder("Java Guzeldir");
        StringBuilder sb3= new StringBuilder("Hava Guzel");
        StringBuilder sb4= new StringBuilder("Ne bu simdi?");
        StringBuilder sb5= new StringBuilder("Java Candir");

        System.out.println(sb.compareTo(sb2));// -4
        System.out.println(sb.compareTo(sb3));// 2
        System.out.println(sb.compareTo(sb4));// -4
        System.out.println(sb.compareTo(sb5));// 0

        System.out.println(sb.equals(sb5));// false

          /*
            StringBuilder'larin esitligini anlamak icin equals() methodu KULLANILAMAZ.
            Eger iki StringBuilder'in ayni oldugunu kontrol etmek istersek;
            compareTo() mehodunu kullaniriz.
            sb1.compareTo(sb2) yazariz; sonuc olarak bize 0 dondururse iki StringBuilder birebir aynidir.
            Ayni degilse bastan kontrol ederek ilerler
            ve buldugu ilk farkli harflerin arasinda (ascii table) kac sayi oldugunu dondurur.
         */

         /*
            Bir String ve bir StringBuilder karsilastirilabilir mi ?
            Java'da farkli non-primitive datalar == ile karsilastirilamaz.
            Bir String ile bir StringBuilder'i
            equals() ile karsilastirmaniza java CTE vermez,
            AMA metinler ayni olsa bile false doner.True donme ihtimali yoktur.
         */

        String str= "Java Candir";
        // System.out.println(str == sb); CTE verir.
        //Operator '==' cannot be applied to 'java.lang.String', 'java.lang.StringBuilder'

       System.out.println(str.equals(sb));// false java CTE vermez ama herzaman false dondurur.

        sb.replace(0,4,"Hava");//sb'nin 0.indexi ile 4.indexi arasina Hava kelimesini update et.
        System.out.println(sb);// Hava Candir



    }
}
