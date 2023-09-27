package day11_whileLoop_doWhileLoop;

public class C10_DoWhileLoop {
    public static void main(String[] args) {



        // SORU:do-while loop ile verilen sayidan baslayip, birer azaltarak
        //      3'e kadar olan sayilari yazdirin

        int sayi=10;
        do{
            System.out.print(sayi +" ");
            sayi --;
        }while (sayi>3);


        System.out.println("");
        System.out.println("======================");

        sayi=2;
        System.out.println("do while loop ile : ");
        do{
            System.out.println(sayi +" ");
            sayi --;
        }while(sayi >3);         // consolda 2 yazdirir


        System.out.println("");
        System.out.println("======================");
        // ayni soruyu while loop ile yapalim

        sayi =2;
        System.out.println("while loop ile : ");
        while (sayi >3){

            System.out.println( sayi +" ");
            sayi --;
        } // consolda hicbir sey yazdirmaz








    }
}
