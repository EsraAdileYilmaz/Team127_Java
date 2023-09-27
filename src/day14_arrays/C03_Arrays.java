package day14_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Arrays {
    public static void main(String[] args) {

        int[] arr = {3,4,5,3};

        // Kullanicidan bir deger alip, array'e ekleyin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen array'e eklemek istediginiz tam sayiyi giriniz");
        int sayi= scanner.nextInt();


        //C02 classindan method call yaptik.
        arr=C02_ArrayeElemanEkleme.arrayeElemanEkle(arr, sayi);
        System.out.println("Array'in yeni hali : " + Arrays.toString(arr));



    }
}
