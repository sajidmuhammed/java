import java.util.Scanner;
import java.lang.Exception;
class UsernameException extends Exception {
    UsernameException(String msg) {
       System.out.print(msg);
    }
}
class PasswordException extends Exception {
    PasswordException(String msg) {
        System.out.print(msg);
    }
}
public class namepass {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String username, password;
        System.out.print("Enter username: ");
        username = reader.nextLine();
        System.out.print("Enter password: ");
        password = reader.nextLine();
        int len = username.length();
        try {
            if(len < 8)
                throw new UsernameException("Username must be greater than 8 characters\n");
            else if(!password.equals("admin"))
                throw new PasswordException("Incorrect password\n");
            else
                System.out.println("Login Successful");
        }
        catch (UsernameException u) {
        }
        catch (PasswordException p) {
        }
    }
}
 
