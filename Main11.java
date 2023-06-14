import java.util.List;
import java.util.ArrayList;
class Main{
public static void main(String args[]){
List<String>languages=new ArrayList<>();
languages.add("java");
languages.add("C++");
System.out.println("ArrayList:"+languages);
 languages.set(2,"JavaScript");
System.out.println("Modified ArrayList:"+languages);
}
}