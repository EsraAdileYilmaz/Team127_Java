package day19_passByValue;

public class C03_PassByValue {

    public static void main(String[] args) {

        // Main method’da verilen fiyat degerine %10, %20 ve %30 indirim yaparak,
        // indirimli fiyati bize döndüren 3 method olusturun.
        // Main method’dan bu 3 method’u arka arkaya cagirip,
        // return edilen fiyatlari yazdirin.

        double fiyat= 100;//buradaki degerde hicbir sey degismez.

        System.out.println("% 10 indirimli fiyat : "+ indirim10(fiyat));//% 10 indirimli fiyat : 90.0
        System.out.println("% 20 indirimli fiyat : "+ indirim20(fiyat));//% 20 indirimli fiyat : 80.0
        System.out.println("% 30 indirimli fiyat : "+ indirim30(fiyat));//% 30 indirimli fiyat : 70.0


        System.out.println("indirimli fiyatlar yazdirildiktan sonra fiyat : "+ fiyat);//bu fiyat main icinde olusturulan variable'dir.
        //indirimli fiyatlar yazdirildiktan sonra fiyat : 100.0 kalir,degismez.



    }

    public static double indirim10(double fiyat){//buraya sadece fiyat variable'inin degeri atanir
                                                 //burdaki double fiyat baska bir variable'dir.

        fiyat= fiyat * 90/100;
        return fiyat;
    }

    public static double indirim20(double fiyat){//buraya sadece fiyat variable'inin degeri atanir
                                                //burdaki double fiyat baska bir variable'dir.


        fiyat =fiyat * 80/100;
        return fiyat;
    }

    public static double indirim30(double fiyat){//buraya sadece fiyat variable'inin degeri atanir
                                                //burdaki double fiyat baska bir variable'dir.


        fiyat = fiyat * 70/100;
        return fiyat;
    }
}
