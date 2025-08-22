package multithreading.Question;

class JoinExmp extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            try{
                System.out.println("JAVA");
                Thread.sleep(2000);
            }catch (Exception e){
                System.out.println("Exception handled");
            }
        }
    }
}
class Driver3{
    public static void main(String[] args) {
        System.out.println("main thread started execution");
        JoinExmp je = new JoinExmp();
        je.start();
        try {
            je.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("main thread completed execution");
    }
}