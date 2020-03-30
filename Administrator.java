package People;

public class Administrator extends FacultyMember {

    public Administrator(int age) {
        super(age);
    }

    public Administrator(String name) {
        super(name);
    }

    public void job() {
        System.out.println("Administrator's job is to keep both students and staff in check.");

    }
}
