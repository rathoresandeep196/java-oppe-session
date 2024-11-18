import java.util.*;
class Person{
    private String name;
    public Person(String n){
        name=n;
    }
    public void show(){
        System.out.print(name + " ");
    }
}

// define class Employee
class Employee extends Person{
    private double salary;
    public Employee(String n, double s){
        super(n);
        salary=s;
    }
    public void show(){
        super.show();
        System.out.println(salary);
    }               
}
// define class Student
class Student extends Person{
    private int rollno;
    public Student(String n, int r){
        super(n);
        rollno=r;
    }
    public void show(){
        super.show();
        System.out.println(rollno);
    }
}



public class TClass {
    public static void printAll(List<? extends Person> lp){
        for(Person p:lp){
            p.show();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Person> lp=new ArrayList<Person>();
        List<Employee> le=new ArrayList<Employee>();
        List<Student> ls=new ArrayList<Student>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int t=sc.nextInt();
            String s1=sc.next();
            if(t==2){
                double s2=sc.nextDouble();
                le.add(new Employee(s1,s2));
            }
            else if(t==3){
                int s3 =sc.nextInt();
                ls.add(new Student(s1,s3));
            }
            else{
                lp.add(new Person(s1));
            }
        }
        printAll(lp);
        System.out.println();
        printAll(le);
        System.out.println();
        printAll(ls);   



    }

    
}
