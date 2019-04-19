package sample;

import javafx.animation.Timeline;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Game
{
    //Celler to dimensional array
    public int cells[][]=;
    Cell newCell=new Cell();
    Timeline timeline=new Timeline();
    int countDown=10000;
    Random rand = new Random();
    int n = rand.nextInt(1);
    WorksThreads p=new WorksThreads("Opgave1",1000);
    WorksThreads a=new WorksThreads("Opgave2",1000);
    public Game()
    {
        t.start();
        q.start();
    }

    public void fillCells()
    {
        cells[0][0]=0;
        cells[0][1]=1;
        cells[1][0]=0;
        cells[1][1]=1;
    }

    public void startTimer()
    {
        timeline.setCycleCount(100);
        timeline.play();
        update();
        draw();
    }

    public void stopTimer()
    {
        timeline.stop();
    }



    public void draw()
    {
        for(int a=0;a<cells[0].length;a++)
        {
            for(int b=0;a<cells.length;b++)
            {




            }

        }



    }


    public void update()
    {
        fillCells();
        for(int a=0;a<cells[0].length;a++)
        {
            for(int b=0;a<cells.length;b++)
            {
                newCell.setLivingNeighbours(n);
                newCell.update();

            }

        }

    }

    Thread t=new Thread(p);
    Thread q=new Thread(a);

}
