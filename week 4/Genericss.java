class Reusability <T>{
    T name;
    T course;
    public Reusability(T name, T course){
        this.name= name;
        this.course= course;
    }
    String getDetails(){
        return name+" "+course;
    }
}
public class Genericss {
    public static void main(String[] args) {
        Reusability<String> reuse = new Reusability<>("jims", "sss");
        Reusability<Integer> reuse2 = new Reusability<>(99, 99);
        System.out.println(reuse.getDetails());
        System.out.println(reuse2.getDetails());
    }
}
