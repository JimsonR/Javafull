import java.util.Collection;
import java.util.Map;

interface joki{
    int a = 10;
}
interface jiki{
    int a = 20;
}
public class Juki implements jiki,joki{
    public static void main(String[] args) {
        double h = 60;


        float grossSalary = 50000.0f;

        float maxEpfWage = 15000.0f;

        float calculatedEpfWage = 60.0f/100*50000 >= maxEpfWage ? maxEpfWage : 60.0f/100*50000 ;

        float remGrossSalary = grossSalary - calculatedEpfWage ;

        float hra = 66.0f/100*remGrossSalary;

        float otherAllowance = remGrossSalary - hra;


        System.out.println("remgross"+" "+remGrossSalary+" hra "+hra+" otherallowance "+ otherAllowance);



    }

//    public static Float calculatedEpfWage(Float calculatedEpfWage){
//
//
//
//
//
//    }
}
