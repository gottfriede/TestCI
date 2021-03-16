
public class Cylinder extends RoundTable
{
    public Cylinder(double newR, double newHeight)
    {
        super(newR, newR, newHeight);
    }
    
    public void output()
    {
        System.out.println("2.1 " + super.getR1() + " " + super.getHeight());
    }
    
    public String getName()
    {
        return "2.1";
    }
}
