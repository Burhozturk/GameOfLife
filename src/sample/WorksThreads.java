package sample;

public class WorksThreads implements Runnable
{
    private String opgave;
    private int ventetid;

    public WorksThreads(String n,int t)
    {
        opgave=n;
        ventetid=t;
    }

    @Override
    public void run()
    {
        for (int i=0; i<5; i++)
        {
            System.out.println(opgave+": bla bla bla "+i);
            try {  Thread.sleep(ventetid); } catch (Exception e) {} // vent lidt
        }


    }
}
