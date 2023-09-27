package day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C05_StringTerseCevirme {
    public static void main(String[] args) {


        //Soru  (interview)- Kullanicidan bir String isteyin
        //                     ve String’i tersine cevirip kaydedin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin= scanner.nextLine();

        String tersMetin=""; // tersine cevirdigimiz metni buraya ekleyecegiz

        for (int i = metin.length()-1; i >= 0; i--) { // yazilan metnin son harfinden baslayacak 0. indexe kadar gidecek

            tersMetin +=metin.charAt(i);
        }

        System.out.println("Girilen metnin tersden yazilisi: " +tersMetin);


        // tersi ile duzden yazilisi ayni olan metinlere palindrome denir.
        // SORU:girilen metnin palindrome olup olmadigini yazdiralim.

        if (metin.equalsIgnoreCase(tersMetin)){
            System.out.println("Girilen metin palindrome");
        }else{
            System.out.println("Girilen metin palindrome degil");
        }
    }
}
