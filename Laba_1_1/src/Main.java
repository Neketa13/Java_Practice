import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
import java.math.*;


class My_Class
{

    public static void main(String[] args) {

                Scanner first = new Scanner(System.in);
                System.out.print("Input a x = ");
                BigDecimal x = first.nextBigDecimal();
                double x_1= x.doubleValue();
                //10.10

                System.out.print("Input a k = ");
                BigInteger k = first.nextBigInteger();
                int k_1=k.intValue();

                System.out.print("Input a a = ");
                BigDecimal a = first.nextBigDecimal();
                double a_1=a.doubleValue();
                first.close();

                BigDecimal sl= new BigDecimal("1");

        double e, res2;

        e = Math.pow((double) 10, (double)-k_1);
        res2=Math.pow(a_1,x_1);

        if(a.compareTo(BigDecimal.valueOf(0))>=1 && k.compareTo(BigInteger.valueOf(1))>=1) {
            System.out.print("e= ");
            System.out.println(e);
            System.out.print("With Taylor res= ");
            System.out.println(Reshenie.Otvet(x, k, a));
            System.out.println(" ");
            System.out.print("First res 2= ");
            System.out.println(res2);
        }
        else
        {
            System.out.println("Error ");
        }



    }
    public static class Reshenie {
        public static BigDecimal Otvet(BigDecimal x, BigInteger k, BigDecimal a) {
            int k_1=k.intValue();
            double a_1=a.doubleValue();
            BigDecimal numb= new BigDecimal("1");
            BigDecimal sl= new BigDecimal("1");
            BigDecimal res= new BigDecimal("1");

            double e, perem_2;
            e = Math.pow((double) 10, (double)-k_1);
            perem_2=Math.log(a_1);
                while (sl.compareTo(BigDecimal.valueOf(e))>=1)
                {
                    sl=sl.multiply((x.multiply(BigDecimal.valueOf(perem_2))).divide(numb,6,RoundingMode.DOWN));
                    numb=numb.add(BigDecimal.valueOf(1));
                    res=res.add(sl);
                }
            return res;
        }
    }

}