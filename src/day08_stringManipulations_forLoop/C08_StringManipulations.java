package day08_stringManipulations_forLoop;

import java.util.Scanner;

public class C08_StringManipulations {
    public static void main(String[] args) {

        //Soru  : Kullanicidan bir String alin,
        //       String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
        //       String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin= scanner.nextLine();

        if(metin.length() %2 ==0){ //uzunluk cift ise
            System.out.println(metin.substring(0,metin.length()/2) +":)" +
                    metin.substring(metin.length()/2));
        }else{ //uzunlugu tek sayi ise
            System.out.println(metin.substring(0,metin.length()/2) +":(" +
                    metin.substring((1+metin.length())/2));
        }

        //2.YOL

        int uzunluk = metin.length();
        String yeniHal ="";

        if (uzunluk % 2 == 0){ // uzunluk cift ise

            yeniHal = metin.substring(0,uzunluk/2) +
                    ":)"+
                    metin.substring(uzunluk/2);

        }else { // uzunluk tek ise
            yeniHal = metin.substring(0,uzunluk/2)+
                    ":(" +
                    metin.substring((uzunluk+1)/2);
        }
        System.out.println(metin+ " yazdiniz ve ben onu degistirdim : " +yeniHal);

    }
}
