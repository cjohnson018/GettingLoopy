
public class CountingLoops
{
    public static void main(String[] args)
    {
        for (int r = 0; r <= 30; r++)
        {
            System.out.print(r + " ");
        }
        System.out.println();
        for (int r = 30; r >= 0; r--)
        {
            System.out.print(r + " ");
        }
        System.out.println();
        for (int r = 0; r <= 18; r+=3)
        {
            System.out.print(r + " ");
        }
        System.out.println();
        for (int r = 10; r >= 0; r-=2)
        {
            System.out.print(r + " ");
        }
    }
}