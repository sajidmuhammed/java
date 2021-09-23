import java.util.Scanner;
public class employee {
    int empid;
    String name;
    float salary;
    String address;
    public employee() {
        empid = 0;
        name = " ";
        salary = 0;
        address = " ";
    }
    public void input() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the employee number : ");
        empid = reader.nextInt();
        System.out.print("Enter the employee name : ");
        name = reader.next();
        System.out.print("Enter the employee salary : ");
        salary = reader.nextFloat();
        System.out.print("Enter the employee address : ");
        address = reader.next();
    }
}
class teacher extends employee {
    String dept,sub;
    //String sub[];
    public teacher(){
        dept=" ";
        sub=" ";
    }
    public void data() {
        //int m;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the department : ");
        dept = reader.next();
        //System.out.print("Enter the number of subjects: ");
        //m=reader.nextInt();
        //String[] sub=new String[50];
        System.out.print("Enter the subject taught : ");
        sub=reader.next();
        //for (int i = 0; i<m; i++){
          //  sub[i] = reader.nextLine();
       // }
    }
    public void output() {
        System.out.println("Employee id = " + empid);
        System.out.println("Employee name = " + name);
        System.out.println("Employee salary = " + salary);
        System.out.println("Employee address = " + address);
        System.out.println("Employee department = " + dept);
        System.out.println("Subject taught = "+sub);
        //for (int i=0; i<sub.length; i++) {
        //    System.out.println(sub[i]+" ");
        //}

    }
    public static void main(String[] args) {
        int n;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the number of Employees: ");
        n = reader.nextInt();
        teacher t[] = new teacher[n];
        for (int i = 0; i < n; i++) {
            t[i] = new teacher();
            t[i].input();
            t[i].data();
            System.out.print("\n");
        }
        System.out.println("EMPLOYEE DETAILS: ");
        for (int i = 0; i < n; i++) {
            t[i].output();
            System.out.print("\n");
        }
    }
}


