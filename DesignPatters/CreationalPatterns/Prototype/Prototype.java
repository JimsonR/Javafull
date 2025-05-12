package Prototype;//Creates new objects by copying an existing object (clone).

public class Prototype implements Cloneable{
    public Prototype clone() throws CloneNotSupportedException{
        return (Prototype) super.clone();
    }
}
