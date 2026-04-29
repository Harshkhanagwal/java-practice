package Inheritancee.Organization;

public class Emp {
    public int empID;
    public String name;
    public String role;

    public Emp(int id, String name, String role) {
        this.empID = id;
        this.name = name;
        this.role = role;
    }

    public void displayInfo() {
        System.out.println("Emp. Id   : " + this.empID);
        System.out.println("Emp. Name : " + this.name);
        System.out.println("Role      : " + this.role);
    }
}

class Developer extends Emp {
    private String techStack;

    public Developer(int id, String name, String stack) {
        super(id, name, "Developer");
        this.techStack = stack;
    }

    public void code() {
        System.out.println(this.name + " is coding for new project with " + this.techStack);
    }
}

class Executive extends Emp {

    public Executive(int id, String name) {
        super(id, name, "Executive");
    }

    public void decide() {
        System.out.println(this.name + " is taking decisions.");
    }
}

class Ceo extends Executive {

    public Ceo(int id, String name) {
        super(id, name);
        this.role = "CEO";
    }
}

class Hr extends Emp {

    public Hr(int id, String name) {
        super(id, name, "HR");
    }

    public void interview() {
        System.out.println(this.name + " is taking interview.");
    }
}

class HrHead extends Hr {

    public HrHead(int id, String name) {
        super(id, name);
        this.role = "HR Head";
    }

    public void manageHRdep() {
        System.out.println(this.name + " is managing HR department.");
    }
}

interface ProjectHead {
    void managingProject();
}

interface TeamLead {
    void leading();
}

class Techlead extends Emp implements ProjectHead, TeamLead {

    private String project;
    private int teamSize;

    public Techlead(int id, String name, String project, int teamSize) {
        super(id, name, "Tech Lead");
        this.project = project;
        this.teamSize = teamSize;
    }

    public void managingProject() {
        System.out.println(this.name + " is managing project: " + this.project);
    }

    public void leading() {
        System.out.println(this.name + " is leading a team of " + this.teamSize + " employees.");
    }
}

