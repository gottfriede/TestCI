
import java.util.Scanner;

public class ShapeFactory
{
    public Geometry getShape(String name,Scanner in)
    {
        switch (name)
        {
            case "1":
                double newAX = in.nextDouble();
                double newBX = in.nextDouble();
                double newBY = in.nextDouble();
                double newCX = in.nextDouble();
                double newCY = in.nextDouble();
                double newCZ = in.nextDouble();
                return new Parallelepiped(newAX, newBX, newBY,
                        newCX, newCY, newCZ);
            case "1.1":
            {
                double newA = in.nextDouble();
                double newB = in.nextDouble();
                double newC = in.nextDouble();
                return new Cuboid(newA, newB, newC);
            }
            case "1.1.1":
            {
                double newA = in.nextDouble();
                return new Cube(newA);
            }
            case "2":
            {
                double newR1 = in.nextDouble();
                double newR2 = in.nextDouble();
                double newHeight = in.nextDouble();
                return new RoundTable(newR1, newR2, newHeight);
            }
            case "2.1":
            {
                double newR = in.nextDouble();
                double newHeight = in.nextDouble();
                return new Cylinder(newR, newHeight);
            }
            case "2.2":
            {
                double newR = in.nextDouble();
                double newHeight = in.nextDouble();
                return new Cone(newR, newHeight);
            }
            case "3":
            {
                double newR = in.nextDouble();
                return new Ball(newR);
            }
            default:
                return null;
        }
    }
}
