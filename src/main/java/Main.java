
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main
{
    public static void getMax(int index, int op,
            ArrayList<HashSet<Geometry>> list)
    {
        if (op == 1 || op == 2)
        {
            if (list.get(index).isEmpty())
            {
                System.out.println("Sorry, the set is empty!");
                return;
            }
            double maxVolume = 0;
            Geometry maxGeometry = new Geometry();
            for (Geometry k : list.get(index))
            {
                if (k.getVolume() >= maxVolume)
                {
                    maxVolume = k.getVolume();
                    maxGeometry = k;
                }
            }
            if (op == 1)
            {
                System.out.println(maxVolume);
            }
            if (op == 2)
            {
                maxGeometry.output();
            }
        }
        if (op == 3)
        {
            double ansVolume = 0;
            for (Geometry k : list.get(index))
            {
                ansVolume += k.getVolume();
            }
            System.out.println(ansVolume);
        }
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<HashSet<Geometry>> list = new ArrayList<>();
        ShapeFactory shapefactory = new ShapeFactory();
        int n = in.nextInt();
        int m = in.nextInt();
        for (int i = 0; i <= n; i++)
        {
            HashSet<Geometry> emptySet = new HashSet<>();
            list.add(emptySet);
        }
        for (int i = 1; i <= m; i++)
        {
            int op = in.nextInt();
            if (op == 4)
            {
                int index = in.nextInt();
                String name = in.next();
                list.get(index).add(shapefactory.getShape(name,in));
            }
            if (op == 1 || op == 2 || op == 3)
            {
                int index = in.nextInt();
                getMax(index, op, list);
            }
            if (op == 5)
            {
                int j = in.nextInt();
                int k = in.nextInt();
                HashSet<Geometry> newSet = new HashSet<>();
                newSet.addAll(list.get(j));
                newSet.addAll(list.get(k));
                list.add(newSet);
            }
        }
    }
}
