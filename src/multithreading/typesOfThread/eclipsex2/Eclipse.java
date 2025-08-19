package multithreading.typesOfThread.eclipsex2;

class Eclipse extends Thread{
    public void run(){
        Thread t = Thread.currentThread();
        String name = t.getName();
        if (name.equals("TYPE")){
            codeType();
        }else if (name.equals("COMPLETE")){
            codeComplete();
        }else {
            autoSave();
        }
    }

    public void codeType(){
        System.out.println("code typing started");
        for (int i = 1; i <= 5; i++) {
            System.out.println("code is typing");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("code typing ended");
    }

    public void codeComplete(){
        for (;;) {
            System.out.println("code completing");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void autoSave(){
        for (;;){
            System.out.println("Auto saving code..");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Driver{
    public static void main(String[] args) {
        Eclipse e1 = new Eclipse();
        Eclipse e2 = new Eclipse();
        Eclipse e3 = new Eclipse();

        e1.setName("TYPE");
        e2.setName("COMPLETE");
        e2.setDaemon(true);
        e3.setName("SAVE");
        e3.setDaemon(true);

        e1.start();
        e2.start();
        e3.start();
    }
}