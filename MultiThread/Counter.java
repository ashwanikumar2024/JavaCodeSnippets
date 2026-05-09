package MultiThread;

class Counter{
    int count = 0;
    static int i = 0;
    static synchronized void incI(){
        i++;
    }

    synchronized void increment(){
        count++;
        incI();
    }
}


class Important {
    public static void main(String[] args) {
        Counter count = new Counter();
        Counter count2 = new Counter();

        Thread th1 = new Thread(
                ()->{
                    for(int i = 0; i< 100000; i++){
                        count.increment();
                    }
                }
        );
        Thread th2 = new Thread(
                ()->{
                    for(int i = 0; i< 100000; i++){
                        count.increment();
                    }
                }
        );
        Thread th3 = new Thread(
                ()->{
                    for(int i = 0; i< 100000; i++){
                        count2.increment();
                    }
                }
        );

        th1.start();
        th2.start();
        th3.start();

        try {
            th1.join();
            th2.join();
            th3.join();
        } catch (Exception e) {}

        System.out.println(count.count);
        System.out.println(count.i);
    }
}