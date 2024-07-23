package day23_inheritance;

public class E_Toyota extends D_Car {//burada E_Toyota class'i D_Car class'ini parent edindi.
    //bu class'a yazilan ozellikler tum Toyota'lar icin gecerli olmalidir.
    //bu class Toyota'lar icin cati class dir.
    String marka="Toyota";// D_Car class'indan aldigimiz markayi update ettik.
    String uretimYeri= "Japonya ve Turkiye";//D_Car class'indan aldigimiz uretim yerini update ettik.
    String sanziman="Otomatik veya manuel";
    String lastik= "Pirelli";
    String guvenlik="Toyota araclar ekstra guvenlik donanimina sahiptir.";
    String aku="Aku atanmadi";

    //Burada yazilan ozelliklere ek olarak parent class olan D_Car class'indan
    //model,renk,yakit ozelliklerini alir.boylece toplamda 9 ozellik
    //kazanmis oluyor.


}
