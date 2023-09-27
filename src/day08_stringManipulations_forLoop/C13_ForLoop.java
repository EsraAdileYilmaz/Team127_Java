package day08_stringManipulations_forLoop;

import java.util.Scanner;

public class C13_ForLoop {
    public static void main(String[] args) {


        //Soru - Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //       sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //       Bitis degeri baslangic degerinden kucuk olsa da program calissin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen baslangic degeri olarak pozitif bir tamsayi giriniz");
        int basDeger= scanner.nextInt();

        System.out.println("Lutfen bitis degeri olarak pozitif bir tamsayi giriniz");
        int bitis= scanner.nextInt();

        int toplam=0;

        if(bitis>basDeger){ //bitis degeri baslangictan buyuk

            for (int i = basDeger; i <= bitis; i++) {
                toplam +=i;
            }

        }else{ //yani bitis<basDeger, bitis degeri baslagictan kucuk

            for (int i = basDeger; i >=bitis ; i--) {

                toplam +=i;
            }
        }

        System.out.println("Girilen aralikdaki sayilarin toplami: " +toplam);


        //2.YOL OLARAK AHMET H'NIN YAPTIGI YOL

        if (bitis > basDeger){ // bitis degeri baslangictan buyuk
            for (int i = basDeger; i <=bitis ; i++) {
                toplam +=i;
            }
        }else { // bitis degeri baslagictan kucuk
            for (int i = bitis; i <=basDeger ; i++) {
                toplam += i;
            }
        }
        System.out.println("verilen aralikdaki sayilarin toplami : "+ toplam);

    }
}
