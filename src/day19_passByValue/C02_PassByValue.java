package day19_passByValue;

public class C02_PassByValue {

    public static void main(String[] args) {

        int sayi =20;

        System.out.println("method call oncesi sayi : "+ sayi);//20

        System.out.println("Method return degeri "+ sayiDegistir(sayi));//25
        //burada dondurulen sayi methodun sayi degeridir.yani return sayi'dir.

        System.out.println("method call sonrasi sayi: "+ sayi);// 20 Bu sayi ise main'deki sayidir.

        sayi =sayiDegistir(sayi);//main'deki sayi= return sayi. return sayinin degerini main sayiya atadik.
        //sayi=return sayi degeri=25 oldu

        System.out.println("Atama sonrasi sayi:"+ sayi);//25 Main'deki deger degisti

        /*
        burada method 2 kere calisti:
        1)yazdirma isleminde. 11.satirda
        2)atama isleminde. 16.satirda
         */
    }

    public static int sayiDegistir(int sayi) {//local'de yeni bir variable olustu.int sayi=20; variable'i olustu.
                                               //sadece main methoddaki sayinin degeri buraya aktarilir.

        sayi +=5; //methoddaki variable'in degeri 5 artti.
        System.out.println("method icinde sayi :"+ sayi);

        return sayi;// bu sayi methoddaki sayidir.
    }
}
