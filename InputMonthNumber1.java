import java.util.Scanner;
class InputMonthNumber1{

public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int mn;
mn=scob.nextInt();
switch(mn){
case 0:System.out.println("JAN");break;
case 1:System.out.println("FEB");break;
case 2:System.out.println("MAR");break;
case 3:System.out.println("APR");break;
case 4:System.out.println("MAY");break;
case 5:System.out.println("JUN");break;
case 6:System.out.println("JUL");break;
case 7:System.out.println("AUG");break;
case 8:System.out.println("SEP");break;
case 9:System.out.println("OCT");break;
case 10:System.out.println("NOV");break;
case 11:System.out.println("DEC");break;
default:System.out.println("INVALID");
}//switch
}//main()
}//INputDayNumber