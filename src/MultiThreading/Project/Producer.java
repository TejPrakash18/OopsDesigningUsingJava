package MultiThreading.Project;

class Producer extends Thread
{

    Company c;
    Producer(Company c)
    {
        this.c=c;
    }
    public void run()
    {
        int i=1;
        while(i<=10)
        {
            try {
                this.c.produce_item(i);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try{Thread.sleep(1000);}catch(Exception e){}
            i++;
        }
    }
}