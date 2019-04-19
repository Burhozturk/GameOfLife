package sample;

public class Cell
{
    private int livingNeighbours;
    private boolean alive;

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



}
