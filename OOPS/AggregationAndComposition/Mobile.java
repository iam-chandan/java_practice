package OOPS.AggregationAndComposition;

class Charger{
    private String brand;
    private int voltage;

    public Charger(String brand, int voltage) {
        this.brand = brand;
        this.voltage = voltage;
    }

    public String getBrand() {
        return brand;
    }

    public int getVoltage() {
        return voltage;
    }
}

class OS{
    private String name;
    private int size;

    public OS(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}

public class Mobile {
    OS os = new OS("Android",512); //compostion

    void hasA_Charger(Charger charger){//aggregation
        System.out.println(charger.getBrand());
        System.out.println(charger.getVoltage());
    }
}

class Driver{
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        Charger charger = new Charger("oneplus",25);
        System.out.println(mobile.os.getName());
        System.out.println(mobile.os.getSize());
        mobile.hasA_Charger(charger);

        mobile = null;
        /*
        os is composition bcz tightly bound so mobile object get destroyed we can access the os but
        charger is aggregation bcz loosely bound so after mobile object destroy also we can access using his object
        System.out.println(mobile.os.getName());
        System.out.println(mobile.os.getSize());
        mobile.hasA_Charger(charger);
        */

        System.out.println(charger.getBrand());
        System.out.println(charger.getVoltage());
    }
}