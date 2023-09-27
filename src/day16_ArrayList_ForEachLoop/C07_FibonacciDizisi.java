package day16_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C07_FibonacciDizisi {

    public static void main(String[] args) {

        // Soru 4- Verilen pozitif bir n tamsayisini alarak,
        //         bize ilk n tane Fibonacci sayisini bir list olarak donduren bir method olusturun.
        //         Fibonacci 0 1 1 2 3 5 8 13 21 34 55 89 144 .....



        //method call yapalim

        System.out.println(fibonacciListesiOlustur(7));//[0, 1, 1, 2, 3, 5, 8]
        System.out.println(fibonacciListesiOlustur(15));//[0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377]


    }


    public static List<Integer> fibonacciListesiOlustur (int istenenSayiAdedi){

        List<Integer> fibonacciList=new ArrayList<>();

        if(istenenSayiAdedi ==1){
            fibonacciList.add(0);//sadece diziden ilk sayi istenirse dizinin ilk sayisi olan 0 ekle
        } else if (istenenSayiAdedi == 2) {//diziden iki sayi istenirse dizinin ilk iki sayisi olan 0 ve 1'i ekle
            fibonacciList.add(0);
            fibonacciList.add(1);
        }else {//diziden 2'den fazla sayi istenirse

            //1.Adim:dizideki ilk iki sayiyi ekle
            fibonacciList.add(0);
            fibonacciList.add(1);

            //2.Adim:istenenSayiAdedi kadar for loop ile liste olusturulur.
            for (int i = 2; i < istenenSayiAdedi; i++) {//2.index ve sonrasi
             //fibonacci dizisindeki herbir sayi ,kendinden onceki 2 indexin
             //toplami oldugu icin (i-1)+(i-2) yapiyoruz.
                fibonacciList.add(fibonacciList.get(i-1)+fibonacciList.get(i-2));
            }
        }
        return fibonacciList;
    }
}
