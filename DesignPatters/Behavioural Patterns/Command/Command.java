package Command;
// Encapsulates a request as an object, thereby allowing
// for parameterization of clients with different requests
public interface Command {
    void execute();
}
class Light{
    public void turnOn(){
        System.out.println("Light is ON");
    }
    public void turnOff(){
        System.out.println("Light is OFF");
    }
}

class TurnOnCommand implements Command{
    private Light light;
    public TurnOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
class RemoteControl{
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }
    public void pressButton(){
        command.execute();
    }
}