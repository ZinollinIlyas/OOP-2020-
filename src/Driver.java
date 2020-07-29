import java.util.*;
import java.io.*;

public class Driver {
    public static void choice(){
        System.out.println("1) Admin");
        System.out.println("2) User");
        System.out.println("3) Exit");
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Who you are?");
        while(true){
            Driver.choice();
            int option = sc.nextInt();
            if (option == 1) {
                Admin.Mode();
            }
            if (option ==2){
                User.Mode();
            }
            if (option == 3){
                System.exit(0);
            }
        }





    }
}
