import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WildMask{

    void printList(List<? super Number> list){
        for(Object object: list){
            System.out.println(object.getClass());
        }
    }

    public static void main(String[] args) {
        List list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(false);

        new WildMask().printList(list);


    }
}
