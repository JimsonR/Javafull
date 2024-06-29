import java.util.Optional;

class Student{
    String name;
    int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    String getName(){
        return name;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class Optionals {
    public static void main(String[] args) {
//        Student student = getStudent();
        Optional<Student> std = getStudent();
        Student s1 = std.orElse(new Student("John", 20));
        s1.display();
        String student = std.map(Student::getName).orElse("Empty");
        System.out.println(student);



//        student.display();


    }
//    static Student getStudent(){
//        Student student = new Student("James", 25);
//        return null;
//    }
    static Optional<Student> getStudent(){
        Student student = new Student("James", 25);
//        return Optional.of(student);
    return Optional.ofNullable(student);
    }
}
