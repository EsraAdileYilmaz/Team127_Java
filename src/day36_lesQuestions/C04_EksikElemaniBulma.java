package day36_lesQuestions;

import java.util.Arrays;

public class C04_EksikElemaniBulma {

    public static void main(String[] args) {

        /*
        SORU=
        Sirali,pozitif tek tam sayilardan olusan bir array veriliyor.
        array'de eksik olan tek sayiyi bulan bir method olusturun
        input : [1,3,5,7,9,13,15,17] output : 11
        input : [9,7,3] output : 5
        */

        int [] input={1,3,5,7,9,13,15,17};

        int [] arr={9,7,3};

        //method call yapalim
        System.out.println(eksikSayiyiBul(input));//11
        System.out.println(eksikSayiyiBul(arr));//5



    }
    public static int eksikSayiyiBul(int [] input){

        Arrays.sort(input);//verilen array'i siraladik.
        int eksikEleman=0;
        for (int i = 0; i < input.length-2 ; i++) {
            //length-2 yaptik,cunku son elemanla yani length-1 ile farkini karsilastirinca loop biticek.
            //En son (input.length-1) -(input.length-2)==2 mi? karsilastirmasini yapacak

            if(input[i+1]-input[i] !=2){
                //bir sonraki elemandan bir onceki elemani cikardigimizda aradaki fark 2 deilse
                eksikEleman=input[i]+2;
            }
        }
        return eksikEleman;
    }
}
