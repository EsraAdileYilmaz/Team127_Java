package day12_scope;

public class C06_InstanceVeStaticVariableKullanimi {

    // Okul uygulamasi yaptigimizi dusunelim

    //static variable'lar class'a aittir.
    //herkesi etkileyen variable'lardir.
    //herkes icin ortaktir.
    //yapilan yeni bir atama ile degisirse herkes icin degisir.

    static String okulIsmi = "Yildiz Koleji";
    static String mudur = "Fikret Zeybek";
    static String okulAdresi = "Cankaya";



    //Instance(static olmayan) variable'lar objeye aittir. Ve obje ile birlikte kullanilmalidir.
    //her obje icin farklidir.
    //degisirse sadece o obje etkilenir.

    String ogretmenIsmi = "Isim atanmadi";
    String ogretmenAdresi = "Adres girilmedi";
    String ogretmenTel = "Tel girilmedi";


    public static void main(String[] args) {

        /*
        Bir obje olusturuldugunda java tarafindan instance variable'lar  cogaltilir
        ve obje ile ilisiklendirilir. Yani her bir obje icin instance variable'larin
        hepsinden birer tane kopyalanir.
         */

        // 1.Objemizi olusturalim.==>Class Adi +Obje adi=new +Class Adi();
        C06_InstanceVeStaticVariableKullanimi ogr1=new C06_InstanceVeStaticVariableKullanimi();
        System.out.println(ogr1.ogretmenAdresi); // Adres girilmedi
        ogr1.ogretmenIsmi="Omer";
        ogr1.ogretmenAdresi="Kizilay";
        System.out.println(ogr1.mudur);// Fikret Zeybek (sari boyadi cunku java diyorki obje uzerinden cagirmana gerek yok)

        //2.Objemizi olusturalim.==>Class Adi +Obje adi=new +Class Adi();
        C06_InstanceVeStaticVariableKullanimi ogr2=new C06_InstanceVeStaticVariableKullanimi();
        System.out.println(ogr2.ogretmenIsmi); //Isim atanmadi
        ogr2.ogretmenIsmi="Zeliha";

        //3.Objemizi olusturalim.==>Class Adi +Obje adi=new +Class Adi();
        C06_InstanceVeStaticVariableKullanimi ogr3=new C06_InstanceVeStaticVariableKullanimi();//Bu satiri yazinca java hemen instance variable lari bu ogr1 ile ilisiklendirir.
        System.out.println(ogr3.ogretmenIsmi); // isim atanmadi
        System.out.println(ogr3.ogretmenAdresi); // Adres girilmedi
        System.out.println(ogr3.ogretmenTel); // Tel girilmedi

        System.out.println("====================================");
        System.out.println(ogr1.ogretmenIsmi); // Omer
        System.out.println(ogr2.ogretmenIsmi); // Zeliha
        System.out.println(ogr3.ogretmenIsmi); // isim atanmadi

        //static variable'lar butun objeler icin aynidir,degismez
        System.out.println(ogr1.okulIsmi); // Yildiz Koleji
        System.out.println(ogr2.okulIsmi); // Yildiz Koleji
        System.out.println(ogr3.okulIsmi); // Yildiz Koleji


        //static bir variable'a yeni deger atanirsa her yerde yeni deger gecerli olur.
        ogr1.okulAdresi = "Yeni Mahalle";

        System.out.println(okulAdresi); // Yeni Mahalle
        System.out.println(ogr2.okulAdresi); // Yeni Mahalle
        System.out.println(ogr3.okulAdresi); // Yeni Mahalle


    }
}
