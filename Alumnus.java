package People;

public class Alumnus extends CommunityMember {

    public Alumnus(int age){
        super(age);
    }
    public Alumnus(String name) {
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
        System.out.println("Alumnus' job is to be announced.");

    }
}

