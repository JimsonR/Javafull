package ImportPackage;

import ExportPackage.ExportPackageClass;
//import ExportPackage.FinalClass;
import ExportPackage.NotPublicFinal;

public class ImportPackageClass extends ExportPackageClass  {
    ImportPackageClass(){

//        super(1,2,3);
        System.out.println("asasddsadasdasd");

    }
    double f;
    public static void main(String[] args) {


        String sasds = new String("sad");
//          byte b =(byte)129;

        System.out.println(new ImportPackageClass().f);
//        new ImportPackageClass();
//        System.out.println();

    }
}
