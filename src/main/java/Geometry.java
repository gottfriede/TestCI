
public class Geometry
{
    public double getVolume()
    {
        return 0.0;
    }
    
    public void output()
    {
    }
    
    public String getName()
    {
        return "";
    }
    
    public double getAX()
    {
        return 0;
    }
    
    public double getBX()
    {
        return 0;
    }
    
    public double getBY()
    {
        return 0;
    }
    
    public double getCX()
    {
        return 0;
    }
    
    public double getCY()
    {
        return 0;
    }
    
    public double getCZ()
    {
        return 0;
    }
    
    public double getR1()
    {
        return 0;
    }
    
    public double getR2()
    {
        return 0;
    }
    
    public double getHeight()
    {
        return 0;
    }
    
    public double getRadius()
    {
        return 0;
    }
    
    @Override
    public int hashCode()
    {
        return 1;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if (!(obj instanceof Geometry))
        {
            return false;
        }
        Geometry a = (Geometry) obj;
        if (this.getName().equals(a.getName()))
        {
            switch (this.getName())
            {
                case "1":
                    return (this.getAX() == a.getAX()) &&
                            (this.getBX() == a.getBX()) &&
                            (this.getBY() == a.getBY()) &&
                            (this.getCX() == a.getCX()) &&
                            (this.getCY() == a.getCY()) &&
                            (this.getCZ() == a.getCZ());
                case "1.1":
                    return (this.getAX() == a.getAX()) &&
                            (this.getBY() == a.getBY()) &&
                            (this.getCZ() == a.getCZ());
                case "1.1.1":
                    return this.getAX() == a.getAX();
                case "2":
                    return (this.getR1() == a.getR1()) &&
                            (this.getR2() == a.getR2()) &&
                            (this.getHeight() == a.getHeight());
                case "2.1":
                case "2.2":
                    return (this.getR1() == a.getR1()) &&
                            (this.getHeight() == a.getHeight());
                case "3":
                    return this.getRadius() == a.getRadius();
                default:
                    return false;
            }
        }
        return false;
    }
}
