package day10_methodOlusturma_methodOverloading;

public class C06_AsalSayilariBulma {

    public static void main(String[] args) {

        // bir onceki class'da olusturulan method'u kullanarak
        // 3 basamakli sayilardan asal olanlari yazdirin

        for (int i = 100; i < 1000; i++) {

            if(C05_AsalSayiMiDondur.asalMiDondur(i)){ // sonucu true olanlar burda tesbit ediliyor
                System.out.print(i +" ");
            }
        }

        System.out.println("");


        //4 basamakli kac tane asal sayi vardir yazdirin.

        //bu soruda kac tane diye soruldugu icin sayac yontemini kullanmaliyiz.count=sayac
        int count=0;

        for (int i = 1000; i < 10000; i++) { //sonucu true olanlar burda tesbit ediliyor
            if(C05_AsalSayiMiDondur.asalMiDondur(i)){
                count ++;
            }
        }
        System.out.println("4 basamakli sayilardaki asal sayi adedi: "+count); //4 basamakli sayilardaki asal sayi adedi: 1061
    }
}
