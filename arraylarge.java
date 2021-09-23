import java.util.Scanner;
class arraylarge {
    public static void main(String[] args) {
        int n;
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter number of elements:");
         n=reader.nextInt();
        int num[]=new int[n];
        System.out.print("Enter array elements:");
        for(int i=0;i<n;i++)
        {
            num[i]=reader.nextInt();
        } 
        int max=num[0];
        for(int i=0;i<n;i++)
        {
            if(max<num[i])
            {
            max=num[i];
            }
        }
         System.out.print("Largest value in array is "+max);
    }
}
