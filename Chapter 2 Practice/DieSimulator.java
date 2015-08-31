import java.util.Random;

public class DieSimulator
{
    public static void main( String[] args )
    {
        Random die = new Random();
        int d = die.nextInt(6);
        System.out.println(d);
    }
}
        