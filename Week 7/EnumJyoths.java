
public class

EnumJyoths {
    public enum Day{
        SUNDAY, MONDAY, TUESDAY , WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public enum Season{
        WINTER("hot") , SUMMER("cold");
        String desc;

        Season(String desc){
            this.desc = desc;
        }
        String getDesc(){
            return desc;
        }

    }

    public enum Currency{

        INR(80,"aasdd"),

        USD(1,"ASD"),

        IQD(1310,"Asd"),

        KD(0.30,"sdf");

        double val;

        String desc;

        Currency(double val, String desc){

            this.val = val;

            this.desc = desc;

        }
        String getVal(){
            return val+" "+desc;
        }

    }


    public static void main(String[] args) {

        Day today = Day.MONDAY;

        switch(today) {
            case MONDAY:
                System.out.println("Today is Monday");
            break;
            case TUESDAY:
                System.out.println("Today is tuesday");
            break;
        }
        for(Season enums: Season.values()){
            System.out.println(enums+" "+enums.desc);
        }
//        System.out.println();
        for(Currency currency: Currency.values()){
            System.out.println(currency+" "+currency.getVal());
        }

    }
}
