package Decorator;//Decorator
//Adds behaviour to an object dynamically without
//affecting the behaviour of other objects from
//the class.

public interface Coffee {
    String getDescription();
    double cost();
}

class SimpleCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Simple Decorator.Coffee";
    }
    public double cost(){
        return 5;
    }
}
class MilkDecorator implements Coffee{
    private Coffee coffee;

    public MilkDecorator(Coffee coffee){
        this.coffee = coffee;
    }
    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return coffee.cost() + 1.5;
    }
}
