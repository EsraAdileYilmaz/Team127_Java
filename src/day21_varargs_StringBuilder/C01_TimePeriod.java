package day21_varargs_StringBuilder;

import java.time.LocalDate;
import java.time.Period;

public class C01_TimePeriod {

    public static void main(String[] args) {

        //kac yasindayim?
        LocalDate dogumTarihi= LocalDate.of(1980,01,03);
        LocalDate bugun=LocalDate.now();

        Period yasim=Period.between(dogumTarihi,bugun);
        System.out.println(yasim);//P 43Y 9M 1D (yani 43 yil 9ay 1 gun)

        System.out.println(yasim.getYears());// 43 (sadece yili verir)
    }
}
