package day24_inheritance_constructorCall;

public class E_Toyota extends D_Car {

    E_Toyota(){

        super();//super constructor call ile once parent'taki parametresiz
                //constructor calisir.Yani D_Car classindaki once calisir.
    }


    String marka="Toyota";// D_Car class'indan aldigimiz markayi update ettik.
    String uretimYeri= "Japonya ve Turkiye";//D_Car class'indan aldigimiz uretim yerini update ettik.
    String sanziman="Otomatik veya manuel";
    String lastik= "Pirelli";
    String guvenlik="Toyota araclar ekstra guvenlik donanimina sahiptir.";
    String aku="Aku atanmadi";



}
