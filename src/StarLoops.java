public class StarLoops
{
    public static void main(String[] args)
    {

        for (int r = 1; r <= 5; r++)
        {
            for (int c = 1; c <= r; c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int r = 5; r >= 1; r--)
        {
            for (int c = 1; c <= r; c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int r = 5; r >= 1; r--)
        {
            for (int c = 1; c <= 5; c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();


        //EXTRA CREDIT
        for (int r = 1; r <= 3; r++)
        {
            for (int c = 1; c <= 20; c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int r = 1; r <= 15; r++)
        {
            for (int c = 1; c <= 5; c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int r = 1; r <= 3; r++)
        {
            for (int c = 1; c <= 20; c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
