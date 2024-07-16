import java.util.Optional;

public class OptionsSubs {
    String name = "Subbu";

    String getName(){
        return name;
    }
    public static void main(String[] args) {
        Optional<OptionsSubs> optionsSubs= Optional.ofNullable(null);

        OptionsSubs optionsSubs1 = optionsSubs.orElse(new OptionsSubs());
//        System.out.println(optionsSubs1.name);
      OptionsSubs optionsSubs2 =  optionsSubs().orElse(null);
        System.out.println(optionsSubs2.getName());


//        System.out.println(new OptionsSubs().optionsSubs().get().name);



    }
  static Optional<OptionsSubs> optionsSubs(){
//        Optional<OptionsSubs> optionsSubs = null;
       OptionsSubs optionsSubs = null;
        return Optional.ofNullable(optionsSubs);
    }
}
