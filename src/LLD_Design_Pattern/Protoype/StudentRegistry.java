package LLD_Design_Pattern.Protoype;

import javax.swing.plaf.synth.SynthRadioButtonUI;
import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
        private static StudentRegistry instance;

        private StudentRegistry(){
            map = new HashMap<>();
        }


        //Sigleton Design Pattern - 1st Basic approach
        public static StudentRegistry getInstance(){
            if(instance == null){
                instance = new StudentRegistry();
            }
            return instance;
        }

        private Map<String, Student> map;

        public void register(String key, Student s){
            map.put(key, s);
        }

        public Student get(String key){
            return map.get(key);
        }

        

}
