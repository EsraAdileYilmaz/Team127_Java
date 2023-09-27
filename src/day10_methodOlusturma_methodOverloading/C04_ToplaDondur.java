package day10_methodOlusturma_methodOverloading;

public class C04_ToplaDondur {

    public static void main(String[] args) {


        //SORU: Verilen 3 sayinin toplamini donduren bir method olusturun

        // Sonuc donduren method'lar call edildiginde
        // sonucu call edilen yere getirir
        // bundan sonra yapilacak sey kodu yazan kisiye baglidir
        // 1- ya return edilen sonucu direk yazdirabilir
        // 2- ya da daha sonra kullanilmak uzere bir variable'a atayabilir


        // direk yazdirilabilir
        System.out.println(toplaDondur(1.5,2.5,4)); //8.0

        //bir variable atayabiliriz
        double toplam=toplaDondur(2.4,7.9,8);
        System.out.println(toplam); //18.3 olarak toplami goruruz


    }

    public static double toplaDondur(double sayi1, double sayi2 ,double sayi3){

        double toplam=sayi1+ sayi2 + sayi3;
        return toplam;
    }
}
