import java.util.Scanner;
    class product{
        String pcode,pname;
        float price;
        product(){
            pcode=" ";
            pname=" ";
            price=0;
        }
        public void input(){
            Scanner reader=new Scanner(System.in);
            System.out.print("Enter product code :");
            pcode=reader.nextLine();
            System.out.print("Enter product name :");
            pname=reader.nextLine();
            System.out.print("Enter product price :");
            price=reader.nextFloat();
        }
        public product lowest(product p1,product p2){
            product temp=new product();
            if(this.price<p1.price && this.price<p2.price)
                temp=this;
            else if(p1.price<this.price && p1.price<p2.price)
                temp=p1;
            else if(p2.price<this.price && p2.price<p1.price)
                temp=p2;
            return temp;
        }
        public void output() {
            System.out.println("PRODUCT CODE:"+pcode);
            System.out.println("PRODUCT NAME:"+pname);
            System.out.println("PRODUCT PRICE:"+price+"\n");
        }
    };
    public class productlowest {
        public static void main(String[] args) {
            product p1 = new product();
            product p2 = new product();
            product p3 = new product();
            product result = new product();
            System.out.print("Enter details of product1\n ");
            p1.input();
            System.out.print("\nEnter details of product2\n ");
            p2.input();
            System.out.print("\nEnter details of product3\n ");
            p3.input();
            result = p3.lowest(p1, p2);
            System.out.println("\nDetails of Product1 ");
            p1.output();
            System.out.println("Details of Product2");
            p2.output();
            System.out.println("Details of Product3");
            p3.output();
            System.out.println("Product with Lowest Price");
            result.output();

        }
    }
