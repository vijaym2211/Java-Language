package LLD_Design_Pattern.Builder.Bacic;

public class Main {
    public static void main(String[] args) throws Exception {
        Builder builder = new Builder();
        builder.setAge(25);
        builder.setName("Vijay");
        builder.setEmail("vijay123@gmail.com");
        builder.setUniversity("University of Munbai");
        builder.setYearOfGraduation(2021);

        Student student = new Student(builder);
        System.out.println("Student object is ready");
    }
}
