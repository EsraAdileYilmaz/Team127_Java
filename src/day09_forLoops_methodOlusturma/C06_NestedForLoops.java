package day09_forLoops_methodOlusturma;

public class C06_NestedForLoops {
    public static void main(String[] args) {

        // 1 2 3 4 yazdirin

        for (int i = 1; i <= 4 ; i++) {
            System.out.print(1*i +" ");
        }

        System.out.println("");// her satiri birbirinden ayirmak icin kullaniriz

        // 2 4 6 8 yazdirin
        for (int i = 1; i <= 4 ; i++) {
            System.out.print(2*i +" ");
        }

        System.out.println("");

        // 3 6 9 12 yazdirin
        for (int i = 1; i <=4 ; i++) {
            System.out.print(3*i + " ");
        }
        System.out.println("");


         /*
        Bu tur tekrar eden islemleri NESTED(icice) for-Loop ile yapabiliriz
        yukarida 3 kez ayni loop'u calistirdik (satir sayisi kadar)
        1 2 3 4
        2 4 6 8
        3 6 9 12
        aralarindaki tek fark 1*i , 2*i, 3*i olmasi oldu.
         */

        System.out.println("=================");

        for (int i = 1; i <= 4 ; i++) { // outer loop(dis loop) satirlari kontrol eder

            for (int j = 1; j <= 4; j++) { // inner loop (ic loop) sutunlari kontrol eder

                System.out.print(i*j +" ");
            }
            System.out.println("");//her inner loop calistiktan sonra bunu eklemek gerekiyorki alt satira gecsin
        }
    }
}
