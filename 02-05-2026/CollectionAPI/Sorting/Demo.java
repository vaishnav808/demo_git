
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Student implements Comparable<Student>{
    String name;
    int age;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("name=").append(name);
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Student o) {

        if(this.age < o.age){
            return 1;
        }else{
            return -1;
        }
       
    }

    



}

public class Demo {
    public static void main(String[] args) {
        
        List <Student> students = new ArrayList<Student>();

        students.add(new Student(30, "Ram"));
        students.add(new Student(20, "Shyam"));
        students.add(new Student(25, "Mohan"));
       
        Collections.sort(students);

        for(Student s: students){
            System.out.println(s);
        }





    }
}
