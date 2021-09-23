import java.util.Scanner;
interface sports {
   // float smark=0;
    void sinput();
    void soutput();
}
class student {
    Scanner reader=new Scanner(System.in);
    int rolln;
    float amark;
    student(){
        rolln=0;
        amark=0;
    }
    void stinput(){
        System.out.print("Enter roll number: ");
        rolln=reader.nextInt();
        System.out.print("Enter academic mark: ");
        amark=reader.nextFloat();
    }
    void stoutput(){
        System.out.println("\nRoll number: "+rolln);
        System.out.println("Academic mark: "+amark);
    }
}
class result extends student implements sports{
    Scanner reader=new Scanner(System.in);
    float tot,smark;
    public void sinput(){
        System.out.print("Enter sports mark: ");
        smark = reader.nextFloat();
    }
    public void soutput() {
        System.out.println("Sports mark: "+smark);
        tot=amark+smark;
        System.out.println("Total mark: "+tot);
    }
}
class studinheritence{
    public static void main(String[] args){
        result r=new result();
        r.stinput();
        r.sinput();
        r.stoutput();
        r.soutput();
    }
}