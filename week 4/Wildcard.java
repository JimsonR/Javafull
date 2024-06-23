class Dss<T,K>{
     T name;
    K age;

    public Dss(T name, K age){
        this.name = name;
        this.age = age;
    }
    public T getName(){
        return name;
    }
    public K getAge(){
        return age;
    }
    public void setAge(T name){
        this.name = name;
    }
}
public class Wildcard {
    public static void main(String[] args) {
        Dss<? extends String,? extends String> dss = new Dss(1, 2);
        System.out.println(dss.getName());
        System.out.println(dss.getAge());
        char[] arr = {'a','b','c','d','e','f','g'};
        
    }
}
