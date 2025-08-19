package multithreading.Question;

/*
-> main thread always first to start executing and also first to finish executing.
 */

class Exmp1 extends Thread{
    public void run(){
        System.out.println("print character started");
        for (int i = 65; i <= 75; i++) {
            System.out.println((char) i);
            try {
                Thread.sleep(2000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("printing character ended");
    }
}
class Driver1{
    public static void main(String[] args) {
        System.out.println("main thread started estd connection");
        Exmp1 emp = new Exmp1();
        emp.start();
        System.out.println("main thread ended estd connection");
    }
}