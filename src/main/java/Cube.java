
public class Cube extends Cuboid
{
    public Cube(double ax)
    {
        super(ax, ax, ax);
    }
    
    public void output()
    {
        System.out.println("1.1.1 " + super.getAX());
    }
    
    public String getName()
    {
        return "1.1.1";
    }
}
