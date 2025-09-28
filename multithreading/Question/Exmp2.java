package multithreading.Question;

/*
-> as in previous example we have seen that main thread always start first and close also first so it may cause
   some problem so to finish main thread last we use join() method so that it will close last.
 */

class Exmp2 extends Thread{
    public void run(){
        System.out.println("printing character started");
        for (int i = 65; i <= 75; i++) {
            System.out.println((char) i);
            try{
                Thread.sleep(2000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("printing character ended");
    }
}
class Driver2{
    public static void main(String[] args) {
        System.out.println("main thread started estd connection");
        Exmp2 emp2 = new Exmp2();
        emp2.start();
        try {
            emp2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main thread ended connection");
    }
}