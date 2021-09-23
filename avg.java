import java.util.Scanner;
import java.lang.Exception;
public class avg {
    public static void main(String[] args){
        try {
            int i, n, sum=0;
            double average=0;
            int elem[]=new int[40];
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter number of elements: ");
            n = reader.nextInt();
            System.out.println("Enter elements: ");
            for (i = 0; i < n; i++) {
                elem[i] = reader.nextInt();
                if (elem[i] < 0){
                    throw new Exception("Number is negative");
                }
                //System.out.print(elem[i]);
            }
            for(i=0;i<n;i++) {
                if (elem[i] >= 0) {
                    sum = elem[i] + sum;
                }
        }
                average = sum/n;
                System.out.print("\nAverage is " +average);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
