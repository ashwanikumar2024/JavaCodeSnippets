class MyThread1 extends Thread{
    public void run(){
        for(int i=0; i < 10; i++){
            System.out.println(i);
            try{
                Thread.sleep(500);
            } catch(InterruptedException obj){}
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        MyThread1 th = new MyThread1();
        th.start();
        for (int i = 2304; 1 < 2370; i++) {
            System.out.println((char) i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException obj) {
            }
        }
    }
}
class Main3 {
    public static void main(String[] args) {
        MyThread2 th2 = new MyThread2();
        th2.start();

    }
}