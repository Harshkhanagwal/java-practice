
public class Student {

    //Attributes
    public int id ;
    public String name;
    public int age;
    public int nos;
    private int marks;

    //constructor
    // By default it will set attr. with garbage value.
    public Student(){
        System.out.println("Student Default ctro called");
    }

    // Paremetarised constructor
    public Student(int id, int age, String name , int nos){
        System.err.println("paremetarised Copy constructor called");
        this.id = id;
        this.name = name;
        this.age = age;
        this.nos = nos;
    }

    //copy constructor
    public Student(Student cpObj){
        System.err.println("Student Copy constructor called");
        this.id = cpObj.id;
        this.name = cpObj.name;
        this.age = cpObj.age;
        this.nos = cpObj.nos;
    }



    //methods or behaviors 
    public void study(){
        System.out.println(name + " Studying");
    }

    public  void setMarks(int n){
        this.marks = n;
    }

    public int getMarks(int n){
        return this.marks;
    }



    
}
