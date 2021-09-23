import java.util.Scanner;
class sumavg {
    public static void main(String[] args) {
        int n,sum=0;
        float avg=0;
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter number of elements:");
         n=reader.nextInt();
        int num[]=new int[n];
        System.out.print("Enter array elements:");
        for(int i=0;i<n;i++)
        {
            num[i]=reader.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum=sum+num[i];       
        }
        avg=(float)sum/n;
         System.out.println("Sum of elements : "+sum);
         System.out.println("Average of elements : "+avg);
    }
}
