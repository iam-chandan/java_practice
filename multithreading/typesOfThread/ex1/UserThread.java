package multithreading.typesOfThread.ex1;

/*
-> there are 2 types of thread
    1.User thread
    2.Daemon thread
 */

class UserThread extends Thread{
    public void run(){
        System.out.println("user thread execution started");
        for (int i = 1;i <= 5;i++){
            System.out.println("user thread is executing");
            try {
                Thread.sleep(4000);
            }catch (Exception e){
                System.out.println("Exception occurred");
            }
        }
        System.out.println("user thread execution ended");
    }
}
class DaemonThread extends Thread{
    public void run(){
        System.out.println("Daemon thread execution started");
        for (;;) {
            System.out.println("daemon thread executing");
            try {
                Thread.sleep(4000);
            }catch (Exception e){
                System.out.println("Exception occurred");
            }
        }
//        System.out.println("");
    }
}

class Driver{
    public static void main(String[] args) {
        UserThread ut = new UserThread();
        ut.start();

        DaemonThread dt = new DaemonThread();
        dt.setDaemon(true);
        dt.start();
    }
}