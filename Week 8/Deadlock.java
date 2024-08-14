class Resource{
    private final String name;

    Resource(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }


}
class Task implements Runnable{

    private final Resource resource1;

    private final Resource resource2;

    Task(Resource resource1, Resource resource2){
        this.resource1 = resource1;
        this.resource2 = resource2;
    }
    public void run(){
        Resource firstResource  = resource1.getName().compareTo(resource2.getName())<0?resource1:resource2;
        System.out.println(firstResource.getName()+"  "+Thread.currentThread().getName());
        Resource secondResource = firstResource == resource1 ? resource2:resource1;
        System.out.println(secondResource.getName()+"  "+Thread.currentThread().getName());
//     synchronized (firstResource){
        synchronized (resource1) {
            System.out.println(Thread.currentThread().getName() + " locked " + resource1.getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
//                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+" Attempting to lock "+resource2.getName());
//synchronized (secondResource){
            synchronized (resource2) {
                System.out.println(Thread.currentThread().getName() + " locked " + resource2.getName());
            }
        }

    }
}

public class Deadlock {
    public static void main(String[] args) {
        Resource resource1 = new Resource("Resource 1");
        Resource resource2 = new Resource("Resource 2");


        Thread thread1 = new Thread(new Task(resource1,resource2),"Thread 1");

        Thread thread2 = new Thread(new Task(resource2,resource1),"Thread 2");

        thread1.start();

        thread2.start();

    }

}
