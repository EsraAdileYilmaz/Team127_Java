package day07_StringManipulations;

public class C02_indexOf {
    public static void main(String[] args) {

        //indexOf() methodu bize aranan metnin kacinci indexte oldugunu
        //dondurur. int bir sayi dondurur.String ve char kabul eder.
        //indexOf("a" ,6) yazarsan 6.indexten sonra a'yi ara demektir


        String str = "Java candir, Selenium heyecan.";

        //str Selenium iceriyor mu?
        System.out.println(str.contains("Selenium"));//true

        //str Selenium ile mi bitiyor?
        System.out.println(str.endsWith("Selenium"));//false

        //str Selenium ile mi basliyor?
        System.out.println(str.startsWith("Selenium"));//false

        // peki Selenium nerede?
        System.out.println(str.indexOf("Selenium"));//13.indexte

        //Olmayan bir metin aratilirsa;
        System.out.println(str.indexOf("x"));//-1
        System.out.println(str.indexOf("q"));//-1
        System.out.println(str.indexOf("a")); //1

        //contains() methodunu kullanmadan str'in java icerip icermedigini yazdirin
        if(str.indexOf("java") ==-1){
            System.out.println("str java kelimesi icermemektedir");
        }else{
            System.out.println("str java kelimesi icermektedir");
        }


        //str'daki ilk a harfinin index'ini yazdirin
        System.out.println(str.indexOf('a'));//1.indexte ilk a harfini buldu

        //str'daki ikinci a harfinin index'ini yazdirin.(ilkindex+1)yaparsak
        //ikinci a harfinin indexini buluruz.
        System.out.println(str.indexOf('a', 2));//3.indexte

        //str'daki 3. a harfinin index'ini yazdirin.(ikinciindex+1)yaparsak
        //ucuncu a harfinin indexini buluruz.
        System.out.println(str.indexOf('a', 4));//6

        //str'da 4. a varsa index'ini yazdirin. [3. a'nin indexi=6]
        //yoksa "str sadece 3 tane a iceriyor" yazdirin
        if(str.indexOf('a',7) == -1){ //4. a yoksa
            System.out.println("str sadece 3 tane a iceriyor");
        }else{ //4. a varsa
            System.out.println("4. a'nin index'i : " + str.indexOf('a',7));
        } //27. indexte

        //str'da 5. a varsa indexini yazdirin [4. a'nin indexi=27]
        //yoksa "str sadece 4 tane a iceriyor" yazdirin
        if(str.indexOf('a',28) ==-1){ //5. a yoksa
            System.out.println("str sadece 4 tane a iceriyor");
        }else{ //5. a varsa
            System.out.println("5. a'nin index'i : " + str.indexOf('a',28));
        } //str sadece 4 tane a iceriyor




    }
}
