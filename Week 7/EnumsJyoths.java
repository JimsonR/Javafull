
public class EnumsJyoths {
    enum  Grams{
        PICOGRAM(0.000000000001) , NANOGRAM(0.000000001),MICROGRAM(0.000001),MILLIGRAM(0.001),GRAM(1.0),KILOGRAM(1000.0),TONNE(1000000), MEGATONNE(1000000000000.0),GIGATONNE(1000000000000000.0);

        private Number weight;

        Grams(Number weight){
            this.weight = weight;
        }
        Double weightInGrams(){
            return weight.doubleValue();
        }
        Double convertFromGrams(Double valueInGrams){

            return valueInGrams/weightInGrams();

        }
        Double convertToGrams(Double valueNotInGrams){
            return valueNotInGrams*weightInGrams();
        }
}

    public static void main(String[] args) {
        Double i = Grams.KILOGRAM.convertToGrams(56.0);
        for(Grams grams : Grams.values()){
            System.out.println(grams+" "+grams.ordinal()+" "+(grams.convertFromGrams(i)));
        }

//        System.out.println(Grams.MEGATONNE.convertFromGrams(i));
//        System.out.println(Grams.MEGATONNE.convertToGrams(Grams.MEGATONNE.convertFromGrams(i)));

    }
}
