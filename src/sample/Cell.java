package sample;

import java.awt.*;

public class Cell
{
    private int livingNeighbours;
    private boolean alive;

    public static final int SIZE=10;
    private int x;
    private int y;

    public void update()
    {
        if(livingNeighbours==3)
        {
            alive=true;
        }
        if(livingNeighbours==2 || livingNeighbours==3)
        {
            alive=true;
        }
        else if(livingNeighbours<2||livingNeighbours>3)
        {
           alive=false;
        }

    }

    public int getLivingNeighbours()
    {
        return livingNeighbours;
    }

    public void setLivingNeighbours(int livingNeighbours)
    {
        this.livingNeighbours = livingNeighbours;
    }

    public boolean isAlive()
    {
        return alive;
    }

    public void setAlive(boolean alive)
    {
        this.alive = alive;
    }

    public Cell(int x,int y,boolean alive)
    {
        this.x=x;
        this.y=y;
        this.alive=alive;
    }

    public Cell()
    {

    }

    public void draw(Graphics g)
    {
        if(alive)
        {
            g.fillRect(x*SIZE,y*SIZE,SIZE,SIZE);
        }
    }



}
