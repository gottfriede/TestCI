
public class Cuboid extends Parallelepiped
{
    public Cuboid(double ax, double by, double cz)
    {
        super(ax, 0, by, 0, 0, cz);
    }
    
    public void output()
    {
        System.out.println("1.1 " + super.getAX() + " " + super.getBY()
                + " " + super.getCZ());
    }
    
    public String getName()
    {
        return "1.1";
    }
}
