class Reusability <T,K>{
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

        Reusability<String,String> reuse = new Reusability<>("jims", "sss");
        System.out.println(reuse.getDetails());
//        Reusability<Integer> reuse2 = new Reusability<>(99, 99);
//        System.out.println(reuse.getDetails());
//        System.out.println(reuse2.getDetails());
    }
}
