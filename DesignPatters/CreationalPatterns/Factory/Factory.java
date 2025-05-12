package Factory;

// Defines an interface for creating an
// object but lets subclasses decide
// which class to instantiate
interface Shapes{
    void draw();
}
class Circles implements Shapes{
    public void draw(){
        System.out.println("Drawing Circle");
    }

}

class Square implements Shapes{
    public void draw(){
        System.out.println("Drawing Factory.Square");
    }
}
public class Factory {

    public Shapes getShape(String shapeType){
        if(shapeType.equals("CIRCLE")){
            return new Circles();

        } else if (shapeType.equals("SQUARE")) {
            return new Square();
        }
        return null;
    }



}
