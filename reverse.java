import java.util.Scanner;
class reverse{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int rev=0;
while(a!=0)
{
b=b%10;
rev=rev*10+b;
a=a/10;
}
System.out.println(rev);
}
}