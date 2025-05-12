package Observer;
// Allows an object(subject) to notify other objects(observers)
// when its stages changes
import java.util.ArrayList;
import java.util.List;

public interface Observer {
    void update(String message);
}
class Subject{
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o){
        observers.add(o);
    }

    public void notifyObserver(String message){
        for (Observer o : observers){
            o.update(message);
        }
    }

}
