import java.util.Scanner;
class Pattern4
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int row=sc.nextInt();
int x,y;
if(row%2==0){
x=y=(row/2);
}
else{
x=row/2;
y=(row/2)+1;
}
printpattern(ch,x);
printReverse(ch,y);
}
public static void printReverse(char c,int n){
for(int i=n;i>=1;i--){
printLine(c,i);
}
}
public static void printpattern(char c,int n){
for(int i=1;i<=n;i++){
printLine(c,i);
}
}
public static void printLine(char c,int n){
System.out.println();
for(int i=1;i<=n;i++){System.out.print(c);}
}
}



