package day17_constructors;

public class C07_Car {

    String marka="Marka atanmadi";
    String model="Model atanmadi";
    String renk="Renk atanmadi";
    int yil=1900;
    int fiyat;

    C07_Car(){//DEFAULT constructor'un yerini tutmasi icin olusturuldu.
        //daha onceden default constructor'la olusturulan objeler varsa,
        //hata vermesini engellemek icin bunu yapiyoruz.
        // Bir class'da asagidaki gibi gorunur ve parametreli bir constructor olusturdugumuzda,
        // Java default constructor'i siler.
        // Bu durumda proje kapsamindaki baska class'larda
        // bu class'in default constructor'ini kullanarak olusturulmus olan objeler
        // CTE verir.
        // Bu durumun onune gecmek icin,
        // bir class'da gorunur bir parametreli constructor olusturuldugunda
        // DEFAULT constructor yerine de parametresiz ve bos bir constructor olusturulur.
    }

    C07_Car(String mrk,String mdl){//URUN URETIM BANDI.Hangi ozelliklere sahip urun uretilmesini istiyorum
        marka=mrk;//yukarida olusturulan instance variable'lari objelerde kullanmak icin burada atama yaptik
        model=mdl;//yukarida olusturulan instance variable'lari objelerde kullanmak icin burada atama yaptik


    }

    C07_Car(String mrk , String mdl ,int yl , int fyt){//URUN URETIM BANDI.Hangi ozelliklere sahip urun uretilmesini istiyorum
        marka = mrk;
        model = mdl;
        yil = yl;
        fiyat = fyt;
        //yukarda olusturulan instance variable'larin value'su burada parametre
        //olarak atanan degerlerin value'su ile degistirilir.or:marka=mrk olur yada yil=yl olur

    }

    //toString methodu olusturmak icin=>ust cubukta Code =>Generate=>toString yapiyoruz
    public String toString() { //code-generate-toString sonra hangi ozellikleri secmek istiyorsan onlari sec
        return "C07_Car Ozellikler ==>" +
                "marka: '" + marka + '\'' +
                ", model: '" + model + '\'' +
                ", renk: '" + renk + '\'' +
                ", yil: " + yil +
                ", fiyat: " + fiyat ;
    }

    //toString() methodu sayesinde objenin sahip oldugu ozellikleri yazdirdigimizda,
    //bu ozellikler atanmis value'leri ile birlikte yazdirilabilir.
    //Ancak toString() methodu kullanmadan yazdirdigimizda objenin sadece referansini
    //yazdiriyor.or: System.out.println(car1);//day17_constructors.C07_Car@2f7c7260
}
