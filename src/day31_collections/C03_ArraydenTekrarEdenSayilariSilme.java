package day31_collections;

import java.util.Arrays;

public class C03_ArraydenTekrarEdenSayilariSilme {

    public static void main(String[] args) {

        //SORU: verilen array'den tekrar eden elementleri silip,
        // array'i her bir elementin unique oldugu hali ile kaydedin.

        int[] arr = {2,4,6,4,1,2,5,7,9,4,5,7,2,6,8,2,1};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[1, 1, 2, 2, 2, 2, 4, 4, 4, 5, 5, 6, 6, 7, 7, 8, 9]
        //boylece tekrar eden sayilari gormus olduk.

        // 1.yontem- once bir forloop ile kac tane silinecek sayi var bulup
        // sonra bos bir array olusturup uygun olan elementleri ona tasiyabiliriz

        // 2.yontem bir loop ile elemanlari gozden gecirip
        // bir oncekine esit olan element varsa, olusturacagim ayri bir method'la
        // o elemnti silip, arrayi degistiririm

        //1.YONTEMLE YAPALIM:

        int silinecekElemanSayisi=0;
        for (int i = 0; i < arr.length-1 ; i++) {

            if(arr[i] == arr[i+1]){//ornegin 0.index==1.index ise ,1.index==2.index ise gibi ...
                silinecekElemanSayisi ++;

            }
        }//bu loop ile silinecek eleman sayisini bulduk
        System.out.println(silinecekElemanSayisi);//9

        int [] yeniArr=new int[arr.length-silinecekElemanSayisi];//17-9=8 [0,0,0,0,0,0,0,0] olustu
        //unique elementleri icine koymak icin bos bir array olusturduk.
        int konulacakIndex=0;
        for (int i = 0; i < arr.length-1 ; i++) {
            if(arr[i] != arr[i+1]){
                yeniArr[konulacakIndex] = arr[i+1];//yeniArr[0] = arr[0+1]...
                konulacakIndex ++;
            }

        }//bu loop ile son element haric digerlerini yeniArr'ye atadik.

      if(arr[arr.length-1] != yeniArr[yeniArr.length-1]){
          yeniArr[yeniArr.length-1]= arr[arr.length-1];
      }//son elementi de boylece atadik

      arr=yeniArr;
        System.out.println(Arrays.toString(arr));//[2, 4, 5, 6, 7, 8, 9, 9]






    }
}
