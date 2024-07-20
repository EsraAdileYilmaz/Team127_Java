package day18_parametrizedConstructor_constructorCall;

import day17_constructors.C01;

public class C02_CarRunner {



    public static void main(String[] args) {

        C01_Car car1= new C01_Car();//default cons. ile olusturuldu.
        System.out.println("Car1 "+ car1);
        //Car1 C07_Car Ozellikler ==>marka: 'Marka atanmadi', model: 'Model atanmadi', renk: 'Renk atanmadi', yil: 1900, fiyat: 0
        car1.marka="BMW";
        car1.model="116";
        car1.yil=2010;
        car1.fiyat=7500;
        //bunlar car1 objesinin yeni degerleri.artik sout'la yazdirinca bunlar cikar.
        System.out.println("Car1 "+ car1);
        //Car1 C07_Car Ozellikler ==>marka: 'BMW', model: '116', renk: 'Renk atanmadi', yil: 2010, fiyat: 7500


        //Marka, model ve renk degerlerini parametre olarak yollayabilecegimiz
        //bir constructor olusturalim.bunun icin C01'e gidiyoruz
        C01_Car car2= new C01_Car("Nissan","Micra","Gri");
        System.out.println("Car2 "+car2);
        //Car2 Ozellikler ==>marka: 'Nissan', model: 'Micra', renk: 'Gri', yil: 1900, fiyat: 0

        C01_Car car3=new C01_Car("Opel","Corsa","Beyaz");
        System.out.println("Car3 "+car3);
        //Car3 Ozellikler ==>marka: 'Opel', model: 'Corsa', renk: 'Beyaz', yil: 1900, fiyat: 0

        // Marka,model,renk ve fiyat parametreleri olan
        // bir constructor olusturun. bunun icin C01'e gidiyoruz

        C01_Car car4= new C01_Car("Peugeot","206", "Beyaz",4000);
        //objenin argumentlerini yazinca constructor icinde atamalari yapmamiz gerekir.
        System.out.println("Car4 "+ car4);
        //Car4 Ozellikler ==>marka: 'Peugeot', model: '206', renk: 'Beyaz', yil: 1900, fiyat: 4000
    }
}
