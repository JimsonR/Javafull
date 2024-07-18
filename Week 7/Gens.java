import javax.swing.*;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class GenClass<T,K>{
    T i;
    K j;
    GenClass(T i, K j){
        this.i = i;
        this.j = j;
    }

    T getDets(){

        System.out.println(getDet());
        return i;

    }
K getDet(){
  return j;
}


}
public class Gens {
    public static void main(String[] args) throws IOException {

        GenClass genClass = new GenClass(1,2);

//        System.out.println(genClass.getDets());


        HashMap< String,  Number> hashMap = new HashMap<>();


        hashMap.put("asdds",1.0f);
        hashMap.put("asdasd",1.00d);
        hashMap.entrySet().stream();
       Stream<Map.Entry<String,Number>> hashMap2 = hashMap.entrySet()
                                    .stream()
                                    .filter(x->x.getKey().length()>5);
//                            forEach(stringNumberEntry -> System.out.println(stringNumberEntry));
//        System.out.println(hashMap2.collect(Collectors.toMap()));

//        Stream stream = hashMap.entrySet().stream();
        HashMap<? extends String, ? extends Number> hashMap1 = hashMap;

        System.out.println(hashMap1.get("asdds"));

        String[] strs = {"flower","flow", "flight"};




//        Map<String,Integer> hashMap2= Arrays.asList(strs).stream().collect(Collectors.toMap(key->key, val -> val.length() ));

//        System.out.println(Arrays.toString(strs));
//       Arrays.sort(strs,(Comparator.comparingInt(x->x.length())));
//        Comparator

        String str1 = strs[0];
//
//        for (int i = 1; i < strs.length; i++) {
//            while (!str1.equals(strs[i].substring(0, str1.length()))) {
//                    System.out.println(str1);
//                    str1 = str1.substring(0,str1.length()-1);
//
//            }
//        }
//        Integer b = 0;
//List<String> av = new ArrayList<>();
//        av.add(1,b.toString());
//            System.out.println(str1);

//        System.out.println(8>>>2);

        for(int i = 2; i < 10; i++){


        }

        }


}
