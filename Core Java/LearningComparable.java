import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students implements Comparable<Students>
{
        // @Override
        public int compareTo(Students that) {
            // TODO Auto-generated method stub
            if(this.age > that.age )return 1;
            else return -1;
        }
        String name;
        int age;
        public Students(String name, int age) {
            this.name = name;
            this.age = age;
        }
        @Override
        public String toString() {
            return "Students [name=" + name + ", age=" + age + "]";
        }
    
        
    }
    
public class LearningComparable {
    public static void main(String[] args) {
        
        List<Students> stud = new ArrayList<>();
            stud.add(new Students("kshitij",20));
            stud.add(new Students("Itachi",25));
            stud.add(new Students("Saitama",24));
            stud.add(new Students("Kira",22));
            // Collections.sort(stud,AgeWise);
            Collections.sort(stud);
            System.out.println(stud);
            

        
    }
}