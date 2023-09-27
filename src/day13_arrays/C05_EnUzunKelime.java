package day13_arrays;

public class C05_EnUzunKelime {
    public static void main(String[] args) {

        // Soru 6- Verilen String bir array’deki
        //         en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

        String [] isimler = { "Zehra","Huseyin","Mehmet","Esra","Ali","Ercan","Omer"};

        //method call yapalim

        enUzunEnKisaYazdir(isimler);

    }


    public static void enUzunEnKisaYazdir(String[] arr){

        String enUzunIsim=arr[0];//ilk indexten itibaren karsilastirmaya baslasin diye 0. indexi sectik.
        String enKisaIsim=arr[0];//ilk indexten itibaren karsilastirmaya baslasin diye 0. indexi sectik.

        for (int i = 0; i < arr.length ; i++) {

            if(arr[i].length() > enUzunIsim.length()){
                enUzunIsim =arr[i];
            }

            if(arr[i].length() < enKisaIsim.length()){
                enKisaIsim=arr[i];
            }


        }

        System.out.println("En uzun isim: "+ enUzunIsim);
        System.out.println("En kisa isim: "+ enKisaIsim);
    }
}
