import java.util.Scanner;
class oddeven {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=reader.nextInt();
        if(num%2==0)
        System.out.print("Even number"); 
        else
        System.out.print(" Odd number");
    }
}
