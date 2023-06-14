import java.io.*;
class FileRead1 {
public static void main(String args[])throws Exception{
fileReader fr=new FileReader("C:\\fh\\demo.txt");
BufferedReader br=new BufferReader(fr);
int i;
while((i=br.read())!=-1){  System.out.print((char)i);}
br.close();
fr.close();
}
}