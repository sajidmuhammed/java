import java.util.Scanner;
class circle{
   double c,a;
   public void area(int z)
   {
     a=3.14*z*z;
     System.out.print("Area: "+a);
   }
   public void circumference(int z)
   {
     c= 2*3.14*z;
     System.out.print("Circumference: "+c);
   }

   public static void main(String args[])
   {
     int cen,r;
     Scanner reader = new Scanner(System.in);
     System.out.print("Enter radius: ");
     r=reader.nextInt();
     System.out.print("Enter center: ");
     cen=reader.nextInt();
     circle acircle=new circle();
     acircle.area(r); 
     acircle.circumference(r);
   }
}