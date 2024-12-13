package LLD_Design_Pattern.Protoype;

public class IntelligentStudent extends Student{
    int iq;

    public IntelligentStudent(int age, String name, String university, int iq){
        super(age, name, university);
        this.iq = iq;
    }

    public IntelligentStudent(IntelligentStudent original){
        super(original);
        this.iq = original.iq;
    }

    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }
}
