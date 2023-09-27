package day18_parametrizedConstructor_constructorCall;

public class C01_Car {

    String marka="Marka atanmadi";
    String model="Model atanmadi";
    String renk="Renk atanmadi";
    int yil=1900;
    int fiyat;

    public C01_Car(){

        //renk="Kirmizi";//boyle yaparsak parametresiz cons. ile yapilan tum car objelerinin rengi kirmizi olur.

         /*
            default constructor ile parametresiz constructor'in en buyuk farki:
            default cons.'in body'si bos iken,kod yazilamaz ve gorunmez iken,
            parametresiz cons.'lara kod yazilabilir
            bu durumda yapilan atamalar tum araclar icin standart olarak uygulanir.
         */
    }


    public C01_Car(String mrk, String mdl, String rnk){

        marka=mrk;//marka kisinin istedigi mrk olsun
        model=mdl;//model kisinin istedigi mdl olsun
        renk=rnk;//renk kisinin istedigi rnk olsun

    }

    C01_Car(String marka, String model, String renk, int fiyat){
        //String marka=Peugeot, String model=206, String renk=Beyaz, int fiyat=4000 yapacak.
        this. marka=marka;//instance variable'i ayirmak icin basina this. koyuyoruz.
        this. model=model;//instance variable'i ayirmak icin basina this. koyuyoruz.
        this. renk=renk;//instance variable'i ayirmak icin basina this. koyuyoruz.
        this. fiyat=fiyat;//instance variable'i ayirmak icin basina this. koyuyoruz.
        //boylece ilk yazilanin instance variable ,ikincisinin ise deger oldugunu ayiriyoruz.
    }

    //tum instance'lar icin parametre alan bir constructor olusturalim.
    //Code=>Generate=>Constructor=>istenen parametreler=> command tusuna
    //basili tutularak istenen parametreler secilir.

    public C01_Car(String marka, String model, String renk, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.yil = yil;
        this.fiyat = fiyat;
    }

    //model ve yil parametreleri olsun
    //biz hep toyota satiyoruz ve renkleri de hep mavi.java'ya yaptiriyoruz.
    public C01_Car(String model, int yil) {
        this.model = model;
        this.yil = yil;
        //this.yil =2020; yapsaydik uretilen tum car'lar 2020li olurdu.
        marka="Toyota";//bunlar local'de olmadigi icin this.'ya gerek yoktur
        renk="Mavi";//bunlar local'de olmadigi icin this.'ya gerek yoktur
    }

    public String toString() { //code-generate-toString sonra hangi ozellikleri secmek istiyorsan onlari sec
        return "Car Ozellikler ==>" +
                "marka: '" + marka + '\'' +
                ", model: '" + model + '\'' +
                ", renk: '" + renk + '\'' +
                ", yil: " + yil +
                ", fiyat: " + fiyat ;
    }
}
