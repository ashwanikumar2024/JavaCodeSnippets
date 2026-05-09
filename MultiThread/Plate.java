package MultiThread;

public class Plate {
    String item = null;

    synchronized void eat(){
        while(item == null){
            try {
                wait();
            } catch (InterruptedException e) {}
        }

        System.out.println("Customer is eating " + item);
        item = null;
        notify();
    }

    synchronized void serve(){
        while(item != null){
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        item = i;
        notify();
    }
}

class Main7{
    public static void main(String[] args){
        Plate p1 = new Plate();

        Thread chef = new Thread(()->{
            p1.serve("Paneer Tikka");
        });

        Thread customer = new Thread(()->{
            p1.eat();
        });
        customer.start();
        chef.start();
    }
}