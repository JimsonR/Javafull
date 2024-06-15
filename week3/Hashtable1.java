import java.io.IOException;
import java.util.*;
import java.util.Enumeration;

public class Hashtable1 {
    public static void main(String[] args){
        Hashtable<String,Integer> h = new Hashtable();


        String[] arr = {"Jims","Jyo", "subbs"};
        for(int i=0 ; i<arr.length ; i++){
            h.put(arr[i],i);
        }

        System.out.println(h);
        HashMap<String,Integer> h2 = new HashMap<>();
        for(int i=0 ; i<arr.length ; i++){
            h2.put(arr[i],i);
        }
//        h.remove("Jyo");
        System.out.println(h2);
//        for(Map.Entry<String,Integer> entry : h.entrySet()){
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }
        ArrayList<String> list = new ArrayList<>();
        HashMap<Integer, ArrayList<String>> h3 = new HashMap<>();
        list.add("Jyo");
        list.add("subbs");
        list.add("Jims");
        list.add("subbs");
        h3.put(0,list);
//        h3.put(1,"sasds");
//        h3.put(2,"ssasd");
//        h3.put(3,"ssasdee");
        System.out.println(h3);

//        Enumeration<String> enu = h.keys();
//        while(enu.hasMoreElements()){
//            String key = enu.nextElement();
//            System.out.println(key+" "+h.get(key));
//        }
//
//        System.out.println();
//        Hashtable<String,Integer> h4 = new Hashtable();
        HashMap<String,Integer> h5 = new HashMap<>();
        LinkedHashMap<String,Integer> h4 = new LinkedHashMap<>();
        h4.put("Mia",4); //77+105+97 % 5 = 4
//        h5.put("Mia",4);
        h4.put("Tim",3); //84+105+77 % 5 = 3
//        h5.put("Tim",3);
        h4.put("Leo",2); //76 + 110 + 101 % 5 = 2
//        h5.put("Leo",2);
        h4.put("Som",1);  //83+111+109 % 5= 1
//        h5.put("Som",1);
        h4.put("Bebs",0); // 66 + 101 + 98 + 115 % 5 = 0
//        h5.put("Bebs",0);
//        h4.put("Mia",h4.get("Mia")+1);
        h4.put("sebB",3);
        System.out.println(h4);

for(Map.Entry<String,Integer> entry : h4.entrySet()){
    System.out.println(entry.getKey());
}
System.out.println(h5);


    }
}
