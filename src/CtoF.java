import java.util.Scanner;

public class CtoF
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        double fahrenheit = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("Enter the temp in Celsius: ");
            if (in.hasNextDouble())
            {
                celsius = in.nextDouble();
                fahrenheit = (celsius * 9/5) + 32;
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + " which is not a valid temperature");
            }
        }while(!done);
        System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit");
    }
}
