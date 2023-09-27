package day04_ifStatements;

import java.util.Scanner;

public class C10_ElseVeSusluParantezlerinGorevi {
    public static void main(String[] args) {

        //SORU: Musteriden satin aldigi urun adedini isteyin
        // adet 100'den fazla ise "% 20 indirim kazandiniz"
        // adet 50'den fazla ise "%10 indirim kazandiniz" yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen satin aldiginiz urun adedini giriniz");
        int urunAdedi=scanner.nextInt();

        if(urunAdedi>100){
            System.out.println("% 20 indirim kazandiniz");
            System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz");
            System.out.println("Kampanyalarimiz hakkinda detay icin web sitemize bakiniz");
        } else if (urunAdedi>50) {
            System.out.println("%10 indirim kazandiniz");
            System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz");
            System.out.println("Kampanyalarimiz hakkinda detay icin web sitemize bakiniz");
        }

          /*
            if  else-if ... cumleleri else ile bitmek zorunda degildir
            AMMA eger else ile bitmezse bazi degerlerin kapsam disinda kalacagini bilmemiz gerekir
            EGER if veya else if'lerden sonra {} suslu parantez kullanilmazsa
            Java ilk noktali virgule (;)'e kadar olan kismi body olarak kabul eder,
            geriye kalan kodlar'i if else if statement ile ilgisiz kabul eder
            NOT : eger if veya else body'niz sadece 1 satir ise
                  { } suslu parantez kullanmadan kod yazabilirsiniz
                  ANCAK body'ye yazmaniz gereken satir sayisi 1'den fazla ise
                  MUTLAKA { } suslu parantez kullanmalisiniz.
         */

    }
}
