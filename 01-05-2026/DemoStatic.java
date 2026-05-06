class Student{

    private String name;
    private int rollno;
    private int age;
    private static String college = "ABC College";

    public Student(){
        name = "Vaishnav";
        rollno = 0;
        age = 0;
        college = "ABC College";
    }

    public String getName() {
        return name;
    }

    public static String getCollege() {
        return college;
    }

    static {
        System.out.println("Static block executed");
    }

}






public class DemoStatic {
    public static void main(String[] args) throws ClassNotFoundException {
      
         Class.forName("Student");
    }
}
