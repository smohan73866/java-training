import java.util.Scanner;
class test{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int sum=0;
int temp=a;
while(a>0)
{
b=b%10;
sum=sum*10+b;
a=a/10;
}
if(temp==sum)
{
System.out.print("yes");
}
else
{
System.out.print("No");
}
}}