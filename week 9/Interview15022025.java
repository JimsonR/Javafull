import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
    String name;
    int id;
    String dept;

    public Employee(String name, int id, String dept) {
        this.name = name;
        this.id = id;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", dept='" + dept + '\'' +
                '}';
    }
}

//interface OnlyDept <T> extends Predicate<String> {
//   boolean filetDept(T dept);
//}

public class Interview15022025 {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Prakash",1,"DS");
        Employee emp2 = new Employee("Gupta",2,"Java");
        Employee emp3 = new Employee("Vineet",3,"Dot");

        Employee[] emps = {emp1,emp2,emp3};

        ArrayList<Employee> employees = new ArrayList<>();
        Collections.addAll(employees,emps);

        Stream stream = Stream.of(employees).flatMap(x-> x.stream()).map(x->x.name);
        System.out.println(stream.toList());

        List<String> names = employees.stream().map(x->x.name).collect(Collectors.toList());

        Predicate<String> deptFilter = (empl)->{
           return empl.equals("Java");
        };

        List<Employee> filetByDept = employees.stream().filter(x-> deptFilter.test(x.dept)).toList();

        String s1 = new String("asd");
        String s2 = s1;
        System.out.println(s1==s2);

        System.out.println(filetByDept);











    }
}
