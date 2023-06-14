import java.util.List;
import java.util.LinkedList;
class Main{
public static void main(String args[]){
List<String>animals=new LinkedList<>();
animals.add("Cow");
animals.add("Cat");
animals.add("Dog");
System.out.println("ArrayList:"+animals);
 

System.out.println("Accessing individual elements:");

for(String temp:animals){
System.out.println(temp);
}
}
}