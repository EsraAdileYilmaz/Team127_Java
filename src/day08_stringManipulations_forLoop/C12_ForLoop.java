package day08_stringManipulations_forLoop;

import java.util.Scanner;

public class C12_ForLoop {
    public static void main(String[] args) {


        // Soru- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //       sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //       Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen baslangic degeri olarak pozitif bir tamsayi giriniz");
        int basDeger= scanner.nextInt();

        System.out.println("lutfen bitis degeri olarak pozitif bir tamsayi giriniz");
        int bitis= scanner.nextInt();

        int toplam=0;

        if(bitis<basDeger){
            System.out.println("Bitis degeri baslangic degerinden buyuk olmali");
        }else{ // bu durum toplam hesaplayacagimiz durumdur
            for (int i = basDeger; i <= bitis; i++) {

                toplam +=i;
            }
            System.out.println("Girilen aralikdaki sayilarin toplami: " +toplam);
        }
    }
}
