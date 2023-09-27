package day16_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_KullaniciyaListeOlusturtma {

    public static void main(String[] args) {

        //Soru 2- Kullanicidan istedigi kadar isim alip,
        //        Q’ya bastiginda islemi bitiren ve girdigi isimleri
        //        bize liste olarak dondurecek bir method olusturun.



        //method call yapalim
        System.out.println(listeOlustur());


    }

    public static List<String> listeOlustur(){

        List<String> isimler=new ArrayList<>();//girilen isimleri ekleyecegim bir list olusturdum

        Scanner scanner=new Scanner(System.in);
        String girilenIsim; //loop'un disinda olusturduk cunku loop'un hem icinde hem  disinda kullanabilmek icin.

        do {
            System.out.println("List'e eklemek icin lutfen isim giriniz." +
                    "\nIslemi bitirmek icin Q 'ya basiniz");

            girilenIsim= scanner.nextLine();

            if(! girilenIsim.equalsIgnoreCase("Q")){
                isimler.add(girilenIsim);
            }
        }while(! girilenIsim.equalsIgnoreCase("Q"));

        return isimler;
    }


}
