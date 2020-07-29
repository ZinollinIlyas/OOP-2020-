import java.io.IOException;
import java.util.Scanner;

public class User {
    public static void choice() {
        System.out.println("1) View Courses");
        System.out.println("2) Exit");
    }


    public static void Mode() throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to do?");
        int choice;
        while (true) {
            User.choice();
            int option = scanner.nextInt();
            if (option == 1) {
                Storage.showCourse();

            }

            else if (option == 2) {
                System.exit(0);
            }
        }
    }
}