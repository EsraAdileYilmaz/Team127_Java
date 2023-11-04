package day36_lesQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_Array {

    public static void main(String[] args) {

        // SORU=Verilen iki String array'deki
        // ortak elementleri bulup,
        // bir array olarak donduren bir method yazin

        String[] arr1 = {"A","C","B","J","V","G","Z","L","M"} ;
        String[] arr2 = {"S","R","B","S","R","T","T","B","K","G","Z","L"};


        //method call yapalim
        System.out.println(Arrays.toString(ortakElemanBul(arr1,arr2)));



    }

    public static String [] ortakElemanBul(String[] arr1,String[] arr2){

        //Arraylerde islem yapmak zor oldugundan bir List olusturalim.
        List<String> ortakElemanListi=new ArrayList<>();

        //Herbir arrayi(arr1 ve arr2'yi) nested for loop ile ele alip ortak elemanlarini List'e ekleyelim
        for (int i = 0; i < arr1.length ; i++) {//arr1[i]= herbir eleman

            for (int j = 0; j < arr2.length ; j++) {//arr2[j]= herbir eleman

                if(arr1[i].equals(arr2[j]) && ! ortakElemanListi.contains(arr2[j])){
                    //iki array birbirine esit ve ortakElemanListi bu elemanlari icermiyorsa;
                    ortakElemanListi.add(arr2[j]);//ortak elemanlar list'e eklendi
                }

            }
        }

        //Elimizdeki list'i bir array'e cevirmemiz lazim
        String [] ortakElemanArr=new String[ortakElemanListi.size()];

        //list'in herbir elemanini array'e bir for loop ile atayalim.
        for (int i = 0; i < ortakElemanArr.length; i++) {
            ortakElemanArr[i]=ortakElemanListi.get(i);
        }
        return ortakElemanArr;
    }
}
