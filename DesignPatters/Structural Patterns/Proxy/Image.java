package Proxy;

public interface Image {
    void display();
}
class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
    }

    public void display(){
        System.out.println("Displaying "+ fileName);
    }

}
class ProxyImage implements Image{
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
