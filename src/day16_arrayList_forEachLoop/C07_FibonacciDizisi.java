package day16_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C07_FibonacciDizisi {

    public static void main(String[] args) {

        // Soru 4- Verilen pozitif bir n tamsayisini alarak,
        //         bize ilk n tane Fibonacci sayisini bir list olarak donduren bir method olusturun.
        //         Fibonacci 0 1 1 2 3 5 8 13 21 34 55 89 144 .....(0,0+1,1+1,2+1,..)



        //method call yapalim

        System.out.println(fibonacciListesiOlustur(7));//[0, 1, 1, 2, 3, 5, 8]
        System.out.println(fibonacciListesiOlustur(15));//[0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377]


    }


    public static List<Integer> fibonacciListesiOlustur (int istenenSayiAdedi){

        List<Integer> fibonacciList=new ArrayList<>();

        if(istenenSayiAdedi ==1){//sadece fibonacci dizisinden ilk sayi istenirse
            fibonacciList.add(0);//sadece fibonacci dizisinden ilk sayi istenirse dizinin ilk sayisi olan 0 ekle
        } else if (istenenSayiAdedi == 2) {//fibonacci dizisinden iki sayi istenirse dizinin ilk iki sayisi olan 0 ve 1'i ekle
            fibonacciList.add(0);
            fibonacciList.add(1);
        }else {//fibonacci dizisinden 2'den fazla sayi istenirse

            //1.Adim:dizideki ilk iki sayiyi yani ilk iki indexi(0.indexi ve 1. indexi) ekle
            fibonacciList.add(0);
            fibonacciList.add(1);

            //2.Adim:istenenSayiAdedi kadar for loop ile liste olusturulur.
            for (int i = 2; i < istenenSayiAdedi; i++) {//2.index ve sonrasi
             //fibonacci dizisindeki herbir sayi ,kendinden onceki 2 indexin
             //toplami oldugu icin (i-1)+(i-2) yapiyoruz.
             //Yani i. indexi bulmak icin=> i= (i-1)+(i-2) yapiyoruz.
                fibonacciList.add(fibonacciList.get(i-1)+fibonacciList.get(i-2));
            }
        }
        return fibonacciList;
    }
}
