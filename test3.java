import java.util.Scanner;
class Test{

public static void main(String args[]){
Scanner scob=new Scanner(System.in);
char c=scob.next().charAt(0);

if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
System.out.println("it is vowel");
if(c>'0')
 System.out.println("it is consonent");
else
System.out.println("it is a digit")
}
}
