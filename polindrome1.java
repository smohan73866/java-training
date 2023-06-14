import java.util.Scanner;
class polindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
char b[]=a.toCharArray();
for(int i=b.length-1;i>=0;i--)
{
System.out.print(b[i]);
}
}
}