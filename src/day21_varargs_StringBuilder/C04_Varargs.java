package day21_varargs_StringBuilder;

public class C04_Varargs {

    public static void main(String[] args) {

        //c[] bir array gibi davranir.
        islem(3,4,5,6,7,8);// 3 + 4 + c[3]=>8 = 3+4+8 =15 (yani c array'inin a'inci indexi)
        islem(1,2,3,4,5,6);// 1 + 2 + c[1]=>4 = 1+2+4 =7
        islem(0,1,2);//  0 + 1+ c[0]=>2= 0+1+2= 3
        islem(3,4);// 3 + 4 +        bu kodda c array'i [] olur c[3] ==> bulunamaz. Buyuzden RTE verir.
        // ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 0 (RTE)

    }



    public static void islem(int a,int b,int... c){

        System.out.println(a+b+c[a]);// a+b+c arrayinin a'inci indexini topla
    }
}
