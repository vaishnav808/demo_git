class Student {
    private String name;
    private int rollno;
    private int age;
    private String city;

    public Student(){
        name = "Vaishnav";
        rollno = 0;
        age = 0;
        city = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class DemoClass {
    public static void main(String[] args) {
       Student s1 = new Student()  ;
       


        System.out.println(s1.getName());
    }

    

}
