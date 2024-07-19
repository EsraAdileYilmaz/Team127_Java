package day17_constructors;

public class C08_CarRunner {

    public static void main(String[] args) {

        C07_Car car1 =new C07_Car(); //C07 class'inda 1.objeyi olusturduk.

        System.out.println(car1.marka);//Marka atanmadi
        System.out.println(car1.model);//Model atanmadi

        System.out.println(car1);//day17_constructors.C07_Car@2f7c7260
        System.out.println(car1.toString());//day17_constructors.C07_Car@2f7c7260

        /*
        Eger bir class'tan obje olusturdugumuzda;
        objenin tum ozelliklerini tek bir sout ile yazdirmak isterseniz
        o class'a toString() methodu olusturmalisiniz.
         */

        System.out.println("Car1: " +car1);
        //C07_Car{marka='Marka atanmadi', model='Model atanmadi', renk='Renk atanmadi', yil=1900, fiyat=0}
        //C07_Car Ozellikler ==>marka: 'Marka atanmadi', model: 'Model atanmadi', renk: 'Renk atanmadi', yil: 1900, fiyat: 0

        C07_Car car2 =new C07_Car();//C07 class'indan 2.objeyi olusturduk.
        car2.marka = "Toyota";
        car2.model = "Corolla";
        car2.renk = "Kirmizi";
        car2.yil = 2015;
        car2.fiyat = 10000;
        System.out.println("Car2: " +car2);
        //C07_Car Ozellikler ==>marka: 'Toyota', model: 'Corolla', renk: 'Kirmizi', yil: 2015, fiyat: 10000

        C07_Car car3= new C07_Car();//C07 class'indan 3.objeyi olusturduk.
        car3.marka = "Mercedes";
        car3.model = "E200";
        car3.renk = "Siyah";
        car3.yil = 2015;
        car3.fiyat = 15000;
        System.out.println("Car3: " +car3);
        //C07_Car Ozellikler ==>marka: 'Mercedes', model: 'E200', renk: 'Siyah', yil: 2015, fiyat: 15000


        // Bir obje olusturmak icin constructor calismak zorundadir. Constructor calismadan obje olusturulamaz
        // Eger atamayi her seferinde tek tek yapmak istemezseniz,
        // atama islemini constructor'da yapabiliriz.

        C07_Car car4= new C07_Car("Porsche","Carrera");
        System.out.println("Car4: " +car4);
        //C07_Car Ozellikler ==>marka: 'Porsche', model: 'Carrera', renk: 'Renk atanmadi', yil: 1900, fiyat: 0

        C07_Car car5=new C07_Car("Citroen" ,"C3");
        System.out.println("Car5: " + car5);
        //C07_Car Ozellikler ==>marka: 'Citroen', model: 'C3', renk: 'Renk atanmadi', yil: 1900, fiyat: 0


        // Constructor'da marka, model, yil, fiyat olan araclar uretmek istiyoruz.Yeni parametreli bir constructor olusturarak yapabiliriz.
        C07_Car car6=new C07_Car("Honda","Jazz",2016,7000);//istedigimiz ozellikleri tasiyan araba objesi olusturabiliriz.
        System.out.println("Car6: "+car6);
        //car6: C07_Car Ozellikler ==>marka: 'Honda', model: 'Jazz', renk: 'Renk atanmadi', yil: 2016, fiyat: 7000

        C07_Car car7 = new C07_Car("Audi","A4",2015,15000);
        System.out.println("Car7: "+ car7);
        //Car7 C07_Car Ozellikler ==>marka: 'Audi', model: 'A4', renk: 'Renk atanmadi', yil: 2015, fiyat: 15000




    }
}
