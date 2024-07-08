import java.util.Optional;

public class OptionalJyoths {
    void m1(){
        System.out.println("sadasd");
    }
    public static void main(String[] args) {
        Optional<OptionalJyoths> optionalJyothsOptionals = Optional.ofNullable(null);
        OptionalJyoths optionalJyoths = optionalJyothsOptionals.orElse(new OptionalJyoths()) ;
        optionalJyoths.m1();


    }
}
