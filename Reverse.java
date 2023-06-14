import java.util.Scanner;
  class Reverse
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter a string : ");
String a=sc.nextLine(); 
 char b[]=a.toCharArray();
for(int i=b.length-1;i>=0;i--)
{
System.out.print(b[i]);
}
if(a==b[i])
{
System.out.println("polindrome");
}
else
{
System.out.println("not");
}
}
}