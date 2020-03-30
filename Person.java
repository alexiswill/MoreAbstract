package People;

public  class Person {

    public static void main(String[] args) {

        Student student1 = new Student("Akiza");
        student1.age = 23;
        System.out.println("Akiza is " + (student1.age) + " years old");
        student1.job();

        Alumnus alum1 = new Alumnus("Loki");
        alum1.age = 26;
        System.out.println("Loki is " + (alum1.age) + " years old");
        alum1.job();

        StaffMember sm1 = new StaffMember("Kohaku");
        sm1.age = 34;
        System.out.println("Kohaku is " + (sm1.age) + " years old");
        sm1.job();

        Teacher t1 = new Teacher("Moira");
        t1.age = 44;
        System.out.println("Moira is " + (t1.age) + " years old");
        t1.job();

        Administrator admin1 = new Administrator("Tsubasa");
        admin1.age = 47;
        System.out.println("Tsubasa is " + (admin1.age) + " years old");
        admin1.job();



    }
}





