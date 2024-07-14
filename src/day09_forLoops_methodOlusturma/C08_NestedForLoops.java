package day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C08_NestedForLoops {

    public static void main(String[] args) {

          /*
            Kullanicidan satir ve sutun sayisini alip
            asagidaki gibi bir olusan bir sekil cizdirin
            1 1 1 1 1
            2 2 2 2 2
            3 3 3 3 3
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz");
        int satir= scanner.nextInt();

        System.out.println("Lutfen sutun sayisini giriniz");
        int sutun=scanner.nextInt();

        for (int i = 1; i <= satir ; i++) { // satirlari olusturur

            for (int j = 1; j <= sutun ; j++) { // sutunlari olusturur

                System.out.print(i +" ");//sadece satir sayisi oldugu icin i yi yazdirdik

            }
            System.out.println("");
        }


    }
}
