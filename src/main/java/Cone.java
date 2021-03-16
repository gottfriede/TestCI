
public class Cone extends RoundTable
{
    public Cone(double newR1, double newHeight)
    {
        super(newR1, 0, newHeight);
    }
    
    public void output()
    {
        System.out.println("2.2 " + super.getR1() + " " + super.getHeight());
    }
    
    public String getName()
    {
        return "2.2";
    }
}
