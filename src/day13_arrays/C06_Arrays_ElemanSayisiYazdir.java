package day13_arrays;

public class C06_Arrays_ElemanSayisiYazdir {
    public static void main(String[] args) {


        //Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini
        //        ve varsa kac kere kullanildigini yazdiran bir method olusturun.

        int[] arr = {3,4,2,6,5,4,5,7,8,2,3,9};
        int arananSayi = 3;

        //method call yapalim.

        elemanSayisiYazdir(arr,5); //Aranan sayi array icinde 2 kez kullanilmistir.
        elemanSayisiYazdir(arr,10);//Aranan sayi array icinde bulunmamaktadir.
        elemanSayisiYazdir(arr,3);//Aranan sayi array icinde 2 kez kullanilmistir.




    }


    public static void elemanSayisiYazdir(int [] arr, int arananSayi){

        int sayac=0;

        for (int i = 0; i <arr.length ; i++) {

            if(arr[i] == arananSayi){
                sayac ++;
            }
        }

        if(sayac ==0){
            System.out.println("Aranan sayi array icinde bulunmamaktadir.");
        }else{
            System.out.println("Aranan sayi array icinde " + sayac+ " kez kullanilmistir.");
        }
    }
}
