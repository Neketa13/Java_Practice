import java.util.Formatter;
import java.util.Scanner;
import java.text.*;
import java.util.*;

class My_class
{
    public static void main(String[] args) {


        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        Formatter fmrt =new Formatter();

        Scanner first = new Scanner(System.in);
        System.out.print("Input a x = ");
        double x = first.nextDouble();
        System.out.print("Input a k = ");
        int k = first.nextInt();
        System.out.print("Input a a = ");
        double a = first.nextDouble();
        double res2, e;
        e = Math.pow(10, -k);
        res2 = Math.pow(a, x);
        if (a > 0 && k >= 1) {
            first.close();
            numberFormat.setMaximumFractionDigits(k+1);
            System.out.print("e= ");
            System.out.println(e);
            System.out.print("With Taylor res= ");
            //System.out.println(Reshenie.Otvet(x, k, a));
            System.out.println(numberFormat.format(Reshenie.Otvet(x, k, a)));
            System.out.println(" ");
            System.out.print("First res 2= ");
            System.out.println(numberFormat.format(res2));
            //System.out.println(res2);
        } else {
            System.out.println("Error ");
        }
    }

public static class Reshenie {
    public static double Otvet(double x, int k, double a) {
        double e, res = 1, numb = 1, sl = 1;
        e = Math.pow(10, -k);
            while (Math.abs(sl) >= e) {
                sl = sl * ((x * (Math.log(a))) / numb);
                numb = numb + 1;
                res = res + sl;
            }
        return res;
    }
}

}


