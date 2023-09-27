package day02_scanner_DataCasting;

public class C05_DataCasting {
    public static void main(String[] args) {

        int sayiInt=34;
        String str="Java Candir";
        boolean bl=true;
        char chr='%';
        double dbl=4.5;
        byte byt=10;
        short shrt=23;

        //Data casting : bir data turundeki variable'a baska data turunden deger atamaya denir.

        // bl =sayiInt;
        // bl=str;
        //bl=chr;
        //**boolean data turundeki bir variable'a sadece boolean degerler atayabilirsiniz

        //str=sayiInt;
        //str=bl;
        //str=chr;

        //sayisal degerler alan variable'lara baska sayisal data turlerindeki degerler ATANABILIR MI?

        dbl=sayiInt;
        dbl=byt;
        dbl=shrt;
        dbl=chr;
        /*
         double en genis kapsamli sayi oldugu icin ,icine diger tum sayilari rahatlikla atayabiliriz.
         yani data casting otomatik(Auto widening) olarak yapilabilir.

         bu sayilari kap gibi dusunursek,kucuk kaptan buyuk kaba malzeme bosaltirken sorun cikmaz.
         ama buyuk kaptan kucuk kaba malzeme bosaltirken sorun cikabilir.cunku icindeki malzeme
         miktarini bilemeyiz.bunu da zorla bosaltiriz diyelim.iste bu explicity narrowing oluyor.
         */

       // sayiInt=dbl; (double int'ten daha buyuk oldugu icin otomatik olarak atayamayiz)
        sayiInt=shrt;
        sayiInt=byt;
        sayiInt=chr;

        //shrt=dbl;
        //shrt=sayiInt;
        shrt=byt;
        //shrt=chr;

        /*
        yani dar kapsamli bir variable 'a genis kapsamli bir variable'i otomatik olarak
        atayamayiz.

         */


    }
}
