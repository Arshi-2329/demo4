class Employee{
int eid;
String name;
String dept;
void insertRecord(int e,String n,String d){
eid=e;
name=n;
dept=d;
}
void displayinformation(){System.out.println(eid+""+name+ ""+dept);
}}
class TestEmployee4{
public static void main(String args[]){
Employee e1=new Employee();
Employee e2=new Employee();
Employee e3=new Employee();
e1.insertRecord(111,"arshi","cse");
e2.insertRecord(222,"hannu","cse");
e3.insertRecord(223,"shalu","cse");
e1.displayinformation();
e2.displayinformation();
e3.displayinformation();
}
}
