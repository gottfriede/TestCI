
public class Parallelepiped extends Geometry
{
    private double ax;
    private double bx;
    private double by;
    private double cx;
    private double cy;
    private double cz;
    
    public Parallelepiped(double ax, double bx, double by,
            double cx, double cy, double cz)
    {
        this.ax = ax;
        this.bx = bx;
        this.by = by;
        this.cx = cx;
        this.cy = cy;
        this.cz = cz;
    }
    
    public void setAX(double newAX)
    {
        ax = newAX;
    }
    
    public void setBX(double newBX)
    {
        bx = newBX;
    }
    
    public void setBY(double newBY)
    {
        by = newBY;
    }
    
    public void setCX(double newCX)
    {
        cx = newCX;
    }
    
    public void setCY(double newCY)
    {
        cy = newCY;
    }
    
    public void setCZ(double newCZ)
    {
        cz = newCZ;
    }
    
    public double getAX()
    {
        return ax;
    }
    
    public double getBX()
    {
        return bx;
    }
    
    public double getBY()
    {
        return by;
    }
    
    public double getCX()
    {
        return cx;
    }
    
    public double getCY()
    {
        return cy;
    }
    
    public double getCZ()
    {
        return cz;
    }
    
    public double getVolume()
    {
        return ax * by * cz;
    }
    
    public void output()
    {
        System.out.println("1 " + ax + " " + bx + " " + by
                + " " + cx + " " + cy + " " + cz);
    }
    
    public String getName()
    {
        return "1";
    }
}
