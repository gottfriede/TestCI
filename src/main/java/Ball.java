
public class Ball extends Geometry
{
    private double radius;
    
    public Ball(double newRadius)
    {
        this.radius = newRadius;
    }
    
    public void setRadius(double newRadius)
    {
        this.radius = newRadius;
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    public double getVolume()
    {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }
    
    public void output()
    {
        System.out.println("3 " + radius);
    }
    
    public String getName()
    {
        return "3";
    }
}
