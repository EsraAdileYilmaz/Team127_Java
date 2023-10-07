package day22_stringBuilder_accessModifier_encapsulation;

public class C04_Encapsulation {
    public String getGorulebilsin() {//code=>generate=>getter=>gorulebilsin(enter)
        return gorulebilsin;
    }//olusan bu methodla diger class'lardan gorulebilsin variable'inin
    //obje uzerinden degeri gorulebilir.ama degeri degistirilemez.

    public void setDegerAtanabilsin(String degerAtanabilsin) {//code=>generate=>setter=>degerAtanabilsin(enter)
        this.degerAtanabilsin = degerAtanabilsin;
    }//olusan bu methodla diger class'lardan degerAtanabilsin variable'inin
    //obje uzerinden degeri degistirilebilir.ama gorulemez yani yazdirilamaz.

    private String gorulebilsin ="Bu variable gorulebilir ama degistirilemez";

    private String degerAtanabilsin = "Bu variable'a deger atanabilir ama atanmis deger gorunemez";

    public String gorulebilirVeDegerAtanabilir = "Bu variable'a hem deger atanabilir hem de degeri gorulebilir";

    private int sayi=10; //Getter and Setter methodu ile public hale cevrilebilir.

    public int getSayi() {
        return sayi;
    }

    public void setSayi(int sayi) {
        this.sayi = sayi;
    }
/*
        Bir projede calisirken en onemli konulardan birisi de;
        class uyelerine kimlerin ulasabileceginin ve degistirebileceginin belirlenmesidir.
        Bu sinirlamayi en kolay olarak access modifier ile yapabiliriz.
        Access modifier ile bir variable'a ulasabilirseniz;
        o variable hem deger atayabilir
                   hem de degerini okuyup kullanabilirsiniz.

        Gercek hayatta degerleri gorme(read) ve yeni deger atayabilme (write)
        YETKILERININ AYRILMASI istenebilir.

        Yekileri ayirmak istiyorsaniz;
        1- Oncelikle access modifier ile erisimi engelleyin (hepsini private yaptik.
        2- Istenen yetkiyi saglayan getter ve/veya setter method'u olusturun

     */


}
