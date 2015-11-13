import java.util.Scanner;

/**
 * Created by roije on 11/11/2015.
 */
public class VikaTedf
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Hey");
        System.out.println("Hadji");

        Hadji hadji = new Hadji();
        System.out.println("fdg");
        System.out.println("fdg");
        System.out.print("Is Hadji in school? ");
        String answer = input.next();
        if (answer.equals("Yes"))
        {
            hadji.setInSchool(true);
        }
        else if(answer.equals("No"))
        {
            hadji.setInSchool(false);
        }

        if (hadji.isInSchool())
        {
            System.out.println("Hadji power");
        }
        else
        {
            System.out.println("Wtf Hadji");
        }

        //du får ikke java sql connector??



        //Hey
    }
}
