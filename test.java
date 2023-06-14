import java.util.Scanner;
class Test{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int p=1;
while(a>0)
{
p=p*(a%10);
a=a/10;
}
System.out.println(p);
}
}
