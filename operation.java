package arithmetic;
import java.util.Scanner;
public class operation {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = reader.nextInt();
        int b = reader.nextInt();
        arthmtc m = new arthmtc();
        m.add(a, b);
        m.sub(a, b);
        m.div(a, b);
        m.multi(a, b);
    }
}
package arithmetic;
interface arthop{
    void add(int x,int y);
    void sub(int x,int y);
    void div(int x,int y);
    void multi(int x,int y);
}
public class arthmtc {
    void add(int x,int y){
        System.out.println("ADDITION: "+(x+y));
    }
    void sub(int x,int y){
        System.out.println("SUBTRACTION: "+(x-y));
    }
    void div(int x,int y){
        System.out.println("DIVISION: "+(x/y));
    }
    void multi(int x,int y){
        System.out.println("MULTIPLICATION: "+(x*y));
    }
}
