class First implements Runnable{
Thread t;
First(){
t=new Thread(this,"NEW");
System.out.println("CHILD:"+t);
t.start();
}
public static void run(){
try{for(int i=5;i>0;i--){
System.out.println("CHILD:"+i);
Thread.sleep(500);}
}
System.out.println("EXITING CHILD");
}
}