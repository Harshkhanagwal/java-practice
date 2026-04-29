package Inheritancee.Organization;

public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer(101, "Harsh", "MERN Stack");
        dev.displayInfo();
        dev.code();

        System.out.println();

        Executive exe = new Executive(102, "Amit");
        exe.displayInfo();
        exe.decide();

        System.out.println();

        Ceo ceo = new Ceo(103, "Rohit");
        ceo.displayInfo();
        ceo.decide();

        System.out.println();

        Hr hr = new Hr(104, "Priya");
        hr.displayInfo();
        hr.interview();

        System.out.println();

        HrHead hrHead = new HrHead(105, "Neha");
        hrHead.displayInfo();
        hrHead.interview();
        hrHead.manageHRdep();

        System.out.println();

        Techlead tl = new Techlead(106, "Arjun", "AI Project", 5);
        tl.displayInfo();
        tl.managingProject();
        tl.leading();

    }
}
