 public class MulNumbers
{
public static void main(String args[])
{
int result=1;
for(int i=1;i<=5;i++)
{
System.out.print(i);
result=result*i;
if(i<5)
System.out.print("*");
}
System.out.print("="+result);
}
}
