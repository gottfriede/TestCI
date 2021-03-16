
public class RoundTable extends Geometry
{
    private double r1;
    private double r2;
    private double height;
    
    public RoundTable(double newR1, double newR2, double newHeight)
    {
        this.r1 = newR1;
        this.r2 = newR2;
        this.height = newHeight;
    }
    
    public void setR1(double newR1)
    {
        this.r1 = newR1;
    }
    
    public void setR2(double newR2)
    {
        this.r2 = newR2;
    }
    
    public void setHeight(double newHeight)
    {
        this.height = newHeight;
    }
    
    public double getR1()
    {
        return r1;
    }
    
    public double getR2()
    {
        return r2;
    }
    
    public double getHeight()
    {
        return height;
    }
    
    public double getVolume()
    {
        return Math.PI * height * (r1 * r1 + r2 * r2 + r1 * r2) / 3.0;
    }
    
    public void output()
    {
        System.out.println("2 " + r1 + " " + r2 + " " + height);
    }
    
    public String getName()
    {
        return "2";
    }
}
