package day16_arrayList_forEachLoop;

public class C10_ForEachLoop {

    public static void main(String[] args) {


        /*
            For-each loop
            birden fazla eleman barindiran
            array ve list gibi yapilarla calismak uzere hazirlanmistir.

            1'den 100'e kadar olan sayilari toplama,
            sayi 50'den kucuk oldugu muddetce .... yapma, gibi index eksenli
            islemler icin uygun degildir.

            for each loop;
            birden fazla eleman barindiran yapilardaki elementleri
            hic bir siralama sarti olmadan ve index kullanmadan
            BIZE GETIRIR.

            For-each loop'da 3 seyi yazmaliyiz;
            1- calisacagimiz elementlerin data turu
            2- loop icinde gelen elemanlari hangi isimle kullanacagiz (array'de arr[i])(each veya w olarak adlandirilir.)
            3- uzerinde islem yapacagimiz cok elementli objenin ismi (yani hangi kaynaktan aldigimiz).
         */

        int [] arr={2,5,7,9,6,3,4,8};

        //SORU: array'in tum elementlerini yazdirin.
        for (int each:arr
             ) {
            System.out.print( each +" ");
        } //2 5 7 9 6 3 4 8

        System.out.println("");

        //SORU: array'deki tum elemanlari toplayin

        int toplam=0;
        for (int w:arr
             ) {

            toplam +=w;
        }
        System.out.println("Elementlerin toplami: "+ toplam); //Elementlerin toplami:44


        //SORU: array'deki cift sayilarin carpimini yazdirin

        int carpim=1;
        for (int each: arr
             ) {
            if(each %2 ==0){
                carpim *=each;
            }
        }
        System.out.println("Carpim sonucu: " + carpim);//Carpim sonucu: 384
    }
}
