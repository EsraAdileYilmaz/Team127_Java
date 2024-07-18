package day15_multiDimensionalArrays_arrayLists;

import java.util.Arrays;

public class C01_MDA_TumElementleriYazdirma {
    public static void main(String[] args) {

        int [] arr1={3,4,6,8};

        //arr1'i yazdirin. Tek katli bir array
        System.out.println(Arrays.toString(arr1)); //[3, 4, 6, 8]

        //arr1'in tum elementlerini yazdirin.
        for (int i = 0; i < arr1.length ; i++) {
            System.out.print(arr1[i]+ " ");
        }// 3 4 6 8


        System.out.println("==========================");

        /*
        MultiDimensionalArrays'leri yazdirmak icin Arrays.deepToString() methodu kullanilir.
         */
        int [][] arr2= {{1,4,7},{3,5},{1,9,0,8},{2}};

        //arr2'yi yazdirin. Cift katli bir  array
        System.out.println(Arrays.deepToString(arr2));//[[1, 4, 7], [3, 5], [1, 9, 0, 8], [2]]

        //arr2'nin tum elementlerini yazdirin.
        for (int i = 0; i < arr2.length ; i++) {//outer array i kontrol eder ve sirasiyla inner array'leri getirir.arr[2].......
            for (int j = 0; j < arr2[i].length; j++) {//inner array in icindekilerini getirir
                System.out.print(arr2[i][j]+ " ");
            }
        }//1 4 7 3 5 1 9 0 8 2




    }
}
