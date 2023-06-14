import java.util.Scanner;
class polindrome{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String strobj=sc.nextLine();
String rev="";
for(int i=strobj.length()-1;i>=0;i--){
rev=rev+strobj.charAt(i);}
if(strobj.equals(rev))
{
System.out.println("yes");
}
else
{
System.out.println("no");
}
}
}
