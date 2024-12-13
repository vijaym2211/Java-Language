package LLD_Design_Pattern.Protoype;

public class Main {
    public static final String STUDENT_PROTOTYPE_KEY = "STUDENT_PROTOTYPE";
    public static final String INTELLIGENT_STUDENT_PROTOTYPE_KEY = "INT_STUDENT_PROTOTYPE";

    public static void main(String[] args) {
          //For Prototype design pattern
//        Student s1 = new Student(25, "Vijay", "MU");
//        Student s1Copy  =s1.clone();
//        s1Copy.name = "Bhavik";
//
//        Student s2 = new IntelligentStudent(18, "Ajay", "IIT", 101);
//
//        Student s2Copy = s2.clone();
//
//        ((IntelligentStudent)s2Copy).iq = 99;  //object type casting(SOLID - L Principle) for child attrs to access
//        s2Copy.name = "Vinit K";

        //For Registry design pattern
        setupRegistry();
        Student copy = StudentRegistry.getInstance().get(STUDENT_PROTOTYPE_KEY).clone();
        Student intStudentCopy = StudentRegistry.getInstance()
                .get(INTELLIGENT_STUDENT_PROTOTYPE_KEY).clone();

        System.out.println("DEBUG");

    }

    public static void setupRegistry(){
        StudentRegistry registry = StudentRegistry.getInstance();
        Student PrototypeStudent = new Student(25, "Vijay", "MU");
        Student PrototypeIntelligentStudent = new IntelligentStudent(18, "Ajay", "IIT", 101);

        registry.register(STUDENT_PROTOTYPE_KEY, PrototypeStudent);
        registry.register(INTELLIGENT_STUDENT_PROTOTYPE_KEY, PrototypeIntelligentStudent);
    }


}
