class Games{
    String name;
    int score;
   protected Games(String name, int score){
        this.name = name;
        this.score = score;
    }
   public void display(){
        System.out.println(name);
        System.out.println(score);
    }
    void play(){
        System.out.println(name+" is playing ");
    }
    void quit(){
        System.out.println(name+" is quiting ");
    }

}
public class CrudNondb {
    public static void main(String[] args) {
        Games game1 = new Games("Alex", 20);
    }
}
