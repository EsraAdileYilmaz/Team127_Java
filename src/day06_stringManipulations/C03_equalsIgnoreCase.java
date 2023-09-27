package day06_stringManipulations;

import java.util.Scanner;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {

        //equalsIgnoreCase() methodu kucuk-buyuk harf onemsemeksizin
        // SADECE 2 stringi karsilastirir.


        // SORU:Kullanicidan bir harf isteyin
        //      kullanici a yazarsa "Aile"
        //      i yazarsa "Is" yazdirin
        //      bu harflerin disinda bir karakter girerse
        //     "Bu harfi bilmiyorum" yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char girilenHarf=scanner.next().charAt(0);



        // Kullanici kucuk veya buyuk harf girmis olabilir.
        //String'leri buyuk kucuk harf gozetmeksizin karsilastirabiliriz

        // Bazi durumlarda kullanicidan alinan bilgileri degistirmek sikintili
        //olabilir.Buyuzden 2. yol olarak girilen bilgiyi stringlestirip
        // hazir methodlari kullaniyoruz.


        String harf =girilenHarf+""; //char olarak alinan harfi stringlestirdik.

        if(harf.equals("a") || harf.equals("A")){ //harf.equalsIgnoreCase"a" da olur
            System.out.println("Aile");
        } else if (harf.equalsIgnoreCase("i")) {
            System.out.println("Is");
        }else {
            System.out.println("Bu harfi bilmiyorum");
        }

        //equalsIgnoreCase() kucuk-buyuk harf onemsemeksizin
        // SADECE metinlere bakar.

        String str1 = "Java";
        String str2 = "java";
        String str3 = "JAva";
        String str4 = new String("JAVa" );
        String str5 = "JA" + "vA";
        String str6 = "jA";
        String str7 = "vA";
        String str8 = str6+str7;

        System.out.println(str1.equals(str2)); // Java java  false
        System.out.println(str1.equalsIgnoreCase(str2)); //true

        System.out.println(str1.equals(str3)); // Java JAva false
        System.out.println(str1.equalsIgnoreCase(str3)); //true

        System.out.println(str1.equals(str4));//Java JAVa false
        System.out.println(str1.equalsIgnoreCase(str4)); //true

    }
}
