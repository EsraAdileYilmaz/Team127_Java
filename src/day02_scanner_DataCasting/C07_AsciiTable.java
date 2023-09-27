package day02_scanner_DataCasting;

import java.util.Scanner;

public class C07_AsciiTable {
    public static void main(String[] args) {

        char chr1='a';
        char chr2='b';
        System.out.println(chr1+chr2);// a ve b nin ascii tablosundaki degerlerini alip
                                      // toplar. 97+98=195

        int sayi1=chr1;// char'i int'a atayabiliriz

           /*
            char data turu ozel bir duruma sahiptir.
            Eger char data turundeki bir degeri
            matematiksel isleme sokarsaniz
            veya sayisal bir data turune atama yaparsaniz
            ASCII TABLE'daki degeri ile isleme girer
            Buyuzden karakter olarak islem yapmak icin (char ) olarak
            cast edilir.
         */

        System.out.println("char 'a' nin int karsiligi : " + sayi1);
        // char 'a' nin int karsiligi : 97

        //SORU:kullanicidan bir char alip
        //     ascii table'da o karakterden sonra gelen 3 karakteri yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen ASCII tablosundan bir karakter giriniz");
        char karakter=scanner.next().charAt(0);

        System.out.println("girilen karakterden 1 sonraki karakter : "+(char)(karakter + 1));
        System.out.println("girilen karakterden 2 sonraki karakter : "+(char)(karakter + 2));
        System.out.println("girilen karakterden 3 sonraki karakter : "+(char)(karakter + 3));

        System.out.println("Girilen karakterden sonraki 3 karakter: " +(char)(karakter+1)+", "
        +(char)(karakter+2) +", "+(char)(karakter+3));
    }
}

