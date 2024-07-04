package Week

import java.sql.SQLException;
import java.util.*;

public class HashSubbu {

    String m1(){
        System.out.println("asd");
        return "";
    }
    public static void main(String[] args) {

        HashMap<Integer,Integer> hm = new HashMap<>();

        hm.put(1,0);
        hm.put(2,0);
        Set asd = hm.entrySet();
        Iterator itr = asd.iterator();

        ArrayList arr = new ArrayList();
        arr.add(new HashSubbu());
        arr.add(123);
        arr.add("ASD");



        for(int i = 0 ; i<arr.size(); i++){
//            System.out.println(arr.get(i));

        }


        for(Map.Entry<Integer,Integer> maps : hm.entrySet()){
//            System.out.println(maps);

        }
        Optional<HashSubbu> hashSubbu = Optional.ofNullable(null);



        HashSubbu hashSubbu1 = null;
        hashSubbu1.m1();
//        hashSubbu.get().m1();
        String a = null;
        System.out.println(a.charAt(0));
HashMap hashMap = new HashMap(){
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
};
try{
   throw new SQLException("asd");
}catch (Exception s){

}

    }
}
