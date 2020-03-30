package People;

public abstract class CommunityMember {


    private String name;
    public int age;



    //Parameterized constructor
    public CommunityMember(String name){
        this.name = name;
    }

    public CommunityMember(int age) {
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge() {
        return age;
    }
    //method
    public abstract void job();



}
