// import java.util.*;
import java.util.Scanner;
import java.util.*;
class Student{
    String name;
    String[] courses;
//***** Define constructor(s) here
    public Student(String n, String[] c) {
        name = n;
        courses = c;
    }
    public Student(Student s) {
        name = s.name;
        this.courses=new String[s.courses.length];
        for (int i = 0; i < s.courses.length; i++) {
            this.courses[i] = s.courses[i];
        }
    }
    public void setName(String n) {
        name = n;
    }
    public void setCourses(int indx, String c) {
          courses[indx] = c;
    }
    public String getName() {
        return name;
    }
    public String getCourses(int indx) {
        return courses[indx];
    }
}
public class Admission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] courses = {"Maths", "DL","DSA","DC"};
        Student s1 = new Student("Nandu", courses);
        Student s2 = new Student(s1);
        s2.setName(sc.next());
        s2.setCourses(1,sc.next());
        System.out.println(s1.getName() + ": "+ s1.getCourses(1));
        System.out.println(s2.getName() + ": " + s2.getCourses(1));
    }
}
