package day36_lesQuestions;

import java.util.Arrays;

public class C05_Anagram {

    public static void main(String[] args) {

        /*
		    Anagram, bir kelimenin harflerinden baska bir kelime olusturmaya denir.
			Kullanicidan alinacak iki metnin ,
			Anagram durumunu belirleyen  Java kodunu yaziniz.
			isAnagram("listen", "Silent") ==> true
		 */

        //soruda bize bir method olusturun diyor. isAnagram(String,String) methodu.
        //ve bu method true dondursun diyor.yani boolean dondurecek

        //method call yapalim

        System.out.println(isAnagram("elmas","selma"));
        System.out.println(isAnagram("listen","silent"));





    }

    public static boolean isAnagram(String str1,String str2){
        //oncelikle Stringlerin herbir kelimesine bakabilmek icin
        //bunlari parcalamamiz lazim.buda split() ile array'e donusturerek oluyor.

        String [] str1Arr=str1.toUpperCase().split("");
        String [] str2Arr=str2.toUpperCase().split("");

        //Karsilastirma yapmadan once mutlaka siralanmalidir.
        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);


        if(Arrays.equals(str1Arr, str2Arr)){
        return true;
        }else{
            return false;
        }

        //return Arrays.equals(str1Arr, str2Arr); (kisaltmali sonuc)

    }
}
