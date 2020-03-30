package People;

public class Teacher extends FacultyMember {
    public Teacher(int age) {
        super(age);
    }

    public Teacher(String name) {
        super(name);
    }

    public void job() {
        System.out.println("Teacher's job is to teach the students");

    }
}
