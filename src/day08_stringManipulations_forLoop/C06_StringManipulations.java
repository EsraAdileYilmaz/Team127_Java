package day08_stringManipulations_forLoop;

public class C06_StringManipulations {
    public static void main(String[] args) {

        //Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari
        //         toplayip yazdirin.
        //         input1 : “15.35 €” , input2 : “11.40 €”
        //         output : 26.75 €


        String fiyat1="15.35 €";
        String fiyat2="11.40 €";

        //1.ADIM:Ayni SATIRDA once € isaretini silmek icin replaceAll() methodunu kullandik
        // ardindan stringleri int'a cevirdim
        int yeniFiyat1=Integer.parseInt(fiyat1.replaceAll("\\D",""));
        int yeniFiyat2=Integer.parseInt(fiyat2.replaceAll("\\D" ,""));

        System.out.println("Toplam fiyat: " +(double)(yeniFiyat2+yeniFiyat1)/100 +" €");


    }
}
