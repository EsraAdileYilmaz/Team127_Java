package day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C02_FaktoryelYazdirma {
    public static void main(String[] args) {

        //Soru 6- Kullanicidan 20’den kucuk bir sayi alip,
        //        bu sayinin faktoryel degerini hesaplayin.
        //        Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //        Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen 20'den kucuk pozitif bir tamsayi giriniz");
        int girilensayi= scanner.nextInt();

        System.out.print(girilensayi +"! = "); //mesela 5 ! = yazmak icin

        long faktoryelSonuc=1; // her seferinde 1 ile carpiyoruz
        for (int i = girilensayi; i >=1; i--) {

            faktoryelSonuc *= i;

            if(i != 1){// i 1'e esit deilse
                System.out.print(i +" * ");
            }else{ //i=1 ise
                System.out.print(i +" = ");
            }
        }
        System.out.print(faktoryelSonuc);
    }
}
