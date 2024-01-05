class Employee{
int rollno;
String name;
String dept;
void insertRecord(int r,String n){
rollno=r;
name=n;
dept=d;
}
void displayinformation(){System.out.println(rollno+""+name+dept);
}}
class TestEmployee4{
public static void main(String args[]){
Employee e1=new Employee();
Employee e2=new Employee();
Employee e3=new Employee();
e1.insertRecord(111,"arshi");
e2.insertRecord(222,"hannu");
e3.insertRecord(223,"shalu");
e1.displayinformation();
e2.displayinformation();
e3.displayinformation();
}
}
