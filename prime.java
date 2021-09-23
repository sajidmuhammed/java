import java.util.Scanner;
class Prime {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter a limit:");
        int num=reader.nextInt();
        System.out.println("Prime numbers are: ");
        for(int i=1;i<=num;i++)
        {
            int p=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                    p++;
            }
            if(p==2)
                    System.out.print(" "+i);
 
        }
    }
}
