public class LCMThreads {
    private int result;
    public static void main(String[] args) {
        int a = 4;
        int b =6;

        LCMThreads lcmThreads = new LCMThreads();

        lcmThreads.calculateLCM(a,b);
        System.out.println(lcmThreads.getResult());
//        System.out.println(new LCMThreads().gcd(4,6));
    }
    void calculateLCM(int a , int b){
        Thread thread1 = new Thread(new LCMTask(a,b,this));
        Thread thread2 = new Thread(new LCMTask(a,b,this));

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){

        }
        }

   synchronized void setResult(int result){
        this.result = result;
    }
    synchronized int  getResult(){
        return result ;
    }
    int gcd(int a , int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }
    int lcm(int a , int b){
        return (a*b) / gcd(a,b);
    }
    private class LCMTask implements Runnable{
        int a;
        int b;
        LCMThreads calc;
        LCMTask(int a, int b , LCMThreads calc){
            this.a = a;
            this.b= b;
            this.calc = calc;
        }
        public void run(){
            int result = lcm(a,b);
            calc.setResult(result);

        }

    }
}



