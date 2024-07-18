package day15_multiDimensionalArrays_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydekiTekrarEdenElementleriSilme {

    public static void main(String[] args) {

        // SORU: Verilen bir int array'de,
        //       tekrar eden elementleri silip
        //       array'i her elementin unique oldugu bir hale getirin


        int[] arr = {3,2,5,6,7,2,8,9,0,1,2,3,4,7,5,4};

        //1.Adim:once bir ArrayList olusturalim.
        List <Integer> sayilar=new ArrayList<>();//[]

        //2.Adim:Bu ArrayList'e eklemek icin array'in tum elemanlarini tek tek ele alalim,
        //       liste'de olup olmadigina bakalim, listede yoksa ekleyelim.

        for (int i = 0; i < arr.length ; i++) {

            if(!sayilar.contains(arr[i])){ //sayilar list'i array'in elemanini icermiyorsa,
                sayilar.add(arr[i]);       //array'in elemanlarini sayilara ekle.Yani elemanlardan birer tane ekle
            }
        }
        System.out.println("Sayilar unique listi: "+sayilar);//Sayilar unique listi: [3, 2, 5, 6, 7, 8, 9, 0, 1, 4] ArrayList bu hale donustu


        //3.Adim:Uzunlugu ArrayList kadar olan Yeni bir array olusturalim.
        int [] yeniArr=new int[sayilar.size()];
        System.out.println(Arrays.toString(yeniArr)); // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]


        //4.Adim:bu yeniArr'ye list'in elemanlarini atayalim.

        for (int i = 0; i < yeniArr.length; i++) {

            yeniArr[i]= sayilar.get(i);// sayilar'daki herbir elementi get ile getirip yeniArr'ye atayacak
        }


        //5.Adim:yeni array'i de eski array'e deger olarak atayalim
        arr=yeniArr;
        System.out.println(Arrays.toString(arr));//[3, 2, 5, 6, 7, 8, 9, 0, 1, 4]

        //6.Adim:elemanlari duzenlemek icin sort() yapabiliriz
        Arrays.sort(arr);
        System.out.println("Array'in son hali : " + Arrays.toString(arr));
        //Array'in son hali : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]


    }
}
