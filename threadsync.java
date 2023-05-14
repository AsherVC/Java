class threadsync{
    int count;
    public synchronized void increment(){
        count++;
    }
    public static void main(String[] args){
        threadsync t=new threadsync();
        t.sthread();
    }

    public void sthread(){
        Thread th1=new Thread(new Runnable(){
                public void run(){
                for(int i=0;i<5000;i++){
                    increment();
                }
            }
        });
        Thread th2=new Thread(new Runnable(){
            public void run(){
                 for(int i=0;i<1000;i++){
                        increment();
                 }
             }
        });
        th1.start();
        th2.start();
       try{
            th1.join();
        }
        catch (InterruptedException e){}
       /*try{
            th2.join();
        }
        catch (InterruptedException e){} */ 
        System.out.print("Count "+count);
    }
}