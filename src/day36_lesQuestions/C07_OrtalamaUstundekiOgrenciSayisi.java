package day36_lesQuestions;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class C07_OrtalamaUstundekiOgrenciSayisi {

    public static void main(String[] args) {

        // Bir öğretmenden girmek istediği kadar notu alınız, ve
        // ortalamayı geçen öğrenci sayısını bulunuz.

        // Once ogretmenden girmek istedigi kadar not alalim,
        // notlari bir Listeye koyalim
        // bir yandan da notlari toplayalim(ortalama bulmak icin)
        // bitti demesi icin Q'ya bassin.

        Scanner scanner = new Scanner(System.in);
        List<Double> notlarListesi = new ArrayList<>();
        double notToplami = 0;
        double ortalamaNot;
        int ortalamaUstundekiOgrenciSayisi=0;
        double girilenNot;
        boolean devamEdeyimMi = true;

        do {
            System.out.println("Lutfen ogrenci notu giriniz, \nBitirmek icin Q'ya basiniz");
            try {
                girilenNot = scanner.nextDouble();
                if (girilenNot<0 || girilenNot>100){
                    throw new IllegalArgumentException();
                }
                notlarListesi.add(girilenNot);//girilenNot araligi 0 ila 100 arasinda ise notlarListesi List'ine ekle
                notToplami += girilenNot;//ve girilenNotlari toplama ekle

            } catch (InputMismatchException e) {//sayi yerine karakter veya baska birsey girerse;
                String hocaMetin = scanner.nextLine();//girileni buraya kaydet.
                if (hocaMetin.equalsIgnoreCase("q")){
                    devamEdeyimMi = false;//girilen Q ise loop'u bitir
                }else {
                    System.out.println("Hatali giris yaptiniz !!!");
                }
            }catch (IllegalArgumentException e){
                System.out.println("Gecersiz not araligi");
            }

        }while (devamEdeyimMi);//(boolean devamEdeyimMi = true;) zaten true atamistik

        // ortalamayi bulalim.bunun icin notlarToplami/ogrenciSayisi.
        //ogrenciSayisi=notlarListesi.size() 'dir.yani 7 not girilmisse 7 ogrenci vardir.
        ortalamaNot = notToplami / notlarListesi.size() ;//cunku burdan cikan sonuc double olacak

        // ortalama ustundeki ogrenci sayisini bulup yazdiralim
        for (double each : notlarListesi
        ) {//list'e herbir girilenNot=each

            if (each >= ortalamaNot){
                ortalamaUstundekiOgrenciSayisi++;
            }
        }

        System.out.println("Not girilen ogrenci sayisi : " + notlarListesi.size()
                +"\nNot ortalamasi : " + ortalamaNot
                +"\nOrtalama ustundeki ogrenci sayisi : " + ortalamaUstundekiOgrenciSayisi);


    }
}
