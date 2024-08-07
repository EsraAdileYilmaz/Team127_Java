package day14_arrays;

import java.util.Arrays;

public class C02_ArrayeElemanEkleme {

    public static void main(String[] args) {


        //Soru 7- Verilen bir array’e
        //        istenen bir elemani ekleyip bize donduren bir method yazin,
        //        eski array’e yeni degeri atayin.

        int[] arr1 = {4,5,6,7};

        // bu array'e 5.element olarak 8'i atayin

        // arr1[4] = 8; calistirinca hata verir

        int[] yeniArr = {4,5,6,7,8};

        arr1 = yeniArr;

        System.out.println("arr1'in son hali : " + Arrays.toString(arr1)); // [4, 5, 6, 7, 8]

        arr1=arrayeElemanEkle(arr1,10);//yani arr1=[4,5,6,7,8,10] oldu. method call'un mantigi bu
        System.out.println("arr1'in method call'dan sonraki hali : " + Arrays.toString(arr1));//arr1'in method call'dan sonraki hali : [4, 5, 6, 7, 8, 10]



        int[] yeniArr2=arrayeElemanEkle( arr1,8);//yeni bir eleman daha ekledi
        System.out.println("yeniArr2'nin son hali: "+Arrays.toString(yeniArr2));//yeniArr2'nin son hali: [4, 5, 6, 7, 8, 10, 8]

    }

    public static int[] arrayeElemanEkle(int[] arr,int istenenEleman){


        //1.adim: yeni bir array olustur.
        int [] yeniArr=new int[arr.length+1]; // eski arrayin uzunlugundan 1 fazla

        //2.adim: eski arrayin tum elementlerini yeni array'e aktar

        for (int i = 0; i < arr.length; i++) {

            yeniArr[i] =arr[i]; // yeni array'e eski array'in her bir indexini tek tek aktardik
        }

        //3.adim:yeni array'in son indexine istenenElemani ekle.cunku yeni array'in son indexi default olarak 0 kaldi

        yeniArr[yeniArr.length-1]=istenenEleman;

        //4.adim: return yap

        return yeniArr;


    }
}
