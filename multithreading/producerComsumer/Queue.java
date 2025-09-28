package multithreading.producerComsumer;

class Queue {
    int x;
    boolean is_data_present = false;
    synchronized void store(int j){
        try {
            if (is_data_present == false){
                x = j;
                System.out.println("Producer : "+x);
                is_data_present = true;
                notify();
            }else {
                    wait();
            }
        } catch (InterruptedException e) {
            System.out.println("exception handled in store");
        }
    }

    synchronized void retrieve(){
        try{
            if(is_data_present){
                System.out.println("Consumer : " + x);
                is_data_present = false;
                notify();
            }else {
                wait();
            }
        }catch (Exception e){
            System.out.println("exception handled in retrieve");
        }
    }
}
class Producer extends Thread{
    Queue queue;

    public Producer(Queue queue){
        this.queue = queue;
    }
    public void run(){
        int i = 1;
        for (;;){
            queue.store(i++);
        }
    }
}
class Consumer extends Thread{
    Queue queue;
    public Consumer(Queue queue){
        this.queue = queue;
    }

    public void run(){
        for (;;){
            queue.retrieve();
        }
    }
}
class Driver{
    public static void main(String[] args) {
        Queue queue = new Queue();

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        producer.start();
        consumer.start();
    }
}









