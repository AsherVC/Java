import java.util.*;
class mult3thread{
    public static void main(String[] args) /*throws InterruptedException*/{
    thread1 th1=new thread1();
    th1.start();
    }
}
class thread1 extends Thread{
    public void run(){
    for(int i=0;i<=10;i++){
        Random n=new Random();
        int a=n.nextInt(10);
        if(a%2==0){
            thread2 th2=new thread2();
            th2.run(a);
        }
        else if(a%2==1){
            thread3 th3=new thread3();
            th3.run(a);
        }
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){}
        }
    }   
}

class thread2 extends Thread{
    public void run(int a){
        int sq=a*a;
        System.out.println("Square of "+a+" = "+sq);
    }
}
class thread3 extends Thread{
    public void run(int a){
        int cb=a*a*a;
        System.out.println("cube of "+a+" = "+cb);
    }
}