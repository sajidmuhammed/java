import java.util.Scanner;
class posneg {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=reader.nextInt();
        String res=(num>0) ? "Positive":(num<0)?"Negative":"Zero";
         System.out.println("The number "+num+" is a "+res+" number");   
    }
}
