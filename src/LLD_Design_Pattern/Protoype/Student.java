package LLD_Design_Pattern.Protoype;

public class Student {
    private int age;
    public String name;
    public String university;

    public Student(int age, String name, String university){
        this.age = age;
        this.name = name;
        this.university = university;
    }

    public Student(Student original){   //Copy constructor
        this.age = original.age;
        this.name = original.name;
        this.university = original.university;
    }

    //copy constructor helping colne to copy and allocate to new memory location for new object
    public Student clone(){
        return new Student(this);
    }

}
