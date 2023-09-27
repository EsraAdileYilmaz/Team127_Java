package day13_arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {

        // SORU:verilen int bir array'deki
        //      tum elementlerin degerlerini 2 artirin

        int [] arr={3,5,7,10,2,6};

        System.out.println("Array'in ilk hali: "+ Arrays.toString(arr)); //Array'in ilk hali: [3, 5, 7, 10, 2, 6]

        for (int i = 0; i < arr.length ; i++) {
            arr[i] +=2;
        }

        System.out.println("Array'in son hali: "+ Arrays.toString(arr)); //Array'in son hali: [5, 7, 9, 12, 4, 8]
    }
}
