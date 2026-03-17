package designPattern.factory;
//           FACTORY DESIGN PATTERN
/*
* The Factory Design Pattern is a creational design pattern used to create objects without exposing the
* exact creation logic to the client.Instead of using new directly, you use a factory method to create objects.
* */

abstract class Computer{
    public abstract String getRAM();
    public abstract String getCPU();
    public abstract String getHDD();

    @Override
    public String toString() {
        return "RAM: " + this.getRAM() + ", CPU: " + this.getCPU() + ", HDD: "  + this.getHDD();
    }
}

class PC extends Computer{
    private String ram;
    private String cpu;
    private String hdd;

    public PC(String ram, String cpu, String hdd) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }

    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }
}

class Server extends Computer{
    private String ram;
    private String cpu;
    private String hdd;
    public Server(String ram, String cpu, String hdd) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }
    @Override
    public String getRAM() {
        return this.ram;
    }
    @Override
    public String getCPU() {
        return this.cpu;
    }
    @Override
    public String getHDD() {
        return this.hdd;
    }
}

class ComputerFactory{
    public static Computer getComputer(String type, String ram, String cpu, String hdd){
        switch (type){
            case "PC":
                return new PC(ram,cpu,hdd);
            case "Server":
                return new Server(ram,cpu,hdd);
            default:
                return null;
        }
    }
}

public class FactoryDesign {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("PC","2GB RAM","CPU","500 HDD");
        Computer server = ComputerFactory.getComputer("Server","5GB RAM","CPU","1TB HDD");
        System.out.println(pc);
        System.out.println(server);
    }
}
