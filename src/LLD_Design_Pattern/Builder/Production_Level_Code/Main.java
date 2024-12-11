package LLD_Design_Pattern.Builder.Production_Level_Code;

public class Main {
    public static void main(String[] args) throws Exception {
        /*
        1. Get rid of 2 classes and have a single class.
        2. Make the builder a static inner class
        3. Hide the Builder class via a static method called getBuilder inside Student which return obj of builder
        4. In all the setters of Builder, return the builder object class // Method Chaining
        5. We will create build method inside Builder */

//        Student.Builder sb = new Student.Builder(); //for client not known our inner class exist
                                   // we use below line to hind followed step 2
        Student sb = Student.getBuilder()
                .setAge(25)
                .setName("Vijay")
                .setEmail("vijay123@gmail.com")
                .setUniversity("University of Munbai")
                .setYearOfGraduation(2021)
                .Build();

        // Student s1 = new Student(new Student.Builder());
    }
}
