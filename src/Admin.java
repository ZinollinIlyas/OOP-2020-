import java.io.*;
import java.util.*;


public class Admin {
    public static void choice() {
        System.out.println("What do you want to do?");
        System.out.println("1) Add instructor");
        System.out.println("2) Add course");
        System.out.println("3) Textbook");
        System.out.println("4) Exit");
    }

    public static void Mode() throws IOException {
        Date date = new Date();

        Scanner sc = new Scanner(System.in);

         FileWriter adminFileWriter = new FileWriter("admin.txt", true);
             FileWriter instructorFileWriter = new FileWriter("instructor.txt", true);
             FileWriter courseFileWriter = new FileWriter("course.txt", true);
             FileWriter textbookFileWriter = new FileWriter("textbook.txt", true);
         {
            adminFileWriter.write(date + " admin logged into a system\n");
            int choice;
            while (true) {
                Admin.choice();
                choice = sc.nextInt();
                if (choice == 1) {
                    System.out.print("Type instructor first name : ");
                    String firstName = sc.next();

                    System.out.print("Type instructor last name : ");
                    String lastName = sc.next();

                    System.out.print("Type instructor department : ");
                    String department = sc.next();

                    System.out.print("Type instructor email : ");
                    String email = sc.next();

                    adminFileWriter.write(date + " admin added new instructor " + firstName );
                    instructorFileWriter.write(email + " : " + Objects.hash("1111" + "\n"));
                    instructorFileWriter.write(firstName + " " + lastName + " " + department + " " + email);
                    Instructor instructor = new Instructor(firstName, lastName, department, email);
                    Storage.addInstructor(instructor);



                } else if (choice == 2) {
                    System.out.print("Type course title : ");
                    String courseTitle = sc.next();

                    System.out.print("Type the name of the book : ");
                    String bookTitle = sc.next();
                    System.out.print("Type book author : ");
                    String bookAuthor = sc.next();
                    System.out.print("Type isbn of the book : ");
                    String isbn = sc.next();

                    System.out.print("Type instructor's first name : ");
                    String firstName = sc.next();
                    System.out.print("Type instructor's last name : ");
                    String lastName = sc.next();
                    System.out.print("Type instructor's department : ");
                    String department = sc.next();
                    System.out.print("Type instructor's email : ");
                    String email = sc.next();

                    Textbook textbook = new Textbook(isbn, bookTitle, bookAuthor);
                    Instructor instructor = new Instructor(firstName, lastName, department, email);
                    Storage.addCourse(new Course(courseTitle, textbook, instructor));

                    courseFileWriter.write(courseTitle + "," + bookTitle + "," + bookAuthor + "," + isbn + "," + firstName + "," + lastName + "," + department + "," +email);

                    System.out.println("The course " + courseTitle + " has been successfully added");


                    instructorFileWriter.write(email + " : " + Objects.hash("1111"));
                    instructorFileWriter.write(System.lineSeparator());

                    adminFileWriter.write(date + " admin added new course " + courseTitle + "\n");
                    adminFileWriter.write(date + " admin added  new textbook " + bookTitle + " \n");

                } else if (choice == 3) {
                    System.out.print("Type textbook isbn : ");
                    String isbn= sc.next();

                    System.out.print("Type textbook Title : ");
                    String bookTitle = sc.next();

                    System.out.print("Type textbook author : ");
                    String bookAuthor = sc.next();

                   Textbook textbook = new Textbook(isbn, bookTitle, bookAuthor);
                   Storage.addTextbooks(textbook);
                } else if (choice == 4) {
                    adminFileWriter.close();
                    instructorFileWriter.close();
                    courseFileWriter.close();
                    textbookFileWriter.close();
                    Storage.save();
                    System.exit(0);
                } else {
                    System.out.println("ERROR");
                }
            }

        }
    }


}
