package Facade;

public class Computer {
    public void start(){
        System.out.println("Facade.Computer is starting");
    }

}

class ComputerFacade{
    private Computer computer = new Computer();

    public void startComputer(){
        computer.start();
    }
}
