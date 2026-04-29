
public class App {
    public static void main(String[] args) {
        
        Student A = new Student();
        A.id = 1;
        A.name = "Harsh";
        A.age = 14;
        A.nos = 5;
        System.out.println(A.name);

        Student student2 = new Student(2, 18, "Anjali", 5);
        System.out.println(student2.name);

        Student student3 = new Student(student2);
        System.out.println(student3.name);

    }
}
