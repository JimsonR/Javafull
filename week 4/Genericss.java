class Reusability <T,K,V,Y,G,H,L>{
    T name;
    K course;
    public Reusability(T name, K course){
        this.name= name;
        this.course= course;
    }
    String getDetails(){
        return name+" "+course;
    }
}
public class Genericss {
    public static void main(String[] args) {

//        Reusability<String,Integer,Float,Float> reuse = new Reusability<>("jims", "sss");
//        Reusability<Integer> reuse2 = new Reusability<>(99, 99);
//        System.out.println(reuse.getDetails());
//        System.out.println(reuse2.getDetails());
    }
}
