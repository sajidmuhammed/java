import java.lang.Runnable;
import java.lang.Thread;
import java.util.Scanner;
public class thread2 {
    public static void main(String[] args) {
        Runnable r1 = new Runnable1();
        Thread t1 = new Thread(r1);
        Runnable r2 = new Runnable2();
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
class Runnable1 implements Runnable{
    public void run(){
        int num1=0,num2=1,num3,i;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the limit for fibonacci series :");
        int n=reader.nextInt();
        System.out.print("\nFibonacci series is: \n");
        System.out.print(num1);
        System.out.print( num2);
        for(i=2;i<n;++i)
        {
            num3=num1+num2;
            System.out.print(" "+num3);
            num1=num2;
            num2=num3;
        }
    }
}
class Runnable2 implements Runnable{
    public void run(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the limit for even numbers :");
        int n=reader.nextInt();
        System.out.println("\nEven Numbers are :");
        for(int i=1;i<=n;i++)
        {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
 
 
