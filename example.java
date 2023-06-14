
import java.util.Scanner;
class example
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter an integer");
int i=sc.nextInt();
System.out.println("Enter an integer");
int j=sc.nextInt();
if(i>j)
 System.out.println("The max value is \t"+i);
else
 System.out.println("The max value is \t"+j);
}
}