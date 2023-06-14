import java.util.Scanner;
public class polindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int temp=sc.nextInt();
int sum=0;
while(a>0)
{
b=a%10;
sum=(sum*10)+b;
a=a/10;
}
System.out.println(sum);
}
}
