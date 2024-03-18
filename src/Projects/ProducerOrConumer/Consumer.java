package Projects.ProducerOrConumer;

class Consumer extends Thread{
    Company c;
    Consumer(Company c)
    {
        this.c=c;
    }

    public void run()
    {
        int i=1;
        while(i<=15)
        {
            try {
                this.c.consume_item();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try{Thread.sleep(2000);}catch(Exception e){}
        }
    }
}
