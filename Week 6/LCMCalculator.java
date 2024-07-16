public class LCMCalculator {
    private int result;

    public static void main(String[] args) {
        int a = 4;
        int b = 6;

        LCMCalculator calculator = new LCMCalculator();
        calculator.calculateLCM(a, b);
        System.out.println("LCM = " + calculator.getResult());
    }

    public void calculateLCM(int a, int b) {
        Thread t1 = new Thread(new LCMTask(a, b, this));
        Thread t2 = new Thread(new LCMTask(a, b, this));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void setResult(int result) {
        this.result = result;
    }

    public synchronized int getResult() {
        return result;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    private class LCMTask implements Runnable {
        private int a, b;
        private LCMCalculator calculator;

        public LCMTask(int a, int b, LCMCalculator calculator) {
            this.a = a;
            this.b = b;
            this.calculator = calculator;
        }

        @Override
        public void run() {
            int lcmValue = lcm(a, b);
            calculator.setResult(lcmValue);
        }
    }
}
