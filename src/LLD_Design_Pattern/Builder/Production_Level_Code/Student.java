package LLD_Design_Pattern.Builder.Production_Level_Code;

public class Student {
    // compulusory attrs
    String name;
    String email;
    int age; // condition: > 18

    // optional attributes
    String university;
    int yearOfGraduation;

    public static Builder getBuilder(){
        return new Builder();
    }

    private Student(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.university = builder.university;
        this.yearOfGraduation = builder.yearOfGraduation;
    }

    static class Builder {
        // compulusory attrs
        String name;
        String email;
        int age; // condition: > 18

        // optional attributes
        String university;
        int yearOfGraduation;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Builder setYearOfGraduation(int yearOfGraduation) {
            this.yearOfGraduation = yearOfGraduation;
            return this;
        }
        public Student Build() throws Exception {
            //Validations here
            if(age < 18){
                throw new Exception("Age cannot be less than 18");
            }
            if(!(name !=null && email != null)){
                throw new Exception("Compulsory attrs should be present");
            }
            //Call the constructor of student and return the student object
            return new Student(this);
        }
    }
}


