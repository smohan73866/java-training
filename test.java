import java.util.Scanner;
class test{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
for( int i=1;i>=a;i--)
{for(int j=1;j>=a;j--)
{
if((i+j)>6)
{
System.out.print("#");
}}
System.out.println("\n");
}
}
}
