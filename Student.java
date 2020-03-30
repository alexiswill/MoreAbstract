package People;

public class Student extends CommunityMember{


    public Student(int age){
        super(age);
    }
    public Student(String name) {
        super(name);
    }

    public String getName() {
        return super.getName();
    }

    public int getAge() {
        return super.getAge();
    }


    @Override
    public void job() {
        System.out.println("Student's job is school.");

    }
}

