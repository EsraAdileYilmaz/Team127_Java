package day18_parametrizedConstructor_constructorCall;

public class Rope {

    public static void swing(){

        System.out.print("swing ");
    }
    public void climb(){

        System.out.print("climb ");
    }
    public static void play(){
        swing();
        //climb();//burasi CTE veriyor.cunku static olamayan, bir method static method icinden cagrilamaz.
    }
    public static void main(String[] args) {
        Rope rope = new Rope();//rope objesi olusturuldu
        rope.play();//play() methodu static oldugu icin obje uzerinden cagrilmaya gerek yok diyor
        Rope rope2 = null;//null olarak atandigi icin constructor yok. oyuzden rope2 objesi olusturulamadi.
        rope2.play();//play() methodu static oldugu icin objeye ihtiyac duymaz.obje olusmasa bile
                     //play() methodu calisir.
    }
}
