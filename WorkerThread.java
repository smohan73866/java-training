import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class WorkerThread implements Runnable{
private String message;
public WorkerThread(String s){
this.message=s;
}
public void run(){
System.out.println(Thread.currentThread().getName()+"(Start)message="+message);
processmessage();
System.out.println(Thread.cuurentThread().getName()+"(End)");
}
private void processmessage(){
try{Thread.sleep(2000);}
catch(InterruptedException e){e.printStackTrace();}
}
}
