package day16_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArrayiListeCevirme {
    public static void main(String[] args) {


        Integer[] arr = {3,2,5,6,7,2,8,9,0,1,2,3,4,7,5,4};

         /*
            Uzun bir array'i list'e cevirmenin
            en kullanisli ve problemsiz yolu
            bir for-loop ile elementleri tasimaktir.

            Arrays class'inda asList() method'u da array'i list'e cevirir.
            ANCAK 2 buyuk problemi vardir;

            1- array'den cevirdigimiz list'e ,ekleme- cikarma gibi
               size'i degistiren islemler yapamazsiniz.
            2- bu method array ve cevirdigi list'i eslestirir.
               array'de yaptiginiz degisiklik list'e,
               list'te yaptiginiz degisiklik array'e islenir.
         */

        List <Integer> sayilar= Arrays.asList(arr);//array'i list'e cevirdi.

        System.out.println("Sayilar Listesi : " + sayilar);
        //Sayilar Listesi : [3, 2, 5, 6, 7, 2, 8, 9, 0, 1, 2, 3, 4, 7, 5, 4]

        //sayilar.add(14); //UnsupportedOperationException
        //sayilar.remove(2); //UnsupportedOperationException

        System.out.println("Array :" + Arrays.toString(arr));
        //Array :[3, 2, 5, 6, 7, 2, 8, 9, 0, 1, 2, 3, 4, 7, 5, 4]

        //SORU:Array'in 0.indexindeki sayiyi 33 yapin.
        arr[0] = 33;
        System.out.println("Array :" + Arrays.toString(arr));
        //Array :[33, 2, 5, 6, 7, 2, 8, 9, 0, 1, 2, 3, 4, 7, 5, 4]
        System.out.println("Array'i degistirdikten sonra Sayilar Listesi : " + sayilar);
        //Array'i degistirdikten sonra Sayilar Listesi : [33, 2, 5, 6, 7, 2, 8, 9, 0, 1, 2, 3, 4, 7, 5, 4]

        /*
        Arrayde yapilan degisikligin aynisi list'ede yansidi.
         */





    }
}
