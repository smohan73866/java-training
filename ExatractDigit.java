import jav.util.Scanner;
class ExtarctDigit{
public static void main(String args[]){
Scanner sc=new Scanner(Sytsem.in);
String strobj=sc.nextline();
String res="";
for(int i=0;i<strobj.Length()-1;i++)
{
if(strobj.charAt(i)>='0'&&strobj.charAt(i)<='9')
{res=res+strobj.charAt(i);}
}
System.out.print(res);
}
}

