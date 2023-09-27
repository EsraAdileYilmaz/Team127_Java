package day08_stringManipulations_forLoop;

import java.util.Scanner;

public class C11_ForLoop {
    public static void main(String[] args) {

        // SORU:Kullanicidan pozitif bir tamsayi degeri isteyin
        //      o sayiya kadar olan tum pozitif tamsayilarin toplamini yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilenSayi= scanner.nextInt();

        int toplam=0;

        for (int i = 1; i <= girilenSayi; i++) {
            toplam +=i;
        }

        System.out.println("1'den baslayarak girilen sayiya kadar olan sayilarin toplami: "
                +toplam);
    }
}
