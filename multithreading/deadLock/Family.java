package multithreading.deadLock;

/*
DEADLOCK:
-> when multiple thread are stuck in block state because they are mutually waiting for each other
   to release the resources that they do not release the resources that is known as deadlock.
 */

class Family implements Runnable{
    String resources1 = "TV";
    String resources2 = "PLAYSTATION";

    public void run(){
        String name = Thread.currentThread().getName();
        if (name.equals("ROHIT")) {
            rohitAcquiredResources();
        }else {
            vijayAccquiredResources();
        }
    }

    void rohitAcquiredResources(){
        synchronized(resources1){
            try{
                System.out.println("rohit acquired TV.");
                Thread.sleep(4000);
                synchronized(resources2){
                    System.out.println("rohit acquired playstation ");
                    Thread.sleep(4000);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    void vijayAccquiredResources(){
        synchronized (resources2){
            try{
                System.out.println("vijay acquired playstation");
                Thread.sleep(4000);
                synchronized (resources1){
                    System.out.println("vijay acquired TV");
                    Thread.sleep(4000);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
class Driver{
    public static void main(String[] args) {
        Family f = new Family();
        Thread t1 = new Thread(f);
        Thread t2 = new Thread(f);

        t1.setName("ROHIT");
        t2.setName("VIJAY");

        t1.start();
        t2.start();
    }
}