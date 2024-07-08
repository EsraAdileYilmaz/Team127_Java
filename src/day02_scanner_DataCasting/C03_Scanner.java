package day02_scanner_DataCasting;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        //         girilen bilgiler : J Doe, 44


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        char isim=scanner.nextLine().charAt(0);
        // burada next() methodunu tercih etseydik asagida
        //nextLine() methodu kullandigimizda sorun cikarabiliyor.
        //next() methodu space karakterine kadarki olan ilk kelimeyi alir,
        //nextLine() methodu tum satiri alir

        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim=scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        int yas=scanner.nextInt();

        System.out.println("Girilen bilgiler: " + isim+" " +soyisim+ ", " +yas);
    }
}
