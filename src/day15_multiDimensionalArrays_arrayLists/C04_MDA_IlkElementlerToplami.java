package day15_multiDimensionalArrays_arrayLists;

public class C04_MDA_IlkElementlerToplami {

    public static void main(String[] args) {

        // SORU: verilen bir MDA'de
        //       her inner array'in ilk elementlerinin toplamini
        //       bize donduren bir method olusturun.

        int[][] arr = {{1,4,7},{3,5},{1,9,0,8},{5,2}};


        //method call yapalim.

        System.out.println("Ilk elementler toplami : "+ ilkElemanlarToplami(arr));//10  (1+3+1+5=10 oldu)


    }

    public static int ilkElemanlarToplami (int [][] arr){
        //tum elemanlara ihtiyacimiz yok
        //oncelikle arr[0][0] ini
        //          arr[1][0] ini
        //          arr[2][0] ini vs kac tane inner array varsa alip bunlari toplayacagiz.
        //buda bize arr[i][0] oluyor. tum inner arraylerin 0. indexlerini toplamak icin.
        //yani degisen yer sadece inner array kismi olur.

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {

            toplam += arr [i][0];
        }

        return toplam;
    }
}
