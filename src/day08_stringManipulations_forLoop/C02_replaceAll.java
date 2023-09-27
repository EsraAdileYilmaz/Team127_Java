package day08_stringManipulations_forLoop;

public class C02_replaceAll {
    public static void main(String[] args) {

        //replaceAll() methodunda tum karakterleri ayni anda degistirebiliriz
        //regex'lerden yardim almak kosulu ile.
        //Bu method char kabul etmez

        String str = "990087J1a5v**&^%$8a +/can809--=7dir_";
        // metindeki sayi ve karakterleri temizleyip
        // sadece harflerden olusan "Java candir" sekline donusturun

        //1.ADIM:Tum sayilari yok edelim
        str=str.replaceAll("\\d","");
        System.out.println(str);// Jav**&^%$a +/can--=dir_

        //2.ADIM:space 'i korumak icin space yerine bir rakam atayalim
        str=str.replaceAll(" ","5");
        System.out.println(str);// Jav**&^%$a5+/can--=dir_

        //3.ADIM:Ozel karakterleri yok edelim. W harf,rakam ve _ 'yi degistirmez
        str=str.replaceAll("\\W","");
        System.out.println(str);// Java5candir_

        //4.ADIM:space yerine yazdigimiz sayiyi, yeniden space yapalim
        str=str.replaceAll("5"," ");
        System.out.println(str);//Java candir_

        //5.ADIM:sondaki _ alt cizgiyi yok edelim
        str=str.replaceAll("_" ,"");
        System.out.println(str);//Java candir


    }
}
