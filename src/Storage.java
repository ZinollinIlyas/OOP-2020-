import java.io.*;
import java.util.Vector;

public class Storage {
    public static Vector<Course> courses = new Vector<>();
    public static Vector<Instructor> instructors = new Vector<>();
    public static Vector<Textbook> textbooks = new Vector<>();

    public static void save() throws IOException {
        Storage.serializeCourses();
        Storage.serializeInstructors();
        Storage.serializeTextbooks();

    }

    public static void showCourse() throws IOException, ClassNotFoundException {
        Storage.deserializeCourses();
    }

    public static void serializeCourses() throws IOException {
        FileOutputStream fos = new FileOutputStream("courses.out");
       ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(courses);
        oos.close();
        fos.close();
    }

    public static void serializeInstructors() throws IOException {
        FileOutputStream fos = new FileOutputStream("instructors.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(instructors);
        oos.close();
        fos.close();
    }

    public static void serializeTextbooks() throws IOException {
        FileOutputStream fos = new FileOutputStream("textbooks.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(textbooks);
        oos.close();
        fos.close();
    }

    public static void deserializeCourses() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("courses.out");
        ObjectInputStream ois = new ObjectInputStream(fis);
        courses = (Vector<Course>) ois.readObject();
        ois.close();
        fis.close();
        System.out.println(courses);
    }
    public static void deserializeInstructors() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("instructors.out");
        ObjectInputStream ois = new ObjectInputStream(fis);
        instructors = (Vector<Instructor>) ois.readObject();
        ois.close();
        fis.close();
        System.out.println(instructors);
    }

    public static void deserializeTextbooks() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("textbooks.out");
        ObjectInputStream ois = new ObjectInputStream(fis);
        textbooks = (Vector<Textbook>) ois.readObject();
        ois.close();
        fis.close();
        System.out.println(textbooks);
    }

    public static void addCourse(Course course) {
        Storage.courses.add(course);
    }

    public static void addInstructor(Instructor instructor) {
        Storage.instructors.add(instructor);
    }

    public static void addTextbooks(Textbook textbook){
        Storage.textbooks.add(textbook);
    }




}

