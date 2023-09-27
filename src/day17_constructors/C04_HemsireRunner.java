package day17_constructors;

public class C04_HemsireRunner {

    public static void main(String[] args) {

        C03_Hemsire hemsire1= new C03_Hemsire(); //bu obje default constructor tarafindan olusturuldu.

        hemsire1.hemsireAdi="Esra";
        hemsire1.hemsireAdresi="Yenimahalle";
        //olusturulan ilk objenin adi esra ve adresi yeni mahalle olur.


        C03_Hemsire hemsire2= new C03_Hemsire();// 2.hemsire objemiz.yeniden tum instance variable'lar atanir
        System.out.println(hemsire2.hemsireAdi); //null
        System.out.println(hemsire2.hemsireTel);//null


        System.out.println(new C03_Hemsire());
        //bu yukarida olusturulan obje atama yapmadigimiz icin bir daha kullanamayiz.
        //bu tur bos objeler Java'daki Garbage Collector tarafindan toplanip, yok edilir.

        C03_Hemsire hemsire3; // bu sadece bir deklarasyondur.Atama yoktur ,burada bir obje yoktur.
        //ilk deger atamasi(initialize) yapilmadigi icin, herhangi bir variable degerini yazdiramaz.
        //System.out.println(hemsire3.hemsireAdresi);//degeri yokki ne yazdirayim diyor.

        //hemsire3.method1();//hemsire3'e deger atamadinki bir method calistirasin diyor.
        //once deger atamasi yapilmali sonra kullanilmalidir.

    }
}
