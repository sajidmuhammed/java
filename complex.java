import java.util.Scanner;
class cpuinfo{
    int price;
    class Processor{
        String Manufacturer, cores;
    }
    static class Ram{
        String Manufacturer;
        int mem;
    }
}
class Computer{
    public static void main(String args[]){
        cpuinfo cpu = new cpuinfo();
        cpuinfo.Processor p=cpu.new Processor();
        cpuinfo.Ram r=new cpuinfo.Ram();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The CPU Details\n");
        System.out.print("Enter RAM Manufacture Name : ");
        r.Manufacturer=in.next();
        System.out.print("Enter RAM Memory : ");
        r.mem=in.nextInt();
        System.out.print("Enter Processor Manufacture Name : ");
        p.Manufacturer=in.next();
        System.out.print("Enter No.Of.Cores : ");
        p.cores=in.next();
        System.out.print("Enter CPU Price : ");
        cpu.price=in.nextInt();
        System.out.println("\nCPU Details");
        System.out.println("\nRAM Manufacture Name : "+ r.Manufacturer);
        System.out.println("RAM Memory : "+ r.mem);
        System.out.println("Processor Manufacture Name : "+ p.Manufacturer);
        System.out.println("No.Of.Cores : "+ p.cores);
        System.out.println("CPU Price : "+ cpu.price);
  } }
 
