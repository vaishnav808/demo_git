import java.io.*;

class Student implements  Serializable {
    String name;
    int age;

    public Student(String name , int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Demo{
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        Student student = new Student("Navin", 20);
        File file = new File("student.ser");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        BufferedOutputStream oos = new BufferedOutputStream(new FileOutputStream(file));
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(oos);    
        objectOutputStream.writeObject(student);
        objectOutputStream.close();

        BufferedInputStream ois = new BufferedInputStream(new FileInputStream(file));
        ObjectInputStream objectInputStream = new ObjectInputStream(ois);
        Student deserializedStudent = null;
        deserializedStudent = (Student) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(deserializedStudent);
    }
}