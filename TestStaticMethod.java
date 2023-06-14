class Student{
int rollno;
String name;
static String college="ITS";
static void change(){
college="A.M.REDDY";
}
Student(int r,String n){
rollno=r;
name=n;
}
void display(){System.out.println(rollno+" "+name+" "+college);}
}
public class TestStaticMethod{
public static void main(String args[]){
Student s1=new Student(1,"meh");
Student s2=new Student(2,"thiru");
Student s3=new Student(3,"chakri");
s1.display();
s2.display();
s3.display();
}
}
