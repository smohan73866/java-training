import java.io.CharArrayReader;
public class CharArrayExample{
public static void main(String args[])throws Exception{
char[] ary={'j','a','v','a','t','p','o','i','n','t'};
CharArrayReader reader=new CharArrayReader(ary);
int K=0;
while((K=reader.read())!=-1){
char ch=(char)K;
System.out.print(ch+ ":");
System.out.println(K);
}
}
}