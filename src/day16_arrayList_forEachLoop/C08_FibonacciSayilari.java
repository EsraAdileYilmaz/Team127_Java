package day16_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C08_FibonacciSayilari {

    public static void main(String[] args) {

        //Soru 5- Verilen pozitif tamsayidan kucuk
        //        Fibonacci sayilarini bir liste olarak bize donduren
        //        bir method olusturun.
        //        ornegin 56 ya kadar olan fibonacci sayilarini listeleyelim


        //method call yapalim.
        System.out.println(fibonacciListesi(56));//[0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55]  56'ya kadar olan fibonacci sayilari

        System.out.println(fibonacciListesi(14));//[0, 1, 1, 2, 3, 5, 8, 13] 14'e kadar olan fibonacci sayilari

        System.out.println(fibonacciListesi(345));
        //[0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233] 345'e kadar olan fibonacci sayilari


    }

    public static List<Integer> fibonacciListesi (int verilenSayi){

        List<Integer> fibonacciListesi=new ArrayList<>();

        if(verilenSayi ==0){
            //verilen sayi 0 ise dizideki ilk sayi eklenir
            fibonacciListesi.add(0);
        } else if (verilenSayi == 1) {
            //verilen sayi 1 ise dizideki ilk 3 sayi eklenir.
            fibonacciListesi.add(0);
            fibonacciListesi.add(1);
            fibonacciListesi.add(1);

        }else { //verilen sayi 1 'den buyukse

            //1.Adim: dizideki ilk 3 sayi eklenir
            fibonacciListesi.add(0);//0.index
            fibonacciListesi.add(1);//1.index
            fibonacciListesi.add(1);//2.index

            //2.Adim:bir loop ile dizideki 3.sayidan sonrasi list'e eklenir.
            int index=3;//ilk 2 indexi ekledigimiz icin 3. indexten baslattik
            int yeniSayi;//listeye eklenecek olan sayi

            do {
                yeniSayi=fibonacciListesi.get(index-1)+ fibonacciListesi.get(index-2);

                if(yeniSayi <= verilenSayi){
                    fibonacciListesi.add(yeniSayi);
                }
                index ++;
            }while (yeniSayi <= verilenSayi);
        }
        return fibonacciListesi;
    }
}
