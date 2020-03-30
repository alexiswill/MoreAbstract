package People;

public class StaffMember extends Employee{

    public StaffMember(String name) {
        super(name);
    }

    public StaffMember(Integer age) {
        super(age);
    }

    public void job() {
        System.out.println("Staff member's job is to make sure everything in the school runs smoothly.");

    }
}
