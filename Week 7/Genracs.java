import java.util.*;

abstract class Shape{
    abstract void draw();
}
class Rectangles extends Shape{
    void draw(){
        System.out.println("Rectangle");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Circle");
    }
}

public class Genracs {

   static void drawShape(List<? extends Shape> lists){
        for(Shape shape : lists){
            shape.draw();
        }
    }
    static Double add(List<? extends Number> list){
       double sum = 0.0;
       for(Number d : list){
           sum = sum+d.doubleValue();
       }
        return sum;
    }


    public static void main(String[] args) {

        List<Rectangles> rectangles = new ArrayList<>();

        rectangles.add(new Rectangles());

        List<Circle> circles = new ArrayList<>();

        circles.add(new Circle());
        circles.add(new Circle());

        drawShape(rectangles);
        drawShape(circles);

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);

        List<Float> list1 = new ArrayList<>();

        list1.add(1.2f);

        System.out.println(add(intList));
        System.out.println(add(list1));
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 0,1,1);
        for(int i = 0; i<4; i++){
            list.add(list.get(list.size()-1)+list.get(list.size()-2)+list.get(list.size()-3));
        }
        System.out.println(list);
        System.out.println(trib(4));

    }
   static int trib(int n){
       HashMap<Integer,Integer> tribs = new HashMap<>();
       if(n<=1){
            return n;
        }
       if(n==2){
           return 1;
       }if(!tribs.containsKey(n)){
           tribs.put(n,trib(n-1 )+trib(n-2)+trib(n-3));
       }
        return tribs.get(n);
    }
}
