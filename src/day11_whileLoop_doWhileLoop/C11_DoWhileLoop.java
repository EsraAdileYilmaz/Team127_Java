package day11_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C11_DoWhileLoop {
    public static void main(String[] args) {


        //Soru  - Kullanicidan bir pozitif sayi isteyin,
        //        sayının tam kare olup olmadığını bulunuz,
        //        tamkare ise degeri, tam kare degilse uyari yazdirin.
        //	      Ornek :  input : 16, output: 4
        //                 input : 23  output: tamkare degil

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen tam kare olup olmadigini kontrol etmek icin pozitif bir sayi giriniz");
        int girilenSayi= scanner.nextInt();

        int karekok=1; // carpim islemi yapacagimiz icin 0 atayamayiz

        do{

            if(karekok * karekok == girilenSayi){
                System.out.println("Girilen sayi bir tamkaredir.Karekok degeri : " + karekok);
            }
            karekok++;
        }while ( karekok * karekok <= girilenSayi);


    }
}
