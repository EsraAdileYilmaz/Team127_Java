package day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C01_FaktoryelHesaplama {
    public static void main(String[] args) {


        // Soru - Kullanicidan 20’den kucuk bir sayi alip,
        //         bu sayinin faktoryel degerini hesaplayin.
        //         5! = 5*4*3*2*1 => 120

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen 20'den kucuk pozitif bir tamsayi giriniz");
        int girilensayi= scanner.nextInt();

        int faktoryelSonuc=1; //her seferinde 1 ile carpilacak.oyuzden 0 la baslayamaz

        for (int i = girilensayi; i >=1 ; i--) {

            faktoryelSonuc *=i;
        }
        System.out.println("Verilen sayinin faktoryel degeri : " + faktoryelSonuc);
    }

}
