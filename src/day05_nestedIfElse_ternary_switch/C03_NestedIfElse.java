package day05_nestedIfElse_ternary_switch;

import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {

        //Soru - Kullanicidan aldigi urun adedi ve urun fiyatini alin,
        //        kullaniciya musteri karti olup olmadigini sorun.
        //        Musteri karti varsa
        //              10 urun veya fazla alirsa %20,
        //              10 urunden az alirsa %15 indirim yapin,
        //        Musteri karti yoksa
        //              10 urun veya fazla alirsa %15,
        //              10 urunden az %10 indirim yapin


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen aldiginiz urunun adedini giriniz");
        int urunAdedi= scanner.nextInt();

        System.out.println("Lutfen aldiginiz urunun fiyatini giriniz");
        double urunFiyati=scanner.nextDouble();

        System.out.println("Musteri kartiniz var mi? \n Evet: E  Hayir: H");
        char kartVarMi=scanner.next().toUpperCase().charAt(0);

        //Kart ANA DEGISKEN olsun

        if(kartVarMi =='E'){ // musteri karti varsa

            if(urunAdedi >=10){
                System.out.println("% 20 indirimli toplam fiyat: " +urunFiyati*urunAdedi* 80/100);
            }else{
                System.out.println("% 15 indirimli toplam fiyat: " +urunFiyati*urunAdedi* 85/100);
            }

        }else if(kartVarMi == 'H'){ //musteri karti yoksa

            if(urunAdedi >=10){
                System.out.println("% 15 indirimli toplam fiyat: " +urunFiyati*urunAdedi* 85/100);
            }else{
                System.out.println("% 10 indirimli toplam fiyat: " +urunFiyati*urunAdedi* 90/100);
            }

        }else{
            System.out.println("Kart bilgisini dogru giriniz");
        }

    }
}
