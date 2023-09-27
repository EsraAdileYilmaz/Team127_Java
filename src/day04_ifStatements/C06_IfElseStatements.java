package day04_ifStatements;

import java.util.Scanner;

public class C06_IfElseStatements {
    public static void main(String[] args) {


        //Soru - Kullanicidan bir karakter isteyin,
        //        girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        //        yoksa girilen karakteri yazdirin


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter=scanner.next().charAt(0);

        if('a'<=karakter && karakter<='z'){
            System.out.println(Character.toUpperCase(karakter));
        }else{
            System.out.println("Girilen karakter: " +karakter);
        }

    }
}
