import java.util.Scanner;
class biggest {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1=reader.nextInt();
        System.out.print("Enter second number:");
        int num2=reader.nextInt();
        System.out.print("Enter third number:");
        int num3=reader.nextInt();
        if(num1>num2&&num1>num3)
        System.out.print("The number "+num1+" is bigger"); 
        else if(num2>num1&&num2>num3)
        System.out.print("The number "+num2+" is bigger");
        else
        System.out.print("The number "+num3+" is bigger");
    }
}
