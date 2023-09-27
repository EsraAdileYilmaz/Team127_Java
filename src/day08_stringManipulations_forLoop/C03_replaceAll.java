package day08_stringManipulations_forLoop;

public class C03_replaceAll {
    public static void main(String[] args) {

        /*
        SORU:verilen bir String'de arama sonuclarinin 100'den fazla oldugunu test edin;
             -100'den fazla ise "Test Passed",
             -100'den fazla degilse "Test Failed" yazdirin
         */

        String str = "Arama sonucunda 1434 kelimeye ulasildi";

        str=str.replaceAll("\\D" ,"");// kelimeleri yok ettik
        System.out.println(str);//"1434" oldu
        //str="1434" oldu.Bunu int 'a donusturmem lazim

        int donusenStr=Integer.parseInt(str); //parseInt() icinde sadece digit bulunan
                                              // String'i Integer'a donusturur

        if(donusenStr>100){
            System.out.println("Test Passed");
        }else { // donusenStr<100 'se
            System.out.println("Test Failed");
        }

    }
}
