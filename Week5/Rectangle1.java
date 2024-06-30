import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
interface Inasd{
    void m1();
}
public class Rectangle1 implements Inasd{
    int length;
    int width;
    int l;
    int s;
    public Rectangle1(int length, int width){
        this.length = length;
        this.width = width;
    }

    public Rectangle1(int length){
       this.length = length;

//        this(1,1);
    }
    public int getArea(){

        return length * width;
    }
    public void m1(){
    }
//Math
    public static void main(String[] args) {
//        Rectangle1 rectangle1 = new Rectangle1(4,5);
        Rectangle1 rectangle2 = new Rectangle1(7);
        System.out.println(rectangle2.length);
        Inasd inasd = ()-> System.out.println("Hello");
        inasd.m1();
        List<Object> asd = new ArrayList<>();
        asd.add(rectangle2);
        asd.add(1);
        System.out.println(asd);
//

//        System.out.println("area of first rectangle is "+ rectangle1.getArea());
//        System.out.println("area of second rectangle is "+ rectangle2.getArea() );
    }

}
